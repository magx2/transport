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
    private static final String MARKS = "marks";
    private static final String DEPARTURE = "departure";
    private static final String NORMAL_PRICE = "normal_price";
    private static final String STUDENT_PRICE = "student_price";

    @DatabaseField(generatedId = true, columnName = ID)
    private int mId;
    @ForeignCollectionField(eager = true, columnName = PATH)
    private Collection<City> mPath;
    @DatabaseField(columnName = START_TIME, canBeNull = false)
    private LocalTime mStartTime;
    @DatabaseField(columnName = PROVIDER, canBeNull = false)
    private Provider mProvider;
    @ForeignCollectionField(eager = true, columnName = MARKS)
    private Collection<ConnectionMark> mMarks;
    @DatabaseField(columnName = DEPARTURE, canBeNull = false)
    private String mDeparture;
    @DatabaseField(columnName = NORMAL_PRICE, canBeNull = false)
    private String mNormalPrice;
    @DatabaseField(columnName = STUDENT_PRICE, canBeNull = false)
    private String mStudentPrice;

    private Connection() {
        // for ORM
    }

    public Connection(int id, List<City> path, LocalTime startTime, Provider provider, List<ConnectionMark> marks, String departure, String normalPrice, String studentPrice) {
        mId = id;
        mPath = new ArrayList<City>(Preconditions.checkNotNull(path));
        mStartTime = Preconditions.checkNotNull(startTime);
        mProvider = Preconditions.checkNotNull(provider);
        if (marks == null) {
            mMarks = new ArrayList<ConnectionMark>();
        } else {
            mMarks = new ArrayList<ConnectionMark>(marks);
        }
        mDeparture = Preconditions.checkNotNull(departure);
        mNormalPrice = Preconditions.checkNotNull(normalPrice);
        mStudentPrice = Preconditions.checkNotNull(studentPrice);
    }

    public Connection(List<City> path, LocalTime startTime, Provider provider, String departure, String normalPrice, String studentPrice) {
        this(0, path, startTime, provider, null, departure, normalPrice, studentPrice);
    }

    public Connection(List<City> path, LocalTime startTime, Provider provider, List<ConnectionMark> marks, String departure, String normalPrice, String studentPrice) {
        this(0, path, startTime, provider, marks, departure, normalPrice, studentPrice);
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

    public List<ConnectionMark> getMarks() {
        return new ArrayList<ConnectionMark>(mMarks);
    }

    public String getDeparture() {
        return mDeparture;
    }

    public String getNormalPrice() {
        return mNormalPrice;
    }

    public String getStudentPrice() {
        return mStudentPrice;
    }
}
