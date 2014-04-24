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
    private static final String sFromTag = "from";
    private static final String sToTag = "to";

    @ViewById(R.id.fragment_result_list)
    ExpandableListView mResultList;
    @Bean
    DatabaseManager mDatabaseManager;
    private List<Connection> mConnections = new ArrayList<Connection>();
    private City mFrom;
    private City mTo;

    @AfterViews
    void prepare() {
        if (!mConnections.isEmpty()) {
            parseResultsToList(mConnections, mFrom, mTo);
        }
    }

    public void showResultsFor(City from, City to) {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to);

        mConnections = mDatabaseManager.getConnections(from, to);
        mFrom = from;
        mTo = to;
        parseResultsToList(mConnections, from, to);
    }

    private void parseResultsToList(final List<Connection> connections, City from, City to) {
        Collections.sort(connections, new ConnectionComparator());
        setAdapter(connections, from, to);
    }

    private void setAdapter(List<Connection> elements, City from, City to) {
        ResultListAdapter adapter = new ResultListAdapter(elements, getActivity(), from, to);
        mResultList.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mConnections = (List<Connection>) savedInstanceState.get(sConnectionsTag);
            mFrom = (City) savedInstanceState.get(sFromTag);
            mTo = (City) savedInstanceState.get(sToTag);
        }

        return null;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putSerializable(sConnectionsTag, new ArrayList<Connection>(mConnections));
        outState.putSerializable(sFromTag, mFrom);
        outState.putSerializable(sToTag, mTo);

        super.onSaveInstanceState(outState);
    }
}
