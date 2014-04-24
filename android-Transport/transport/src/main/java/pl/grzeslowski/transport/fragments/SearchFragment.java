package pl.grzeslowski.transport.fragments;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.google.common.base.Strings;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.androidannotations.api.sharedpreferences.StringPrefField;

import java.util.List;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.activities.ResultActivity_;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.repository.DatabaseManager;
import pl.grzeslowski.transport.tools.ApplicationSharedPref_;

/**
 * Created by Martin on 2014-04-22.
 */
@EFragment(R.layout.fragment_search)
public class SearchFragment extends Fragment {
    @ViewById(R.id.fragment_search_from)
    Spinner mFrom;
    @ViewById(R.id.fragment_search_to)
    Spinner mTo;
    @Bean
    DatabaseManager mDatabaseManager;
    @Pref
    ApplicationSharedPref_ myPrefs;

    @AfterViews
    void prepare() {
        List<String> names = mDatabaseManager.getCitiesNames();

        ArrayAdapter fromAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, names);
        mFrom.setAdapter(fromAdapter);
        mFrom.setOnItemSelectedListener(new OnSpinnerItemListener(mFrom, myPrefs.lastFrom()));

        ArrayAdapter toAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, names);
        mTo.setAdapter(toAdapter);
        mTo.setOnItemSelectedListener(new OnSpinnerItemListener(mTo, myPrefs.lastTo()));

        setCityInSpinners();
    }

    private void setCityInSpinners() {
        final boolean isFromSelected = setSelection(mFrom, myPrefs.lastFrom().get());
        if (!isFromSelected) {
            mFrom.setSelection(0);
        }

        boolean isToSelected = setSelection(mTo, myPrefs.lastTo().get());
        if (!isToSelected) {

            // mTo cannot have the same chosen item so changing it to second element
            mTo.setSelection(1, false);
        }
    }

    private boolean setSelection(Spinner spinner, String cityName) {
        if (!Strings.isNullOrEmpty(cityName)) {
            final SpinnerAdapter adapter = spinner.getAdapter();
            for (int i = 0; i < adapter.getCount(); i++) {
                if (cityName.equals(adapter.getItem(i))) {
                    spinner.setSelection(i);
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
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

    private class OnSpinnerItemListener implements AdapterView.OnItemSelectedListener {
        private final Spinner mSpinner;
        private StringPrefField mStringPrefField;

        private OnSpinnerItemListener(Spinner spinner, StringPrefField stringPrefField) {
            mSpinner = spinner;
            mStringPrefField = stringPrefField;
        }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            final String newFromCity = (String) mFrom.getAdapter().getItem(position);

            mStringPrefField.put(newFromCity);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
