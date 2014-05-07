package pl.grzeslowski.transport;

import android.app.Application;
import android.util.Log;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

import org.androidannotations.annotations.EApplication;

@EApplication
public class TransporterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initCrashlitics();
    }

    private void initCrashlitics() {
        Crashlytics.start(this);
        Crashlytics.log(Log.INFO, "INIT",
                String.format(
                        "VERSION_CODE: %s,\n" +
                                "VERSION_NAME: %s,\n" +
                                "MONETIAZATION_TYPE: %s,\n" +
                                "DATABASE_VERSION: %s,\n" +
                                "DATABASE_NAME: %s",
                        BuildConfig.VERSION_CODE,
                        BuildConfig.VERSION_NAME,
                        BuildConfig.MONETIAZATION_TYPE,
                        BuildConfig.DATABASE_VERSION,
                        BuildConfig.DATABASE_NAME
                )
        );
    }

    public synchronized Tracker getTracker() {
        if (!"debug".equals(BuildConfig.BUILD_TYPE)) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);

            return analytics.newTracker(BuildConfig.AD_SENSE_TAG);
        } else {
            return null;
        }
    }
}