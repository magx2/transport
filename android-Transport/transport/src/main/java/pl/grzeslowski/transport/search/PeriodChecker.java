package pl.grzeslowski.transport.search;

import org.joda.time.LocalDate;

public interface PeriodChecker {
   boolean runsOnDate(LocalDate dateToCheck);
}
