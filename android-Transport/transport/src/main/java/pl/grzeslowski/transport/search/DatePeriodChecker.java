package pl.grzeslowski.transport.search;

import org.joda.time.LocalDate;

import static com.google.common.base.Preconditions.checkNotNull;

public class DatePeriodChecker implements PeriodChecker {

    private final LocalDate mNotRunDate;

    protected DatePeriodChecker(LocalDate notRunDate) {
        mNotRunDate = checkNotNull(notRunDate);
    }

    public DatePeriodChecker(int dayOfMonth, int month) {
         this(new LocalDate(1990, month, dayOfMonth));
    }

    @Override
    public boolean runsOnDate(LocalDate dateToCheck) {
        checkNotNull(dateToCheck);

        return equalDayOfMonth(mNotRunDate, dateToCheck) && equalMonth(mNotRunDate, dateToCheck);
    }

    private boolean equalDayOfMonth(LocalDate notRunDate, LocalDate dateToCheck) {
        final int dayOfMonth = notRunDate.getDayOfMonth();
        final int dayOfMonthToCheck = dateToCheck.getDayOfMonth();

        return dayOfMonth == dayOfMonthToCheck;
    }

    private boolean equalMonth(LocalDate notRunDate, LocalDate dateToCheck) {
        final int monthOfYear = notRunDate.getMonthOfYear();
        final int monthOfYearToCheck = dateToCheck.getMonthOfYear();

        return monthOfYear == monthOfYearToCheck;
    }

    protected LocalDate getNotRunDate() {
        return mNotRunDate;
    }
}
