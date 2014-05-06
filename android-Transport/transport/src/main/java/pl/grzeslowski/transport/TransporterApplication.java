package pl.grzeslowski.transport;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

import org.androidannotations.annotations.EApplication;

@EApplication
public class TransporterApplication extends Application {

    public synchronized Tracker getTracker() {
        GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);

        return analytics.newTracker(BuildConfig.AD_SENSE_TAG);
    }
}
