package pl.grzeslowski.transport.tools;

import static java.lang.System.*;

public class Profiler {

    private long mStart;
    private long mEnd;

    public Profiler start() {
        mStart = currentTimeMillis();
        return this;
    }

    public Profiler stop() {
        mEnd = currentTimeMillis() - mStart;
        return this;
    }

    public long getEnd() {
        return mEnd;
    }
}
