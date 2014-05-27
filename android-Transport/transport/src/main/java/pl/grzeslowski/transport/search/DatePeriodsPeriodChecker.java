package pl.grzeslowski.transport.search;

import org.joda.time.LocalDate;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class DatePeriodsPeriodChecker implements PeriodChecker {

    private final LocalDate mStartDate;
    private final LocalDate mEndDate;

    public DatePeriodsPeriodChecker(LocalDate startDate, LocalDate endDate) {
        checkNotNull(startDate);
        checkNotNull(endDate);
        checkArgument(startDate.compareTo(endDate) <= 0);

        mStartDate = startDate;
        mEndDate = endDate;
    }


    @Override
    public boolean runsOnDate(LocalDate dateToCheck) {
        checkNotNull(dateToCheck);

        return mStartDate.compareTo(dateToCheck) <= 0 && mEndDate.compareTo(dateToCheck) >= 0;
    }
}
