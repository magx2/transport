package pl.grzeslowski.transport.activities;

import android.support.v7.app.ActionBarActivity;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.common.base.Preconditions;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.FragmentById;
import org.androidannotations.annotations.OptionsItem;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.TransporterApplication;
import pl.grzeslowski.transport.fragments.ResultFragment;
import pl.grzeslowski.transport.model.City;

@EActivity(R.layout.activity_result)
public class ResultActivity extends ActionBarActivity {

    @Extra
    City mFrom;
    @Extra
    City mTo;
    @FragmentById(R.id.activity_result_fragment_result)
    ResultFragment mResultFragment;

    @AfterViews
    void prepare() {
        Preconditions.checkNotNull(mFrom);
        Preconditions.checkNotNull(mTo);

        mResultFragment.showResultsFor(mFrom, mTo);

        // turning on back method for action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initAdSense();
    }

    @OptionsItem(android.R.id.home)
    void multipleMenuItems() {
        finish();
    }

    private void initAdSense() {

        // Get tracker.
        final TransporterApplication application = (TransporterApplication) getApplication();
        Tracker t = application.getTracker();

        // Set screen name.
        // Where path is a String representing the screen name.
        t.setScreenName(ResultActivity.class.getCanonicalName());

        // Send a screen view.
        t.send(new HitBuilders.AppViewBuilder().build());
    }
}
