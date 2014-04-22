package pl.grzeslowski.transport.repository;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import org.androidannotations.annotations.EBean;
import org.joda.time.LocalTime;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.Provider;

/**
 * Created by Martin on 2014-04-17.
 */
@EBean
public class DatabaseManager {

    private static List<City> sCities = Arrays.asList(new City(1, "Swidnica"), new City(2, "Wrocław"), new City(3, "Wałbrzych"));
    private static List<Provider> sProviders = Arrays.asList(new Provider(1, "P.W.H.D"), new Provider(2, "Guliwer"), new Provider(3, "Kolej wąskotorowa"));
    private static List<Connection> sConnections = Arrays.asList(
            new Connection(Arrays.asList(sCities.get(0), sCities.get(1)), getRandomLocalTime(), sProviders.get(0)),
            new Connection(Arrays.asList(sCities.get(0), sCities.get(2)), getRandomLocalTime(), sProviders.get(1)),
            new Connection(Arrays.asList(sCities.get(2), sCities.get(1)), getRandomLocalTime(), sProviders.get(2)),

            new Connection(Arrays.asList(sCities.get(1), sCities.get(0)), getRandomLocalTime(), sProviders.get(0)),
            new Connection(Arrays.asList(sCities.get(2), sCities.get(0)), getRandomLocalTime(), sProviders.get(1)),
            new Connection(Arrays.asList(sCities.get(1), sCities.get(2)), getRandomLocalTime(), sProviders.get(2))
    );
    private static LocalTime getRandomLocalTime() {
        Random random = new Random();
        return new LocalTime(random.nextInt(23), random.nextInt(59));
    }

    public List<City> getCities() {
        return sCities;
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
        return sConnections;
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
