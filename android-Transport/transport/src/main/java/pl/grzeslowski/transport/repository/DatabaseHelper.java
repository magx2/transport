package pl.grzeslowski.transport.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.ConnectionMark;
import pl.grzeslowski.transport.model.Provider;

class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private final Dao<City, Integer> mCityDao;
    private final Dao<Connection, Integer> mConnectionDao;
    private final Dao<ConnectionMark, Integer> mConnectionMarkDao;
    private final Dao<Provider, Integer> mProviderDao;

    public DatabaseHelper(final Context context) {
        super(context, BuildConfig.DATABASE_NAME, null, BuildConfig.DATABASE_VERSION);

        try {
            mCityDao = getDao(City.class);
            mConnectionDao = getDao(Connection.class);
            mConnectionMarkDao = getDao(ConnectionMark.class);
            mProviderDao = getDao(Provider.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, City.class);
            TableUtils.createTableIfNotExists(connectionSource, Connection.class);
            TableUtils.createTableIfNotExists(connectionSource, ConnectionMark.class);
            TableUtils.createTableIfNotExists(connectionSource, Provider.class);
        } catch (SQLException e) {
            throw new RuntimeException("Cannot create DB", e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        // do nothing...
    }

    public List<City> getCities() {
        try {
            return mCityDao.queryForAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Collection<Connection> getAllConnections() {
        try {
            return mConnectionDao.queryForAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
