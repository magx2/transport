package pl.grzeslowski.transport.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.Provider;

class DatabasePrePopulater {

    public static List<City> CITIES = Arrays.asList(
            new City("Świdnica"),
            new City("Wrocław"),
            new City("Wałbrzych"),
            new City("Swiebodzice"),
            new City("Mokrzeszów"),
            new City("Pszennno"),
            new City("Marcinowice"),
            new City("Szczepanów"),
            new City("Strzelce"),
            new City("Tworzyjanów"),
            new City("Wonjnarowice"),
            new City("Gniechowice"),
            new City("Małuszów"),
            new City("Tyniec Mały")
    );
    public static List<Provider> PROVIDERS = Arrays.asList(
            new Provider("P.W.H.D"),
            new Provider("Guliwer"),
            new Provider("PKP")
    );




    public static List<Connection> getConnections() {
        List<Connection> connections = new ArrayList<Connection>();

        // PWHD
        connections.addAll(PwhdConnections.getPwhdScaWal());
        connections.addAll(PwhdConnections.getPwhdWalSca());

        connections.addAll(PwhdConnections.getPwhdScaWro());
        connections.addAll(PwhdConnections.getPwhdWroSca());

        connections.addAll(PwhdConnections.getPwhdWalWro());
        connections.addAll(PwhdConnections.getPwhdWroWal());

        // Guliwer


        return connections;
    }



     static Provider getPwhd() {
        return PROVIDERS.get(0);
    }

     static Provider getGuliwer() {
        return PROVIDERS.get(1);
    }


}
