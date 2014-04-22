package pl.grzeslowski.transport.fragments;

import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.Arrays;
import java.util.List;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.repository.DatabaseManager;

/**
 * Created by Martin on 2014-04-22.
 */
@EFragment(R.layout.fragment_result)
public class ResultFragment extends Fragment {

    @ViewById(R.id.fragment_result_list)
    ListView mResultList;
    @Bean
    DatabaseManager mDatabaseManager;

    @AfterViews
    void prepare() {
        ListAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, Arrays.asList("as", "df", "fg"));
        mResultList.setAdapter(adapter);
    }

    public void showResultsFor(City from, City to) {
        List<Connection> connections = mDatabaseManager.getConnections(from, to);

        // TODO: Mock
        Toast.makeText(getActivity(), String.format("from %s,%nto %s", from.getName(), to.getName()), Toast.LENGTH_SHORT).show();
    }
}
