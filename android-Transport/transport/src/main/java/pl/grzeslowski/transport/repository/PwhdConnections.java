package pl.grzeslowski.transport.repository;

import org.joda.time.LocalTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.ConnectionMark;

class PwhdConnections {
    private static String PWHD_WROCLAW_DEPARTURE = "ul. Dawida";
    private static String PWHD_SWIDNICA_DEPARTURE = "ul. Kolejowa stanowiska 4, 5";
    private static String PWHD_WALBRZYCH_DEPARTURE = "ul. Sikorskiego  (Teatr Dramatyczny)";

    private static final String PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE = "6,50";
    private static final String PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE = "4,50";

    private static final String PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE = "4,60";
    private static final String PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE = "???";

    private static final String PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE = "11,10";
    private static final String PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE = "9,10";

    private static List<City> getWroScaPwhdPath() {
        List<City> path = getScaWroPwhdPath();
        Collections.reverse(path);

        return path;
    }

    private static List<City> getScaWroPwhdPath() {
        return Arrays.asList(DatabasePrePopulater.CITIES.get(0), DatabasePrePopulater.CITIES.get(5), DatabasePrePopulater.CITIES.get(6), DatabasePrePopulater.CITIES.get(7), DatabasePrePopulater.CITIES.get(8), DatabasePrePopulater.CITIES.get(9), DatabasePrePopulater.CITIES.get(10), DatabasePrePopulater.CITIES.get(11), DatabasePrePopulater.CITIES.get(12), DatabasePrePopulater.CITIES.get(13), DatabasePrePopulater.CITIES.get(1));
    }

    private static List<City> getWroWalPwhdPath() {
        List<City> path = getWalWroPwhdPath();
        Collections.reverse(path);

        return path;
    }

    private static List<City> getWalWroPwhdPath() {
        List<City> walSca = new ArrayList<City>(Arrays.asList(DatabasePrePopulater.CITIES.get(2), DatabasePrePopulater.CITIES.get(3), DatabasePrePopulater.CITIES.get(4)));
        walSca.addAll(getScaWroPwhdPath());
        return walSca;
    }

    private static List<City> getScaWalPwhdPath() {
        return Arrays.asList(DatabasePrePopulater.CITIES.get(0), DatabasePrePopulater.CITIES.get(4), DatabasePrePopulater.CITIES.get(3), DatabasePrePopulater.CITIES.get(2));
    }

    private static List<City> getWalScaPwhdPath() {
        List<City> path = getScaWalPwhdPath();
        Collections.reverse(path);

        return path;
    }
    
    static List<Connection> getPwhdScaWro() {
        return Arrays.asList(
                // Sca - Wro
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(4, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w niedzielę"),
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(5, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(5, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(6, 15),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(6, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(7, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(7, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(8, 40),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(9, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(9, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(10, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(11, 05),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(11, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(12, 10),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(12, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(13, 30),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(14, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(14, 50),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(15, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe"),
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(16, 05),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(16, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe"),
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(17, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe"),
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(17, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(18, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe"),
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(18, 50),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(19, 50),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(20, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe"),
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhdPath(),
                        new LocalTime(21, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe"),
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                )
        );
    }

    static List<Connection> getPwhdWroSca() {
        return Arrays.asList(

                // Wro - Sca
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(5, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe"),
                                new ConnectionMark("Nie kursuje w niedzielę")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(6, 50),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(7, 25),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(9, 10),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(9, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(10, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(10, 40),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(12, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(12, 30),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(13, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(14, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(15, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(16, 10),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(17, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(18, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(19, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(20, 50),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(21, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(21, 50),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhdPath(),
                        new LocalTime(22, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SWIDNICA_WROCLAW_NORMAL_PRICE, PWHD_SCWIDNICA_WROCLAW_STUDENT_PRICE
                )
        );
    }

    static List<Connection> getPwhdWalWro() {
        return Arrays.asList(

                // Wal - Wro
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(5, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Kursuje od poniedziałku do piątku oprócz świąt")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(7, 05),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(9, 10),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(10, 50),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(13, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(16, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(17, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(20, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe"),
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                // Z Wal-Wro
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(6, 40),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(7, 15),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroPwhdPath(),
                        new LocalTime(20, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                )
        );
    }

    static List<Connection> getPwhdWroWal() {
        return Arrays.asList(

                // PWHD Wro - Wal
                new Connection(
                        getWroWalPwhdPath(),
                        new LocalTime(6, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalPwhdPath(),
                        new LocalTime(8, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalPwhdPath(),
                        new LocalTime(11, 05),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalPwhdPath(),
                        new LocalTime(14, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalPwhdPath(),
                        new LocalTime(15, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalPwhdPath(),
                        new LocalTime(17, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w święta ustawowe"),
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalPwhdPath(),
                        new LocalTime(19, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalPwhdPath(),
                        new LocalTime(20, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_WALBRZYCH_WROCLAW_NORMAL_PRICE, PWHD_WALBRZYCH_WROCLAW_STUDENT_PRICE
                )
        );
    }

    public static List<Connection> getPwhdScaWal() {
        return Arrays.asList(

                // Sca - Wal DNI ROBOCZE
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(4, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(5, 00),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(5, 23),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(5, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(5, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(5, 50),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(6, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(6, 35),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(6, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Kursuje w dni nauki szkolnej")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(7, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(7, 34),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(7, 45),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(8, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(8, 22),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(8, 35),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(9, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(9, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(9, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(9, 52),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(10, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(10, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(10, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(11, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(11, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(11, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(11, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(11, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(12, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(12, 25),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(12, 40),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(13, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(13, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(13, 28),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(13, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(14, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(14, 35),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(15, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(15, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(15, 20),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(15, 29),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(15, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(15, 50),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(15, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(16, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(16, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(16, 35),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(17, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(17, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(17, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(17, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(17, 54),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(18, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(18, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(18, 29),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(18, 50),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(19, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(19, 35),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(20, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(20, 45),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(21, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(22, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),

                // SCA - WAL Swieta
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(5, 45),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(6, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(6, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(7, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(7, 50),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(7, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(8, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(9, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(9, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(10, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(10, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(10, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(10, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(12, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(14, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(14, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(15, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(16, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(16, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(16, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(17, 07),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                                new ConnectionMark("Kursuje tylko w sobotę")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(17, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                                new ConnectionMark("Kursuje tylko w niedzielę")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(17, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(17, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(18, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(19, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(20, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(20, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(21, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                                new ConnectionMark("Kursuje tylko w niedzielę")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(21, 45),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                                new ConnectionMark("Kursuje tylko w niedzielę")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getScaWalPwhdPath(),
                        new LocalTime(22, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                                new ConnectionMark("Kursuje tylko w sobotę")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                )
        );
    }

    static List<Connection> getPwhdWalSca() {
        return Arrays.asList(

// Wal - Sca DNI ROBOCZE
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(5, 25),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(5, 50),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(6, 05),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(6, 58),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(7, 25),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(7, 35),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(8, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Kursuje w dni nauki szkolnej")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(8, 15),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(8, 42),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(8, 50),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(9, 30),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(9, 45),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(9, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(10, 10),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(10, 45),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(10, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(11, 12),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(11, 45),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(11, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(12, 30),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(12, 45),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(12, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(13, 20),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(13, 35),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(14, 00),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(14, 10),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(14, 25),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(14, 40),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(14, 50),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(14, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(15, 05),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(15, 20),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(15, 35),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(16, 00),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(16, 10),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(16, 25),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(16, 40),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(16, 50),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(16, 55),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(17, 05),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(17, 35),
                        DatabasePrePopulater.getPwhd(),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(17, 45),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(18, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(18, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(18, 45),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(19, 05),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(19, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(19, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(20, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(20, 45),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(21, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(21, 30),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(21, 45),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(22, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(23, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(new ConnectionMark("Dni robocze"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),


// WAL - SCA SWIETA
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(6, 15),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(6, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(8, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(10, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(11, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(12, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(11, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(12, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(13, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(13, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(13, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(14, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(14, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(15, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(15, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(15, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(16, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(17, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(17, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(18, 10),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(18, 25),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(18, 55),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(21, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(21, 40),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(22, 00),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                                new ConnectionMark("Kursuje tylko w niedzielę")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                ),
                new Connection(
                        getWalScaPwhdPath(),
                        new LocalTime(22, 20),
                        DatabasePrePopulater.getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("Sobota, niedziela i święta"),
                                new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                                new ConnectionMark("Kursuje tylko w niedzielę")
                        ),
                        PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
                )
        );
    }
}
