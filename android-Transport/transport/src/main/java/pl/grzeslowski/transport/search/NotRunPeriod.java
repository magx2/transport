package pl.grzeslowski.transport.search;

import com.google.common.collect.Lists;

import org.joda.time.LocalDate;

public enum NotRunPeriod {
    /**
     * Nie kursuje w niedziele
     */
    SUNDAY(new DaysOfWeekPeriodChecker(DaysOfWeekPeriodChecker.SUNDAY)),
    /**
     * Nie kursuje w sobote
     */
    SATURDAY(new DaysOfWeekPeriodChecker(DaysOfWeekPeriodChecker.SATURDAY)),
    /**
     * Nie kursuje w piątek
     */
    FRIDAY(new DaysOfWeekPeriodChecker(DaysOfWeekPeriodChecker.FRIDAY)),
    /**
     * Nie kursuje w czwartek
     */
    THURSDAY(new DaysOfWeekPeriodChecker(DaysOfWeekPeriodChecker.THURSDAY)),
    /**
     * Nie kursuje w środę
     */
    WEDNESDAY(new DaysOfWeekPeriodChecker(DaysOfWeekPeriodChecker.WEDNESDAY)),
    /**
     * Nie kursuje we wtorek
     */
    TUESDAY(new DaysOfWeekPeriodChecker(DaysOfWeekPeriodChecker.TUESDAY)),
    /**
     * Nie kursuje w poniedziałek
     */
    MONDAY(new DaysOfWeekPeriodChecker(DaysOfWeekPeriodChecker.MONDAY)),
    /**
     * Nie kursuje w weekendy (sobota i niedziela)
     */
    WEEKEND(new DaysOfWeekPeriodChecker(DaysOfWeekPeriodChecker.SUNDAY, DaysOfWeekPeriodChecker.SATURDAY)),
    /**
     * Nie kursuje w sylwestra
     */
    LAST_DAY_OF_YEAR(new DatePeriodChecker(31, 12)),
    /**
     * Nie kursuje w wigilie (24.XII)
     */
    CHRISTMAS_EVE(new DatePeriodChecker(24, 12)),
    /**
     * Nie kursuje w pierwszy dzień nowego roku
     */
    FIRST_DAY_OF_NEW_YEAR(new DatePeriodChecker(1, 1)),
    /**
     * Nie kursuje w pierwszy dzień świąt Wielkanocnych
     */
    FIRST_DAY_OF_HOLY_EASTER(
            new ChainPeriodChecker(
                    Lists.<PeriodChecker>newArrayList(
                            new FullDatePeriodChecker(5, 4, 2015),
                            new FullDatePeriodChecker(27, 3, 2016),
                            new FullDatePeriodChecker(16, 4, 2017),
                            new FullDatePeriodChecker(1, 4, 2018),
                            new FullDatePeriodChecker(21, 4, 2019)
                    )
            )
    ),
    /**
     * Nie kursuje w Boże Narodzenie (25.XII)
     */
    CHRISTMAS(new DatePeriodChecker(25, 12)),
    /**
     * Nie kursuje w święta
     */
    HOLIDAYS(
            new ChainPeriodChecker(
                    Lists.<PeriodChecker>newArrayList(
                            new DatePeriodChecker(6, 1), // trzech kroli
                            new DatePeriodChecker(1, 5), // swieto pracy
                            new DatePeriodChecker(3, 5), // swieto konstytucji
                            new DatePeriodChecker(8, 6), // zeslanie ducha swietego
                            new FullDatePeriodChecker(19, 6, 2014), // Boze Cialo
                            new FullDatePeriodChecker(4, 6, 2015), // Boze Cialo
                            new FullDatePeriodChecker(26, 5, 2016), // Boze Cialo
                            new FullDatePeriodChecker(15, 6, 2017), // Boze Cialo
                            new FullDatePeriodChecker(31, 5, 2018), // Boze Cialo
                            new DatePeriodChecker(15, 8), // wniebowziecie NMP
                            new DatePeriodChecker(1, 11), // dzien wszystkich swietych
                            new DatePeriodChecker(11, 11), // Narodowe Swieto Niepodleglosci
                            new DatePeriodChecker(26, 12) // Boze Narodzenie
                    ),
                    Lists.<NotRunPeriod>newArrayList(
                            FIRST_DAY_OF_NEW_YEAR,
                            FIRST_DAY_OF_HOLY_EASTER,
                            CHRISTMAS
                    )
            )
    ),
    /**
     * Nie kursuje w dni wolne od nauki
     */
    SCHOOL_HOLIDAYS(
            new ChainPeriodChecker(
                    Lists.<PeriodChecker>newArrayList(
                            new DatePeriodsPeriodChecker(new LocalDate(28, 06, 2014), new LocalDate(31, 8, 2014)), // Wakacje
                            new DatePeriodsPeriodChecker(new LocalDate(22, 12, 2015), new LocalDate(31, 12, 2015)), // Boze Narodzenie
                            new DatePeriodsPeriodChecker(new LocalDate(2, 4, 2015), new LocalDate(7, 4, 2015)), // Wielkanoc
                            new DatePeriodsPeriodChecker(new LocalDate(27, 06, 2015), new LocalDate(31, 8, 2015)) // Wakacje
                    ),
                    Lists.<NotRunPeriod>newArrayList(
                            FIRST_DAY_OF_HOLY_EASTER,
                            CHRISTMAS,
                            FIRST_DAY_OF_NEW_YEAR,
                            CHRISTMAS_EVE,
                            LAST_DAY_OF_YEAR,
                            HOLIDAYS
                    )
            )
    );

    private final PeriodChecker mPeriodChecker;


    NotRunPeriod(PeriodChecker periodChecker) {
        mPeriodChecker = periodChecker;
    }

    public PeriodChecker getPeriodChecker() {
        return mPeriodChecker;
    }
}
