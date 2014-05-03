package pl.grzeslowski.transport.tools;

import org.joda.time.LocalTime;

public class TimeCounter {

    private static final int sMaxMinsToCount = 3 *60;

    public int countTimeTo(LocalTime fromTime, LocalTime toTime) {
        int fromMins = fromTime.getHourOfDay() * 60 + fromTime.getMinuteOfHour();
        int toMins = toTime.getHourOfDay() * 60 + toTime.getMinuteOfHour();

        return toMins - fromMins;
    }

    public int countTimeTo(LocalTime toTime) {
        return countTimeTo(new LocalTime(), toTime);
    }

    public boolean shouldCountTimeTo(LocalTime fromTime, LocalTime toTime) {
        final int countTimeTo = countTimeTo(fromTime, toTime);

        return countTimeTo >= 0 && countTimeTo <= sMaxMinsToCount;
    }

    public boolean shouldCountTimeTo(LocalTime toTime) {
        return shouldCountTimeTo(new LocalTime(), toTime);
    }
}
