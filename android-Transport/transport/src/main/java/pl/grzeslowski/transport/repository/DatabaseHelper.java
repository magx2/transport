package pl.grzeslowski.transport.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.misc.TransactionManager;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.ConnectionCity;
import pl.grzeslowski.transport.model.ConnectionMark;
import pl.grzeslowski.transport.model.Provider;

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
                TransactionManager.callInTransaction(connectionSource, new Callable<Void>() {
                    public Void call() throws Exception {
                        dropTables(DatabaseHelper.this.connectionSource);
                        createTablesIfNotExists(DatabaseHelper.this.connectionSource);

                        // city
                        for (City city : DatabasePrePopulater.CITIES) {
                            mCityDao.create(city);
                        }

                        // provider
                        for (Provider provider : DatabasePrePopulater.PROVIDERS) {
                            mProviderDao.create(provider);
                        }

                        // connections
                        for (Connection connection : DatabasePrePopulater.getConnections()) {
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
        TableUtils.createTableIfNotExists(connectionSource, City.class);
        TableUtils.createTableIfNotExists(connectionSource, Connection.class);
        TableUtils.createTableIfNotExists(connectionSource, ConnectionMark.class);
        TableUtils.createTableIfNotExists(connectionSource, Provider.class);
        TableUtils.createTableIfNotExists(connectionSource, ConnectionCity.class);
    }

    private void dropTables(ConnectionSource connectionSource) throws SQLException {
        TableUtils.dropTable(connectionSource, City.class, true);
        TableUtils.dropTable(connectionSource, Connection.class, true);
        TableUtils.dropTable(connectionSource, ConnectionMark.class, true);
        TableUtils.dropTable(connectionSource, Provider.class, true);
        TableUtils.dropTable(connectionSource, ConnectionCity.class, true);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        // do nothing...
    }

    public List<City> getCities() {
        return mCityDao.queryForAll();
    }

    public Collection<Connection> getAllConnections() {
        try {
            final List<Connection> connections = mConnectionDao.queryForAll();

            setPathForConnection(connections);

            return connections;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void setPathForConnection(Iterable<Connection> connections) throws SQLException {
        for (Connection connection : connections) {
            final QueryBuilder<ConnectionCity, Integer> queryBuilder = mConnectionCityDao.queryBuilder();
            queryBuilder.where().eq(ConnectionCity.CONNECTION, connection).prepare();

            final List<ConnectionCity> citiesForConnection = mConnectionCityDao.query(queryBuilder.prepare());
            final List<City> path = Lists.transform(citiesForConnection, new Function<ConnectionCity, City>() {
                @Override
                public City apply(ConnectionCity input) {
                    return input.getCity();
                }
            });

            connection.setPath(path);
        }
    }

    public Collection<Connection> getAllConnections(City from, City to) {
        try {
            Log.d(getClass().getSimpleName(), String.format("Starting getting Connections for Cities (%s) (%s)", from, to));

            final QueryBuilder<ConnectionCity, Integer> ccQueryBuilder = mConnectionCityDao.queryBuilder();
            ccQueryBuilder.where().eq(ConnectionCity.CITY, from).or().eq(ConnectionCity.CITY, to);
            ccQueryBuilder.orderBy(ConnectionCity.NUMBER, true);

            final QueryBuilder<Connection, Integer> connectionQueryBuilder = mConnectionDao.queryBuilder();
            final List<Connection> connections = connectionQueryBuilder.join(ccQueryBuilder).distinct().query();

            setPathForConnection(connections);

            Log.d(getClass().getSimpleName(), String.format("Got connections (%s)", connections.size()));

            return  connections;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Provider> getAllProviders() {
        return mProviderDao.queryForAll();
    }
}
