package pl.grzeslowski.transport.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

@DatabaseTable
public class ConnectionMark implements Serializable {
    private static final String ID = "id";
    private static final String MARK = "mark";

    @DatabaseField(generatedId = true, columnName = ID)
    private int mId;
    @DatabaseField(columnName = MARK, canBeNull = false)
    private String mMark;

    public ConnectionMark(int id, String mark) {
        mId = id;
        mMark = mark;
    }

    public ConnectionMark(String mark) {
        this(0, mark);
    }

    public int getId() {
        return mId;
    }

    public String getMark() {
        return mMark;
    }
}
