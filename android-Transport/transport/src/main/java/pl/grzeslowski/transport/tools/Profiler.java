package pl.grzeslowski.transport.tools;

public class Profiler {

    private long mStart;
    private long mEnd;

    public Profiler start() {
        mStart = System.currentTimeMillis();
        return this;
    }

    public Profiler stop() {
        mEnd = System.currentTimeMillis() - mStart;
        return this;
    }

    public long getEnd() {
        return mEnd;
    }
}
