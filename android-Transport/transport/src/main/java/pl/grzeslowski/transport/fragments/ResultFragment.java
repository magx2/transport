package pl.grzeslowski.transport.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.google.common.base.Preconditions;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.adapters.ResultListAdapter;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.repository.DatabaseManager;
import pl.grzeslowski.transport.tools.ConnectionComparator;

@EFragment(R.layout.fragment_result)
public class ResultFragment extends Fragment {
    private static final String sConnectionsTag = "connections";

    @ViewById(R.id.fragment_result_list)
    ExpandableListView mResultList;
    @Bean
    DatabaseManager mDatabaseManager;
    private List<Connection> mConnections = new ArrayList<Connection>();

    @AfterViews
    void prepare() {
        trySetAdapter(mConnections);
    }

    private void trySetAdapter(List<Connection> connections) {
        if (!connections.isEmpty()) {
            parseResultsToList(connections);
        }
    }

    public void showResultsFor(City from, City to) {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to);

        mConnections = mDatabaseManager.getConnections(from, to);
        parseResultsToList(mConnections);
    }

    private void parseResultsToList(final List<Connection> connections) {
        Collections.sort(connections, new ConnectionComparator());
        setAdapter(connections);
    }

    private void setAdapter(List<Connection> elements) {
        ResultListAdapter adapter = new ResultListAdapter(elements, getActivity());
        mResultList.setAdapter(adapter);
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
