package pl.grzeslowski.transport.tools;

import com.google.common.base.Preconditions;

import org.joda.time.LocalTime;

import java.util.Comparator;
import java.util.Date;

import pl.grzeslowski.transport.model.Connection;

public class ConnectionComparator implements Comparator<Connection>{

    private final LocalTime mTimeToCompare;

    public ConnectionComparator(LocalTime timeToCompare) {
        mTimeToCompare =  Preconditions.checkNotNull(timeToCompare);
    }

    public ConnectionComparator() {
        this(new LocalTime(new Date()));
    }

    @Override
    public int compare(Connection lhs, Connection rhs) {
        LocalTime leftTime = lhs.getTime();
        LocalTime rightTime = rhs.getTime();

        int leftCompare = mTimeToCompare.compareTo(leftTime);
        int rightCompare = mTimeToCompare.compareTo(rightTime);

        if(Math.signum(leftCompare)== Math.signum(rightCompare)) {
            return leftTime.compareTo(rightTime);
        } else {
            return leftCompare - rightCompare;
        }
    }
}
