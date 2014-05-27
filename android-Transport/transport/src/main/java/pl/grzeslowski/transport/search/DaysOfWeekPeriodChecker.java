package pl.grzeslowski.transport.search;

import org.joda.time.LocalDate;

public class DaysOfWeekPeriodChecker implements  PeriodChecker {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    private final int[] mNotRunDay;

    public DaysOfWeekPeriodChecker(int notRunDay) {
        mNotRunDay = new int[] {notRunDay};
    }

    public DaysOfWeekPeriodChecker(int... notRunDays) {
        mNotRunDay = notRunDays;
    }

    @Override
    public boolean runsOnDate(LocalDate dateToCheck) {
        final int dayOfWeek = dateToCheck.getDayOfWeek();
        for(int day : mNotRunDay) {
            if(dayOfWeek == day) {
                return false;
            }
        }

        return true;
    }
}
