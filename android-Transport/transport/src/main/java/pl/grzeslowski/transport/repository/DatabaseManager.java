package pl.grzeslowski.transport.repository;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;

/**
 * Created by Martin on 2014-04-17.
 */
@EBean
public class DatabaseManager {

    public List<City> getCities() {
        return Arrays.asList(new City(1, "Swidnica"), new City(2, "Wrocław"), new City(3, "Wałbrzych"));
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
        return new ArrayList<Connection>();
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
