package pl.grzeslowski.transport.model;

import com.google.common.base.Preconditions;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import org.joda.time.LocalTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Created by Martin on 2014-04-17.
 */
@DatabaseTable
public class Connection implements Serializable {

    private static final String ID = "id";
    private static final String PATH = "path";
    private static final String START_TIME = "start";
    private static final String PROVIDER = "provider";
    @DatabaseField(generatedId = true, columnName = ID)
    private int mId;
    @ForeignCollectionField(eager = true, columnName = PATH)
    private Collection<City> mPath;
    @DatabaseField(columnName = START_TIME, canBeNull = false)
    private LocalTime mStartTime;
    @DatabaseField(columnName = PROVIDER, canBeNull = false)
    private Provider mProvider;

    private Connection() {
        // for ORM
    }

    public Connection(int id, List<City> path, LocalTime startTime, Provider provider) {
        mId = id;
        mPath = Preconditions.checkNotNull(path);
        mStartTime = Preconditions.checkNotNull(startTime);
        mProvider = Preconditions.checkNotNull(provider);
    }

    public Connection(List<City> path, LocalTime startTime, Provider provider) {
        this(0, path, startTime, provider);
    }

    public int getId() {
        return mId;
    }

    public List<City> getPath() {
        return new ArrayList<City>(mPath);
    }

    public LocalTime getTime() {
        return mStartTime;
    }

    public Provider getProvider() {
        return mProvider;
    }
}
