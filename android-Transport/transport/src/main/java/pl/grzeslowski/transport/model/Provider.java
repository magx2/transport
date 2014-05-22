package pl.grzeslowski.transport.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Martin on 2014-04-17.
 */
@DatabaseTable
public class Provider implements Serializable {
    public static final String ID = "provider_id";
    public static final String NAME = "provider_name";

    @DatabaseField(generatedId = true, columnName = ID)
    private int mId;
    @DatabaseField(columnName = NAME, unique = true, canBeNull = false)
    private String mName;

    private Provider() {
        // for ORM
    }

    public Provider(int id, String name) {
        mId = id;
        mName = checkNotNull(name);
    }

    public Provider(String name) {
        this(0, name);
    }

    public String getName() {
        return mName;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                '}';
    }
}
