package pl.grzeslowski.transport.repository;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import org.androidannotations.annotations.EBean;
import org.joda.time.LocalTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.ConnectionMark;
import pl.grzeslowski.transport.model.Provider;

/**
 * Created by Martin on 2014-04-17.
 */
@EBean
public class DatabaseManager {

    private static List<City> sCities = Arrays.asList(
            new City(1, "Swidnica"),
            new City(2, "Wrocław"),
            new City(3, "Wałbrzych"),
            new City(4, "Swiebodzice"),
            new City(5, "Mokrzeszów"),
            new City(6, "Pszennno"),
            new City(7, "Marcinowice"),
            new City(8, "Szczepanów"),
            new City(9, "Strzelce"),
            new City(10, "Tworzyjanów"),
            new City(11, "Wonjnarowice"),
            new City(12, "Gniechowice"),
            new City(13, "Małuszów"),
            new City(14, "Tyniec Mały")
    );

    private static List<Provider> sProviders = Arrays.asList(new Provider(1, "P.W.H.D"), new Provider(2, "Guliwer"), new Provider(3, "PKP"));

    private static List<Connection> sConnections = Arrays.asList(
            new Connection(Arrays.asList(sCities.get(0), sCities.get(5), sCities.get(6), sCities.get(7), sCities.get(8), sCities.get(9), sCities.get(10), sCities.get(11), sCities.get(12), sCities.get(13), sCities.get(1)), getRandomLocalTime(), sProviders.get(0), Arrays.asList(new ConnectionMark("nie kursuje w niedzielę"), new ConnectionMark("nie kursuje w wigilie i sylwestra"), new ConnectionMark("nie kursuje w święta ustawowe "))),
            new Connection(Arrays.asList(sCities.get(0), sCities.get(2)), getRandomLocalTime(), sProviders.get(1)),
            new Connection(Arrays.asList(sCities.get(2), sCities.get(3), sCities.get(4), sCities.get(0), sCities.get(5), sCities.get(6), sCities.get(7), sCities.get(8), sCities.get(9), sCities.get(10), sCities.get(11), sCities.get(12), sCities.get(13), sCities.get(1)), getRandomLocalTime(), sProviders.get(2), Arrays.asList(new ConnectionMark("nie kursuje w niedzielę"), new ConnectionMark("nie kursuje w wigilie i sylwestra"))),

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
        Collection<Connection> filter = Collections2.filter(sConnections, new Predicate<Connection>() {
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
}
