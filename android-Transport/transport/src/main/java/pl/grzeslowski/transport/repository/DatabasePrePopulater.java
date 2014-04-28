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

    public static List<City> CITIES = Arrays.asList(
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

    public static List<Provider> PROVIDERS = Arrays.asList(
            new Provider("P.W.H.D"),
            new Provider("Guliwer"),
            new Provider("PKP")
    );

    private static String PWHD_WROCLAW_DEPARTURE = "ul. Dawida";
    private static String PWHD_SWIDNICA_DEPARTURE = "ul. Kolejowa stanowiska 4, 5";
    private static String PWHD_WALBRZYCH_DEPARTURE = "ul. Sikorskiego  (Teatr Dramatyczny)";

    private static final String PWHD_WALBRZYCH_NORMAL_PRICE = "10,50";
    private static final String PWHD_WALBRZYCH_STUDENT_PRICE = "00,00";
    public static List<Connection> CONNECTIONS = Arrays.asList(

            // Sca - Wro
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(4, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w niedzielę"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(5, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(5, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(6, 15),
                    getPwhd(),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(6, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(7, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(7, 55),
                    getPwhd(),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(8, 40),
                    getPwhd(),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(9, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(9, 55),
                    getPwhd(),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(10, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(11, 05),
                    getPwhd(),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(11, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(12, 10),
                    getPwhd(),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(12, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(13, 30),
                    getPwhd(),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(14, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(14, 50),
                    getPwhd(),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(15, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(16, 05),
                    getPwhd(),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(16, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(17, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(17, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(18, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(18, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(19, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(20, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getScaWroPwhd(),
                    new LocalTime(21, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, "6", "4,5"
            ),

            // Wro - Sca
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(5, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe"),
                            new ConnectionMark("nie kursuje w niedzielę")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(6, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(6, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(7, 25),
                    getPwhd(),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(8, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(9, 10),
                    getPwhd(),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(9, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(10, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(10, 40),
                    getPwhd(),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(11, 05),
                    getPwhd(),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(12, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(12, 30),
                    getPwhd(),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(13, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(14, 00),
                    getPwhd(),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(14, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(15, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(15, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(16, 10),
                    getPwhd(),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(17, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(17, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(18, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(19, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(19, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(20, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(20, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(21, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(21, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),
            new Connection(
                    getWroScaPwhd(),
                    new LocalTime(22, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                            new ConnectionMark("nie kursuje w święta ustawowe")
                    ),
                    PWHD_WROCLAW_DEPARTURE, "6", "4,5"
            ),


            // Wal - Wro
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(5, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Kursuje od poniedziałku do piątku oprócz świąt")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(6, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w święta ustawowe")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(7, 05),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(9, 10),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(10, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w święta ustawowe")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(13, 55),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(16, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w święta ustawowe")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(17, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(20, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w święta ustawowe"),
                            new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),

            // PWHD Wro - Wal
            new Connection(
                    getWroWalPwhd(),
                    new LocalTime(6, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w święta ustawowe")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWroWalPwhd(),
                    new LocalTime(8, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w święta ustawowe")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWroWalPwhd(),
                    new LocalTime(11, 05),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWroWalPwhd(),
                    new LocalTime(14, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w święta ustawowe")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWroWalPwhd(),
                    new LocalTime(15, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWroWalPwhd(),
                    new LocalTime(17, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w święta ustawowe"),
                            new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWroWalPwhd(),
                    new LocalTime(19, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            ),
            new Connection(
                    getWroWalPwhd(),
                    new LocalTime(20, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_NORMAL_PRICE, PWHD_WALBRZYCH_STUDENT_PRICE
            )
    );

    private static Provider getPwhd() {
        return PROVIDERS.get(0);
    }

    private static Provider getGuliwer() {
        return PROVIDERS.get(1);
    }

    private static List<City> getWroScaPwhd() {
        List<City> path = getScaWroPwhd();
        Collections.reverse(path);

        return path;
    }

    private static List<City> getScaWroPwhd() {
        return Arrays.asList(CITIES.get(0), CITIES.get(5), CITIES.get(6), CITIES.get(7), CITIES.get(8), CITIES.get(9), CITIES.get(10), CITIES.get(11), CITIES.get(12), CITIES.get(13), CITIES.get(1));
    }

    private static List<City> getWroWalPwhd() {
        List<City> path = getWalWroPwhd();
        Collections.reverse(path);

        return path;
    }

    private static List<City> getWalWroPwhd() {
        List<City> walSca = Arrays.asList(CITIES.get(2), CITIES.get(3), CITIES.get(4));
        walSca.addAll(getScaWroPwhd());
        return walSca;
    }
}
