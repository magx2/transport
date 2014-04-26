package pl.grzeslowski.transport.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class ConnectionCity {
    public static final String CONNECTION = "cc_connection";
    public static final String CITY = "cc_city";
    public static final String NUMBER = "cc_number";

    @DatabaseField(generatedId = true)
    private int mId;
    @DatabaseField(foreign = true, canBeNull = false, columnName = CONNECTION)
    private Connection mConnection;
    @DatabaseField(foreign = true, canBeNull = false, columnName = CITY)
    private City mCity;
    @DatabaseField(canBeNull = false, columnName = NUMBER)
    private int mNumber;

    private  ConnectionCity() {
        // for ORM
    }

    public ConnectionCity(Connection connection, City city, int number) {
        mConnection = connection;
        mCity = city;
        mNumber = number;
    }
}
