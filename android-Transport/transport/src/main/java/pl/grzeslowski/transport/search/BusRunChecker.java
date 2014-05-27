package pl.grzeslowski.transport.search;

import org.joda.time.LocalDate;

import pl.grzeslowski.transport.model.Connection;

public class BusRunChecker {

    public boolean checkIfRun(Connection connection, LocalDate date) {
        for(NotRunPeriod notRunPeriod : connection.getWhenNotRun()) {
            boolean run = checkIfRun(notRunPeriod, date);
            if(!run) {
                return false;
            }
        }

        return true;
    }

    private boolean checkIfRun(NotRunPeriod notRunPeriod, LocalDate date) {
        return notRunPeriod.getPeriodChecker().runsOnDate(date);
    }

}
