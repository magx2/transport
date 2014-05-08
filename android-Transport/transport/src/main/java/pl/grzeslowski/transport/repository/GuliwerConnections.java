package pl.grzeslowski.transport.repository;

import org.joda.time.LocalTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.ConnectionMark;

class GuliwerConnections {

    private static String GULIWER_WROCLAW_DEPARTURE = "pl. Dawida";
    private static String GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE = "ul. Kolejowa";
    private static String GULIWER_SWIDNICA_ZAMENHOFA_DEPARTURE = "ul. Zamenhofa (Shell)";
    private static String GULIWER_WALBRZYCH_DEPARTURE = "ul. Sikorskiego  (Teatr Dramatyczny)";

    private static final String GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE = "";
    private static final String GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE = "";

    private static final String GULIWER_WALBRZYCH_SWIDNICA_NORMAL_PRICE = "";
    private static final String GULIWER_WALBRZYCH_SWIDNICA_STUDENT_PRICE = "";

    private static final String GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE = "";
    private static final String GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE = "";

    private static List<City> getWroScaGuliwerPath() {
        List<City> path = getScaWroGuliwerPath();
        Collections.reverse(path);

        return path;
    }

    private static List<City> getScaWroGuliwerPath() {
        return Arrays.asList(
                DatabasePrePopulater.CITIES.get(0),
                DatabasePrePopulater.CITIES.get(5),
                DatabasePrePopulater.CITIES.get(6),
                DatabasePrePopulater.CITIES.get(7),
                DatabasePrePopulater.CITIES.get(8),
                DatabasePrePopulater.CITIES.get(9),
                DatabasePrePopulater.CITIES.get(10),
                DatabasePrePopulater.CITIES.get(11),
                DatabasePrePopulater.CITIES.get(12),
                DatabasePrePopulater.CITIES.get(1));
    }

    private static List<City> getWroWalGuliwerPath() {
        List<City> path = getWalWroGuliwerPath();
        Collections.reverse(path);

        return path;
    }

    private static List<City> getWalWroGuliwerPath() {
        List<City> walSca = new ArrayList<City>(
                Arrays.asList(
                        DatabasePrePopulater.CITIES.get(2),
                        DatabasePrePopulater.CITIES.get(3),
                        DatabasePrePopulater.CITIES.get(4)
                )
        );
        walSca.addAll(getScaWroGuliwerPath());
        return walSca;
    }

    private static List<City> getScaWalGuliwerPath() {
        return Arrays.asList(
                DatabasePrePopulater.CITIES.get(0),
                DatabasePrePopulater.CITIES.get(4),
                DatabasePrePopulater.CITIES.get(3),
                DatabasePrePopulater.CITIES.get(2)
        );
    }

    private static List<City> getWalScaPwhdPath() {
        List<City> path = getScaWalGuliwerPath();
        Collections.reverse(path);

        return path;
    }

    static List<Connection> getGuliwerScaWro() {
        return Arrays.asList(

                // Sca - Wro
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(4, 40),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("E"),
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(5, 35),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(6, 10),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("E"),
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(6, 50),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(7, 15),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(8, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(9, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(10, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(10, 45),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(11, 20),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(11, 50),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(12, 40),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Kursuje w piątki"),
                                new ConnectionMark("Kursuje w niedzielę")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(13, 20),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(13, 50),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(14, 20),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(15, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(15, 45),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(16, 20),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII"),
                                new ConnectionMark("Kursuje w piątki"),
                                new ConnectionMark("Kursuje w niedzielę")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(17, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(18, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(18, 30),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(19, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(20, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(21, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                )
        );
    }

    static List<Connection> getGuliwerWroSca() {
        return Arrays.asList(

                // Wro - Sca
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(5, 55),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("E")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(7, 05),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(7, 45),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(8, 45),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(9, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("E")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(9, 30),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(10, 05),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(11, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(12, 05),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(13, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(13, 30),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(14, 25),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Kursuje w piątki"),
                                new ConnectionMark("Kursuje w niedzielę")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(15, 10),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(15, 40),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(16, 15),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(16, 45),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(17, 40),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(18, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII"),
                                new ConnectionMark("Kursuje w piątki"),
                                new ConnectionMark("Kursuje w niedzielę")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(18, 30),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(19, 20),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(20, 20),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(21, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(21, 45),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(22, 15),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SCWIDNICA_WROCLAW_STUDENT_PRICE
                )
        );
    }

    static List<Connection> getGuliwerWalWro() {
        return Arrays.asList(

                // Wal - Wro
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(5, 25),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(6, 30),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(7, 10),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(9, 20),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(11, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(12, 30),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(14, 05),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(16, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(17, 10),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(18, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(19, 10),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(20, 10),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                )
        );
    }

    static List<Connection> getGuliwerWroWal() {
        return Arrays.asList(

                // Wro - Wal
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(7, 05),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(8, 45),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(10, 05),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(12, 05),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(13, 00),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(14, 05),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(15, 10),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(16, 15),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(17, 40),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(18, 30),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(19, 20),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII"),
                                new ConnectionMark("Kursuje w piątki"),
                                new ConnectionMark("Kursuje w soboty"),
                                new ConnectionMark("Kursuje w niedzielę")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(20, 20),
                        DatabasePrePopulater.getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                )
        );
    }
}
