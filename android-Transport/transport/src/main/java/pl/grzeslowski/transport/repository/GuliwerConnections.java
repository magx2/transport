package pl.grzeslowski.transport.repository;

import org.joda.time.LocalTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.ConnectionMark;

import static pl.grzeslowski.transport.repository.DatabasePrePopulater.*;

class GuliwerConnections {

    private static String GULIWER_WROCLAW_DEPARTURE = "pl. Dawida";
    private static String GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE = "ul. Kolejowa";
    private static String GULIWER_WALBRZYCH_DEPARTURE = "ul. Sikorskiego  (Teatr Dramatyczny)";

    private static final String GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE = "8";
    private static final String GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE = "5,50";

    private static final String GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE = "11";
    private static final String GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE = "9";

    private static List<City> getWroScaGuliwerPath() {
        List<City> path = getScaWroGuliwerPath();
        Collections.reverse(path);

        return path;
    }

    private static List<City> getScaWroGuliwerPath() {
        return Arrays.asList(
                CITIES.get(0),
                CITIES.get(5),
                CITIES.get(6),
                CITIES.get(7),
                CITIES.get(8),
                CITIES.get(9),
                CITIES.get(10),
                CITIES.get(11),
                CITIES.get(12),
                CITIES.get(1));
    }

    private static List<City> getWroWalGuliwerPath() {
        List<City> path = getWalWroGuliwerPath();
        Collections.reverse(path);

        return path;
    }

    private static List<City> getWalWroGuliwerPath() {
        List<City> walSca = new ArrayList<City>(
                Arrays.asList(
                        CITIES.get(2),
                        CITIES.get(3),
                        CITIES.get(4)
                )
        );
        walSca.addAll(getScaWroGuliwerPath());
        return walSca;
    }

    private static List<City> getScaWalGuliwerPath() {
        return Arrays.asList(
                CITIES.get(0),
                CITIES.get(4),
                CITIES.get(3),
                CITIES.get(2)
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
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Kursuje od poniedziałku do soboty oprócz świąt"),
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(5, 35),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(6, 10),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Kursuje od poniedziałku do soboty oprócz świąt"),
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(6, 50),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(7, 15),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(8, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(9, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(10, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(10, 45),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(11, 20),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(11, 50),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(12, 40),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Kursuje w piątki"),
                                new ConnectionMark("Kursuje w niedzielę")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(13, 20),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(13, 50),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(14, 20),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(15, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(15, 45),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(16, 20),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII"),
                                new ConnectionMark("Kursuje w piątki"),
                                new ConnectionMark("Kursuje w niedzielę")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(17, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(18, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(18, 30),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(19, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(20, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroGuliwerPath(),
                        new LocalTime(21, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_SWIDNICA_KOLEJOWA_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                )
        );
    }

    static List<Connection> getGuliwerWroSca() {
        return Arrays.asList(

                // Wro - Sca
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(5, 55),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Kursuje od poniedziałku do soboty oprócz świąt")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(7, 45),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(9, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Kursuje od poniedziałku do soboty oprócz świąt")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(9, 30),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(11, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(13, 30),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(14, 25),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Kursuje w piątki"),
                                new ConnectionMark("Kursuje w niedzielę")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(15, 40),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(16, 45),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(18, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII"),
                                new ConnectionMark("Kursuje w piątki"),
                                new ConnectionMark("Kursuje w niedzielę")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(21, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(21, 45),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaGuliwerPath(),
                        new LocalTime(22, 15),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("Nie kursuje w dniu 24.XII")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_SWIDNICA_WROCLAW_NORMAL_PRICE, GULIWER_SWIDNICA_WROCLAW_STUDENT_PRICE
                )
        );
    }

    static List<Connection> getGuliwerWalWro() {
        return Arrays.asList(

                // Wal - Wro
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(5, 25),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(6, 30),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(7, 10),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(9, 20),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(11, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(12, 30),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(14, 05),
                        getGuliwer(),
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
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WALBRZYCH_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWalWroGuliwerPath(),
                        new LocalTime(17, 10),
                        getGuliwer(),
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
                        getGuliwer(),
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
                        getGuliwer(),
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
                        getGuliwer(),
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
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(8, 45),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(10, 05),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(12, 05),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(13, 00),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(14, 05),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(15, 10),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(16, 15),
                        getGuliwer(),
                        Arrays.asList(
                                new ConnectionMark("Nie kursuje w dniu 1.I., w pierwszy dzień Świąt Wielkanocnych i w dniu 25.XII"),
                                new ConnectionMark("W Swidnicy zatrzymuje się na ul. Zamenhofa (Shell)")
                        ),
                        GULIWER_WROCLAW_DEPARTURE, GULIWER_WALBRZYCH_WROCLAW_NORMAL_PRICE, GULIWER_WALBRZYCH_WROCLAW_STUDENT_PRICE
                ),
                new Connection(
                        getWroWalGuliwerPath(),
                        new LocalTime(17, 40),
                        getGuliwer(),
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
                        getGuliwer(),
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
                        getGuliwer(),
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
                        getGuliwer(),
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
