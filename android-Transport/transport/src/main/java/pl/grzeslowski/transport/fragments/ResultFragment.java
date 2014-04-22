package pl.grzeslowski.transport.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.repository.DatabaseManager;

@EFragment(R.layout.fragment_result)
public class ResultFragment extends Fragment {
    private static final String sConnectionsTag = "connections";

    @ViewById(R.id.fragment_result_list)
    ListView mResultList;
    @Bean
    DatabaseManager mDatabaseManager;
    @FragmentArg
    City mFrom;
    @FragmentArg
    City mTo;
    private List<Connection> mConnections = new ArrayList<Connection>();

    @AfterViews
    void prepare() {
        trySetAdapter(mFrom, mTo);
        trySetAdapter(mConnections);
    }

    private void trySetAdapter(List<Connection> connections) {
        if (!connections.isEmpty()) {
            parseResultsToList(connections);
        }
    }

    private void trySetAdapter(City from, City to) {
        if (from != null && to != null) {
            showResultsFor(from, to);
        }
    }

    public void showResultsFor(City from, City to) {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to);

        mConnections = mDatabaseManager.getConnections(from, to);
        parseResultsToList(mConnections);
    }

    private void parseResultsToList(final List<Connection> connections) {
        List<String> forAdapter = Lists.transform(connections, new Function<Connection, String>() {
            @Override
            public String apply(Connection input) {
                return getStringRepresentationForCity(input);
            }
        });

        setAdapter(forAdapter);
    }

    private <T> void setAdapter(List<T> elements) {
        ListAdapter adapter = new ArrayAdapter<T>(getActivity(), android.R.layout.simple_list_item_1, elements);
        mResultList.setAdapter(adapter);
    }

    private String getStringRepresentationForCity(Connection connection) {
        City from = connection.getPath().get(0);
        City to = connection.getPath().get(connection.getPath().size() - 1);

        return String.format("from: %s%nto: %s%nby: %s%ntime: %02d:%02d", from.getName(), to.getName(), connection.getProvider().getName(), connection.getTime().getHourOfDay(), connection.getTime().getMinuteOfHour());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mConnections = (List<Connection>) savedInstanceState.get(sConnectionsTag);
        }

        return null;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putSerializable(sConnectionsTag, new ArrayList<Connection>(mConnections));

        super.onSaveInstanceState(outState);
    }
}
