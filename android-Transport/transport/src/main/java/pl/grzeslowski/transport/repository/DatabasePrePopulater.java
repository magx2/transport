package pl.grzeslowski.transport.repository;

import org.joda.time.LocalTime;

import java.util.ArrayList;
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

    private static final String PWHD_SCA_WRO_NORMAL_PRICE = "10,50";
    private static final String PWHD_SCA_WRO_STUDENT_PRICE = "00,00";

    private static final String PWHD_WALBRZYCH_NORMAL_PRICE = "10,50";
    private static final String PWHD_WALBRZYCH_STUDENT_PRICE = "00,00";

    private static final String PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE = "10,50";
    private static final String PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE = "00,00";

    private static List<Connection> getPwhdScaWro() {
        return Arrays.asList(
                // Sca - Wro
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(4, 25),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w niedzielę"),
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(5, 15),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(5, 40),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(6, 15),
                        getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(6, 55),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(7, 25),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(7, 55),
                        getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(8, 40),
                        getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(9, 20),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(9, 55),
                        getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(10, 30),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(11, 05),
                        getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(11, 40),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(12, 10),
                        getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(12, 40),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(13, 30),
                        getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(14, 05),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(14, 50),
                        getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(15, 30),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe"),
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(16, 05),
                        getPwhd(),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(16, 40),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe"),
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(17, 05),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe"),
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(17, 40),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(18, 10),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe"),
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(18, 50),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(19, 50),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(20, 40),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe"),
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getScaWroPwhd(),
                        new LocalTime(21, 15),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe"),
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_SWIDNICA_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                )
        );
    }

    private static List<Connection> getPwhdWroSca() {
        return Arrays.asList(

                // Wro - Sca
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(5, 40),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe"),
                                new ConnectionMark("nie kursuje w niedzielę")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(6, 30),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(6, 50),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(7, 25),
                        getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(8, 40),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(9, 10),
                        getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(9, 40),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(10, 10),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(10, 40),
                        getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(11, 05),
                        getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(12, 00),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(12, 30),
                        getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(13, 25),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(14, 00),
                        getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(14, 30),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(15, 20),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(15, 55),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(16, 10),
                        getPwhd(),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(17, 00),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(17, 30),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(18, 20),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(19, 05),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(19, 30),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(20, 00),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(20, 50),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(21, 25),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(21, 50),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                ),
                new Connection(
                        getWroScaPwhd(),
                        new LocalTime(22, 25),
                        getPwhd(),
                        Arrays.asList(
                                new ConnectionMark("nie kursuje w wigilie i sylwestra"),
                                new ConnectionMark("nie kursuje w święta ustawowe")
                        ),
                        PWHD_WROCLAW_DEPARTURE, PWHD_SCA_WRO_NORMAL_PRICE, PWHD_SCA_WRO_STUDENT_PRICE
                )
        );
    }

    private static List<Connection> getPwhdWalWro() {
        return Arrays.asList(
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
                )
        );
    }

    public static List<Connection> CONNECTIONS = Arrays.asList(

// Z Wal-Wro
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(13, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(5, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(6, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(7, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(6, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(9, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(10, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(16, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(20, 20),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(17, 55),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(7, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(9, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(10, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(13, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(16, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(17, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalWroPwhd(),
                    new LocalTime(20, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
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
            ),

// Sca - Wal DNI ROBOCZE
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(4, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(5, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(5, 23),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(5, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(5, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(5, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(6, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(6, 35),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(6, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Kursuje w dni nauki szkolnej")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(7, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(7, 34),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(7, 45),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(8, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(8, 22),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(8, 35),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(9, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(9, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(9, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(9, 52),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(10, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(10, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(10, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(10, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(11, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(11, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(11, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(11, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(11, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(12, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(12, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(12, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(13, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(13, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(13, 28),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(13, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(13, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(14, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(14, 35),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(15, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(15, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(15, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(15, 29),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(15, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(15, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(15, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(16, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(16, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(16, 35),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(17, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(17, 05),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(17, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(17, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(17, 54),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(18, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(18, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(18, 29),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(18, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(19, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(19, 35),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(20, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(20, 45),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(21, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(22, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),

// Wal - Sca DNI ROBOCZE
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(5, 25),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(5, 50),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(6, 05),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(6, 30),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(6, 58),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(7, 25),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(7, 35),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(8, 00),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Kursuje w dni nauki szkolnej")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(8, 15),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(8, 42),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(8, 50),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(9, 30),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(9, 45),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(9, 55),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(10, 10),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(10, 45),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(10, 55),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(11, 12),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(11, 45),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(11, 55),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(12, 30),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(12, 45),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(12, 55),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(13, 20),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(13, 35),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(14, 00),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(14, 10),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(14, 25),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(14, 40),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(14, 50),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(14, 55),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(15, 05),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(15, 20),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(15, 35),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(16, 00),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(16, 10),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(16, 25),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(16, 40),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(16, 50),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(16, 55),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(17, 05),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(17, 35),
                    getPwhd(),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(17, 45),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(18, 20),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(18, 30),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(18, 45),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(19, 05),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(19, 30),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(19, 40),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(20, 10),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(20, 45),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(21, 15),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(21, 30),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(21, 45),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(22, 15),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(23, 00),
                    getPwhd(),
                    Arrays.asList(new ConnectionMark("Dni robocze"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_WALBRZYCH_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),

// SCA - WAL Swieta
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(5, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(5, 45),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(6, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(6, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(7, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(7, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(7, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(8, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(9, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(9, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(10, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(10, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(10, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(10, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(11, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(12, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(12, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(12, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(12, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(13, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(14, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(14, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(14, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(15, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(15, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(15, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(16, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(16, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(16, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(17, 07),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                            new ConnectionMark("Kursuje tylko w sobotę")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(17, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                            new ConnectionMark("7")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(17, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(17, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(18, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(18, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(19, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(19, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(20, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(20, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(21, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                            new ConnectionMark("7")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(21, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                            new ConnectionMark("Kursuje tylko w sobotę")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(21, 45),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                            new ConnectionMark("7")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getScaWalPwhd(),
                    new LocalTime(22, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                            new ConnectionMark("Kursuje tylko w sobotę")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),

// WAL - SCA SWIETA
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(5, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Kursuje tylko w sobotę")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(6, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(6, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(7, 35),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(8, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(8, 50),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(9, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(10, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(10, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(11, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(12, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(11, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(11, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(12, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(13, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(13, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(13, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(14, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(14, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(15, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(15, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(15, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(16, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(16, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(17, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(17, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(18, 10),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(18, 25),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(18, 55),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(19, 30),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(20, 45),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(21, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(21, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(21, 40),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(22, 00),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                            new ConnectionMark("7")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(22, 15),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                            new ConnectionMark("Kursuje tylko w sobotę")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
            ),
            new Connection(
                    getWalScaPwhd(),
                    new LocalTime(22, 20),
                    getPwhd(),
                    Arrays.asList(
                            new ConnectionMark("Sobota, niedziela i święta"),
                            new ConnectionMark("Nie kursuje 24.I i 31.XII"),
                            new ConnectionMark("Kursuje tylko w niedzielę")
                    ),
                    PWHD_SWIDNICA_DEPARTURE, PWHD_WALBRZYCH_SWIDNICA_NORMAL_PRICE, PWHD_WALBRZYCH_SWIDNICA_STUDENT_PRICE
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
        List<City> walSca = new ArrayList<City>(Arrays.asList(CITIES.get(2), CITIES.get(3), CITIES.get(4)));
        walSca.addAll(getScaWroPwhd());
        return walSca;
    }

    private static List<City> getScaWalPwhd() {
        return Arrays.asList(CITIES.get(0), CITIES.get(4), CITIES.get(3), CITIES.get(2));
    }

    private static List<City> getWalScaPwhd() {
        List<City> path = getScaWalPwhd();
        Collections.reverse(path);

        return path;
    }

}
