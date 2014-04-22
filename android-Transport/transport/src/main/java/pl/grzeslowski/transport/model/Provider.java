package pl.grzeslowski.transport.model;

import com.google.common.base.Preconditions;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Martin on 2014-04-17.
 */
@DatabaseTable
public class Provider {
    public static final String ID = "id";
    public static final String NAME = "name";

    @DatabaseField(generatedId = true, columnName = ID)
    private int mId;
    @DatabaseField(columnName = NAME, unique = true, canBeNull = false)
    private String mName;

    private Provider() {
        // for ORM
    }

    public Provider(int id, String name) {
        mId = id;
        mName = Preconditions.checkNotNull(name);
    }

    public Provider(String name) {
        this(0, name);
    }

    public String getName() {
        return mName;
    }
}
