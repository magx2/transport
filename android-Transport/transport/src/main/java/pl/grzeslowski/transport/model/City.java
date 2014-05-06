package pl.grzeslowski.transport.model;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

@DatabaseTable
public class City implements Serializable {
    public static final String ID = "id";
    public static final String NAME = "name";

    @DatabaseField(generatedId = true, columnName = ID)
    private int mId;
    @DatabaseField(columnName = NAME, unique = true, canBeNull = false)
    private String mName;

    private City() {
        // for ORM
    }

    public City(String name) {
        this(0, name);
    }

    public City(int id, String name) {
        this.mId = id;
        this.mName = Preconditions.checkNotNull(name);
    }

    @Override
    public int hashCode() {
        return mId;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof City) {
            City c = (City) o;

            return mId == c.mId;
        } else {
            return false;
        }
    }


    public String getName() {
        return mName;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(City.class).add("Id", mId).add("Name", mName).toString();
    }
}
