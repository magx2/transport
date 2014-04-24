package pl.grzeslowski.transport.repository;

import org.joda.time.LocalTime;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.ConnectionMark;
import pl.grzeslowski.transport.model.Provider;

public class DatabasePrePopulater {

    private static List<City> sCities = Arrays.asList(
            new City("Swidnica"),
            new City("Wrocław"),
            new City("Wałbrzych"),
            new City("Swiebodzice"),
            new City("Mokrzeszów"),
            new City("Pszennno"),
            new City("Marcinowice"),
            new City("Szczepanów"),
            new City("Strzelce"),
            new City("Tworzyjanów"),
            new City("Wonjnarowice"),
            new City("Gniechowice"),
            new City("Małuszów"),
            new City("Tyniec Mały")
    );

    private static List<Provider> sProviders = Arrays.asList(
            new Provider("P.W.H.D"),
            new Provider("Guliwer"),
            new Provider("PKP")
    );

    private static List<Connection> sConnections = Arrays.asList(

            // Sca - Wro
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(4, 25),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w niedzielę"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(5, 15),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(5, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(6, 15),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(6, 55),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(7, 25),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(7, 55),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(8, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(9, 20),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(9, 55),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(10, 30),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(11, 05),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(11, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(12, 10),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(12, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(13, 30),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(14, 05),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(14, 50),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(15, 30),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(16, 05),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(16, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(17, 05),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(17, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(18, 10),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(18, 50),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(19, 50),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(20, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(21, 15),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Kolejowa stanowiska 4, 5", "6", "4,5"
            ),

            // Wro - Sca
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(5, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w niedzielę")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(6, 30),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(6, 50),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(7, 25),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(8, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(9, 10),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(9, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(10, 10),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(10, 40),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(11, 05),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(12, 00),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(12, 30),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(13, 25),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(14, 00),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(14, 30),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(15, 20),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(15, 55),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(16, 10),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(17, 00),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(17, 30),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(18, 20),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(19, 05),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(19, 30),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(20, 00),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(20, 50),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(21, 25),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(21, 50),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(22, 25),
                    sProviders.get(0),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    "ul. Dawida", "6", "4,5"
            )
//            ,
//
//            new Connection(Arrays.asList(sCities.get(0), sCities.get(2)), getRandomLocalTime(), sProviders.get(1), "dworzec PKS", "6", "4,5"),
//            new Connection(Arrays.asList(sCities.get(2), sCities.get(3), sCities.get(4), sCities.get(0), sCities.get(5), sCities.get(6), sCities.get(7), sCities.get(8), sCities.get(9), sCities.get(10), sCities.get(11), sCities.get(12), sCities.get(13), sCities.get(1)), getRandomLocalTime(), sProviders.get(2), Arrays.asList(new ConnectionMark("nie kursuje w niedzielę"), new ConnectionMark("nie kursuje w wigilie i sylwestra")), "dwozec PKP", "6", "4,5"),
//
//            new Connection(Arrays.asList(sCities.get(1), sCities.get(0)), getRandomLocalTime(), sProviders.get(0), "pl. Dawida", "6", "4,5"),
//            new Connection(Arrays.asList(sCities.get(2), sCities.get(0)), getRandomLocalTime(), sProviders.get(1), "dworzec PKS", "6", "4,5"),
//            new Connection(Arrays.asList(sCities.get(1), sCities.get(2)), getRandomLocalTime(), sProviders.get(2), "dworzec PKP", "6", "4,5")
    );

    private static List<City> getWroScaPwhd() {
        List<City> path = getScaWroPwhd();
        Collections.reverse(path);

        return path;
    }

    private static List<City> getScaWroPwhd() {
        return Arrays.asList(sCities.get(0), sCities.get(5), sCities.get(6), sCities.get(7), sCities.get(8), sCities.get(9), sCities.get(10), sCities.get(11), sCities.get(12), sCities.get(13), sCities.get(1));
    }


    public void populate(DatabaseHelper databaseHelper) {

    }
}
