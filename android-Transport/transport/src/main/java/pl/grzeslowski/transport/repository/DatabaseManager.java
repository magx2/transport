package pl.grzeslowski.transport.repository;

import android.content.Context;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import org.androidannotations.annotations.EBean;

import java.util.List;

import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;

@EBean(scope = EBean.Scope.Singleton)
public class DatabaseManager {

    private DatabaseHelper mDatabaseHelper;

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
        return mDatabaseHelper.getAllConnections(from, to);
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

}
