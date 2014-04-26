package pl.grzeslowski.transport.repository;

import android.content.Context;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.Provider;

@EBean(scope = EBean.Scope.Singleton)
public class DatabaseManager {

    private final DatabaseHelper mDatabaseHelper;

    public DatabaseManager(Context context) {
        mDatabaseHelper = new DatabaseHelper(context);
    }

    public List<City> getCities() {
        return mDatabaseHelper.getCities();
    }

    public List<String> getCitiesNames() {
        return Lists.transform(getCities(), new Function<City, String>() {
            @Override
            public String apply(City input) {
                return input.getName();
            }
        });
    }

    public List<Connection> getConnections(final City from, final City to) {
        Collection<Connection> connection = mDatabaseHelper.getAllConnections();

        Collection<Connection> filter = Collections2.filter(connection, new Predicate<Connection>() {
            @Override
            public boolean apply(Connection input) {
                List<City> path = input.getPath();

                // TODO: ugly but dont have idea for better solution
                boolean foundFrom = false;
                for (City c : path) {
                    if (!foundFrom) {
                        if (c.equals(from)) {
                            foundFrom = true;
                        } else if (c.equals(to)) {
                            return false;
                        }
                    } else {
                        if (c.equals(to)) {
                            return true;
                        }
                    }
                }

                return false;
            }
        });
        return new ArrayList<Connection>(filter);
    }

    public City getCityByName(final String cityName) {
        Preconditions.checkNotNull(cityName);

        return Iterables.find(getCities(), new Predicate<City>() {
            @Override
            public boolean apply(City input) {
                return cityName.equals(input.getName());
            }
        });
    }

    public List<Provider> getAllProviders() {
        return mDatabaseHelper.getAllProviders();
    }

    public Collection<Connection> getAllConnections() {
        return mDatabaseHelper.getAllConnections();
    }
}
