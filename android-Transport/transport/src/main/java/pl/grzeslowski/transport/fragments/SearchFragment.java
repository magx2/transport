package pl.grzeslowski.transport.fragments;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
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
import pl.grzeslowski.transport.TransporterApplication;
import pl.grzeslowski.transport.activities.ResultActivity_;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.repository.DatabaseManager;
import pl.grzeslowski.transport.tools.ApplicationSharedPref_;
import pl.grzeslowski.transport.views.RememberingStateSpinner;

import static pl.grzeslowski.transport.views.RememberingStateSpinner.OnItemSelected;

@EFragment(R.layout.fragment_search)
public class SearchFragment extends Fragment {
    private static final String CATEGORY = "CLICK_SWITCH";
    private static final String SCREEN_NAME = "SearchFragment_Switch";
    @ViewById(R.id.fragment_search_from)
    RememberingStateSpinner mFrom;
    @ViewById(R.id.fragment_search_to)
    RememberingStateSpinner mTo;
    @ViewById(R.id.fragment_search_change)
    ImageView mChange;
    @Bean
    DatabaseManager mDatabaseManager;
    @Pref
    ApplicationSharedPref_ myPrefs;

    @AfterViews
    void prepare() {
        initSpinners();
        initChange();
    }

    private void initChange() {
        final TransporterApplication transporterApplication = (TransporterApplication) getActivity().getApplication();

        mChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFrom.setSelection(mTo.getSelectedItemPosition(), true);

                sendToGoogleAnalytics();
            }

            private void sendToGoogleAnalytics() {
                final Tracker tracker = transporterApplication.getTracker();
                if (tracker != null) {
                    tracker.setScreenName(SCREEN_NAME);

                    tracker.send(new HitBuilders.EventBuilder()
                            .setCategory(CATEGORY)
                            .build());

                    tracker.setScreenName(null);
                }
            }
        });
    }

    private void initSpinners() {
        List<String> names = mDatabaseManager.getCitiesNames();

        ArrayAdapter fromAdapter = new ArrayAdapter(getActivity(), R.layout.spinner_list_item, names);
        mFrom.setAdapter(fromAdapter);
        mFrom.setOnItemSelected(new OnSpinnerItemListener(mFrom, mTo, myPrefs.lastFrom()));

        ArrayAdapter toAdapter = new ArrayAdapter(getActivity(), R.layout.spinner_list_item, names);
        mTo.setAdapter(toAdapter);
        mTo.setOnItemSelected(new OnSpinnerItemListener(mTo, mFrom, myPrefs.lastTo()));

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

    private class OnSpinnerItemListener implements OnItemSelected {
        private final Spinner mSpinner;
        private final Spinner mBoundSpinner;
        private StringPrefField mStringPrefField;

        private OnSpinnerItemListener(Spinner spinner, Spinner boundSpinner, StringPrefField stringPrefField) {
            mSpinner = spinner;
            mBoundSpinner = boundSpinner;
            mStringPrefField = stringPrefField;
        }

        @Override
        public void selected(int newPosition, Object oldObject) {
            final String newFromCity = (String) mSpinner.getAdapter().getItem(newPosition);
            mStringPrefField.put(newFromCity);

            if (newFromCity.equals(mBoundSpinner.getSelectedItem()) && oldObject != null) {
                final SpinnerAdapter adapter = mBoundSpinner.getAdapter();

                for (int i = 0; i < adapter.getCount(); i++) {
                    if (oldObject.equals(adapter.getItem(i))) {
                        mBoundSpinner.setSelection(i);
                        break;
                    }
                }
            }
        }
    }
}
