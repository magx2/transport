package pl.grzeslowski.transport.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import pl.grzeslowski.transport.TransporterApplication;

public abstract class AdSenseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initAdSense();
    }

    private void initAdSense() {

        // Get tracker.
        final TransporterApplication application = (TransporterApplication) getApplication();
        Tracker t = application.getTracker();

        if (t != null) {

            // Set screen name.
            t.setScreenName(getClass().getCanonicalName());

            // Send a screen view.
            t.send(new HitBuilders.AppViewBuilder().build());

            t.setScreenName(null);
        }
    }
}
