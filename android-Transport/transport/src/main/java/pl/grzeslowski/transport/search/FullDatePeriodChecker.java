package pl.grzeslowski.transport.search;

import org.joda.time.LocalDate;

import static com.google.common.base.Preconditions.checkNotNull;

public class FullDatePeriodChecker extends DatePeriodChecker {
    protected FullDatePeriodChecker(LocalDate notRunDate) {
        super(notRunDate);
    }

    public FullDatePeriodChecker(int dayOfMonth, int month, int year) {
        super(new LocalDate(year, month, dayOfMonth));
    }

    @Override
    public boolean runsOnDate(LocalDate dateToCheck) {
        checkNotNull(dateToCheck);
        return super.runsOnDate(dateToCheck) && equalYears(getNotRunDate(), dateToCheck);
    }

    private boolean equalYears(LocalDate notRunDate, LocalDate dateToCheck) {
        final int year = notRunDate.getYear();
        final int yearToCheck = dateToCheck.getYear();

        return year == yearToCheck;
    }
}
