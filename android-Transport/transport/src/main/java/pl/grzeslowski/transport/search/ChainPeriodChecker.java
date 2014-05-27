package pl.grzeslowski.transport.search;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class ChainPeriodChecker implements PeriodChecker {

    private final List<PeriodChecker> mPeriodCheckers;

    public ChainPeriodChecker(List<PeriodChecker> periodCheckers) {
        this(periodCheckers, new ArrayList<NotRunPeriod>());
    }

    public ChainPeriodChecker(List<PeriodChecker> periodCheckers, List<NotRunPeriod> notRunPeriods) {
        mPeriodCheckers = checkNotNull(periodCheckers);
        for(NotRunPeriod notRunPeriod : notRunPeriods) {
            mPeriodCheckers.add(notRunPeriod.getPeriodChecker());
        }
    }

    @Override
    public boolean runsOnDate(LocalDate dateToCheck) {
        for(PeriodChecker periodChecker : mPeriodCheckers) {
            if(!periodChecker.runsOnDate(dateToCheck)) {
                return false;
            }
        }

        return true;
    }
}
