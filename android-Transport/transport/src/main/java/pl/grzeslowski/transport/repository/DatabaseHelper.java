package pl.grzeslowski.transport.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.CloseableWrappedIterable;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.ConnectionCity;
import pl.grzeslowski.transport.model.ConnectionMark;
import pl.grzeslowski.transport.model.Provider;

import static com.j256.ormlite.misc.TransactionManager.callInTransaction;
import static com.j256.ormlite.table.TableUtils.createTableIfNotExists;
import static com.j256.ormlite.table.TableUtils.dropTable;
import static java.util.Collections.reverse;
import static pl.grzeslowski.transport.repository.DatabasePrePopulater.CITIES;
import static pl.grzeslowski.transport.repository.DatabasePrePopulater.PROVIDERS;
import static pl.grzeslowski.transport.repository.DatabasePrePopulater.getConnections;

class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private final RuntimeExceptionDao<City, Integer> mCityDao;
    private final RuntimeExceptionDao<Connection, Integer> mConnectionDao;
    private final RuntimeExceptionDao<ConnectionMark, Integer> mConnectionMarkDao;
    private final RuntimeExceptionDao<Provider, Integer> mProviderDao;
    private final RuntimeExceptionDao<ConnectionCity, Integer> mConnectionCityDao;

    public DatabaseHelper(final Context context) {
        super(context, BuildConfig.DATABASE_NAME, null, BuildConfig.DATABASE_VERSION);

        mCityDao = getRuntimeExceptionDao(City.class);
        mProviderDao = getRuntimeExceptionDao(Provider.class);
        mConnectionMarkDao = getRuntimeExceptionDao(ConnectionMark.class);
        mConnectionDao = getRuntimeExceptionDao(Connection.class);
        mConnectionCityDao = getRuntimeExceptionDao(ConnectionCity.class);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            createTablesIfNotExists(connectionSource);

            if (getAllConnections().isEmpty()) {
                callInTransaction(connectionSource, new Callable<Void>() {
                    public Void call() throws Exception {
                        dropTables(DatabaseHelper.this.connectionSource);
                        createTablesIfNotExists(DatabaseHelper.this.connectionSource);

                        // city
                        for (City city : CITIES) {
                            mCityDao.create(city);
                        }

                        // provider
                        for (Provider provider : PROVIDERS) {
                            mProviderDao.create(provider);
                        }

                        // connections
                        for (Connection connection : getConnections()) {
                            mConnectionDao.create(connection);

                            int i = 0;
                            for (City city : connection.getPath()) {
                                final ConnectionCity connectionCity = new ConnectionCity(connection, city, i++);

                                mConnectionCityDao.create(connectionCity);
                            }

                            // creating marks
                            for (ConnectionMark mark : connection.getMarks()) {
                                mConnectionMarkDao.create(mark);
                            }
                        }

                        return null;
                    }
                });
            }
        } catch (SQLException e) {
            throw new RuntimeException("Cannot create DB", e);
        }
    }

    private void createTablesIfNotExists(ConnectionSource connectionSource) throws SQLException {
        createTableIfNotExists(connectionSource, City.class);
        createTableIfNotExists(connectionSource, Connection.class);
        createTableIfNotExists(connectionSource, ConnectionMark.class);
        createTableIfNotExists(connectionSource, Provider.class);
        createTableIfNotExists(connectionSource, ConnectionCity.class);
    }

    private void dropTables(ConnectionSource connectionSource) throws SQLException {
        dropTable(connectionSource, City.class, true);
        dropTable(connectionSource, Connection.class, true);
        dropTable(connectionSource, ConnectionMark.class, true);
        dropTable(connectionSource, Provider.class, true);
        dropTable(connectionSource, ConnectionCity.class, true);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        // do nothing...
    }

    public List<City> getCities() {
        return mCityDao.queryForAll();
    }

    private Collection<Connection> getAllConnections() {
        final List<Connection> connections = mConnectionDao.queryForAll();

        return connections;
    }

    public List<Connection> getAllConnections(City from, City to) {
        try {
            final QueryBuilder<ConnectionCity, Integer> ccQueryBuilder = mConnectionCityDao.queryBuilder();
            ccQueryBuilder.where().eq(ConnectionCity.CITY, from).or().eq(ConnectionCity.CITY, to);

            final QueryBuilder<Connection, Integer> connectionQueryBuilder = mConnectionDao.queryBuilder();
            final List<Connection> connections = connectionQueryBuilder.join(ccQueryBuilder).distinct().query();

            return getConnectionsWithPath(connections, from, to);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Connection> getConnectionsWithPath(List<Connection> connections, City from, City to) throws SQLException {
        List<Connection> validConnections = new ArrayList<Connection>(connections.size());

        for (Connection connection : connections) {

            final QueryBuilder<ConnectionCity, Integer> queryBuilder = mConnectionCityDao.queryBuilder();
            final PreparedQuery<ConnectionCity> preparedQuery = queryBuilder.where().eq(ConnectionCity.CONNECTION, connection).prepare();

            final List<City> path = getPath(preparedQuery, from, to);
            if (path != null) {
                connection.setPath(path);
                validConnections.add(connection);
            }
        }

        return validConnections;
    }

    private List<City> getPath(PreparedQuery<ConnectionCity> preparedQuery, City from, City to) throws SQLException {
        final CloseableWrappedIterable<ConnectionCity> it = mConnectionCityDao.getWrappedIterable(preparedQuery);

        final List<City> path = new LinkedList<City>();
        boolean foundFrom = false;
        boolean foundTo = false;

        try {
            for (ConnectionCity connectionCity : it) {
                City next = connectionCity.getCity();

                if (!foundFrom) {
                    if (next.equals(from)) {
                        foundFrom = true;
                    } else if (next.equals(to)) {
                        return null;
                    }
                } else {
                    if (next.equals(to)) {
                        foundTo = true;
                    }
                }

                path.add(0, next);
            }
        } finally {
            it.close();
        }

        if (foundTo) {
            reverse(path);
            return path;
        } else {
            return null;
        }
    }

}
