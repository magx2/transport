package pl.grzeslowski.transport.fragments;

import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.List;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.activities.ResultActivity_;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.repository.DatabaseManager;

/**
 * Created by Martin on 2014-04-22.
 */
@EFragment(R.layout.fragment_search)
public class SearchFragment extends Fragment{
    @ViewById(R.id.fragment_search_from)
    Spinner mFrom;
    @ViewById(R.id.fragment_search_to)
    Spinner mTo;
    @Bean
    DatabaseManager mDatabaseManager;

    @AfterViews
    void prepare() {
        List<String> names = mDatabaseManager.getCitiesNames();

        ArrayAdapter fromAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, names);
        mFrom.setAdapter(fromAdapter);

        ArrayAdapter toAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, names);
        mTo.setAdapter(toAdapter);

        // mTo cannot have the same chosen item so changing it to second element
        mTo.setSelection(1, false);
    }

    @Click(R.id.fragment_search_search)
    void search() {

        // get from and to City
        City from = mDatabaseManager.getCityByName((String) mFrom.getSelectedItem());
        City to = mDatabaseManager.getCityByName((String) mTo.getSelectedItem());

        ResultFragment resultFragment = (ResultFragment) getFragmentManager().findFragmentById(R.id.activity_main_fragment_result);

        if (resultFragment != null && resultFragment.isInLayout()) {
            resultFragment.showResultsFor(from, to);
        } else {

            // resultFragment is not in activity; open resultActivity with result11
            ResultActivity_.intent(this).mFrom(from).mTo(to).start();
        }
    }

}
