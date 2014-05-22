package pl.grzeslowski.transport;

import android.app.Application;
import android.util.Log;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

import org.androidannotations.annotations.EApplication;

import static java.lang.String.format;
import static pl.grzeslowski.transport.BuildConfig.AD_SENSE_TAG;
import static pl.grzeslowski.transport.BuildConfig.BUILD_TYPE;
import static pl.grzeslowski.transport.BuildConfig.DATABASE_NAME;
import static pl.grzeslowski.transport.BuildConfig.DATABASE_VERSION;
import static pl.grzeslowski.transport.BuildConfig.MONETIAZATION_TYPE;
import static pl.grzeslowski.transport.BuildConfig.VERSION_CODE;
import static pl.grzeslowski.transport.BuildConfig.VERSION_NAME;

@EApplication
public class TransporterApplication extends Application {

    public static final String GA_TAG = "ga";
    private Tracker mTracker;

    @Override
    public void onCreate() {
        super.onCreate();
        if (!isDebug()) {
            initCrashlitics();
        }
    }

    private void initCrashlitics() {
        Crashlytics.start(this);
        Crashlytics.log(Log.INFO, "INIT",
                format(
                        "VERSION_CODE: %s,\n" +
                                "VERSION_NAME: %s,\n" +
                                "MONETIAZATION_TYPE: %s,\n" +
                                "DATABASE_VERSION: %s,\n" +
                                "DATABASE_NAME: %s",
                        VERSION_CODE,
                        VERSION_NAME,
                        MONETIAZATION_TYPE,
                        DATABASE_VERSION,
                        DATABASE_NAME
                )
        );
    }

    public synchronized Tracker getTracker() {
        if (!isDebug()) {
            if (mTracker == null) {
                GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);

                mTracker = analytics.newTracker(AD_SENSE_TAG);
            }

            return mTracker;
        } else {
            return null;
        }
    }

    private static boolean isDebug() {
        return "debug".equals(BUILD_TYPE);
    }
}
