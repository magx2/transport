package pl.grzeslowski.transport.fragments;

import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

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
    @FragmentArg
    City mFrom;
    @FragmentArg
    City mTo;

    @AfterViews
    void prepare() {
        if(mFrom != null && mTo != null) {
            showResultsFor(mFrom, mTo);
        } else {
            mResultList.setAdapter(null);
        }
    }

    public void showResultsFor(City from, City to) {
        List<Connection> connections = mDatabaseManager.getConnections(from, to);

        List<String> forAdapter = Lists.transform(connections, new Function<Connection, String>() {
            @Override
            public String apply(Connection input) {
                City from = input.getPath().get(0);
                City to = input.getPath().get(input.getPath().size() - 1);

                return String.format("from: %s%nto: %s%nby: %s%ntime: %s:%s", from.getName(), to.getName(), input.getProvider().getName(), input.getTime().getHourOfDay(), input.getTime().getMinuteOfHour());
            }
        });

        setAdapter(forAdapter);
    }

    private void setAdapter(List<?> elements) {
        ListAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, elements);
        mResultList.setAdapter(adapter);
    }
}
