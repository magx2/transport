package pl.grzeslowski.transport.search;

public enum NotRunPeriod {
    /**
     * Nie kursuje w niedziele
     */
    SUNDAY,
    /**
     * Nie kursuje w sobote
     */
    SATURDAY,
    /**
     * Nie kursuje w piątek
     */
    FRIDAY,
    /**
     * Nie kursuje w czwartek
     */
    THURSDAY,
    /**
     * Nie kursuje w środę
     */
    WEDNESDAY,
    /**
     * Nie kursuje we wtorek
     */
    TUESDAY,
    /**
     * Nie kursuje w poniedziałek
     */
    MONDAY,
    /**
     * Nie kursuje w weekendy (sobota i niedziela)
     */
    WEEKEND,
    /**
     * Nie kursuje w święta
     */
    HOLIDAYS,
    /**
     * Nie kursuje w dni wolne od nauki
     */
    SCHOOL_HOLIDAY,
    /**
     * Nie kursuje w sylwestra
     */
    LAST_DAY_OF_YEAR,
    /**
     * Nie kursuje w wigilie (24.XII)
     */
    CHRISTMAS_EVE,
    /**
     * Nie kursuje w pierwszy dzień nowego roku
     */
    FIRST_DAY_OF_NEW_YEAR,
    /**
     * Nie kursuje w pierwszy dzień świąt Wielkanocnych
     */
    FIRST_DAY_OF_HOLY_EASTER,
    /**
     * Nie kursuje w Boże Narodzenie (25.XII)
     */
    CHRISTMAS
}
