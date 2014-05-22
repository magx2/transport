package pl.grzeslowski.transport.tools;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.util.Log;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.TransporterApplication;
import pl.grzeslowski.transport.activities.InfoActivity_;

import static com.google.common.base.Preconditions.checkNotNull;
import static pl.grzeslowski.transport.BuildConfig.BUILD_TYPE;
import static pl.grzeslowski.transport.BuildConfig.DATABASE_NAME;
import static pl.grzeslowski.transport.BuildConfig.DATABASE_VERSION;
import static pl.grzeslowski.transport.BuildConfig.MONETIAZATION_TYPE;
import static pl.grzeslowski.transport.BuildConfig.VERSION_CODE;
import static pl.grzeslowski.transport.BuildConfig.VERSION_NAME;

public class MenuHelper {
    private static final EmailIntent sEmailIntent = new EmailIntent();
    private static final String SCREEN_NAME = "SEND_EMAIL";
    private static final String CATEGORY = "SENDING_EMAIL";
    private final TransporterApplication mTransporterApplication;
    private final Activity mActivity;

    public MenuHelper(Activity activity) {
        mTransporterApplication = checkNotNull((TransporterApplication) activity.getApplication());
        mActivity = activity;
    }

    public void showInfo() {
        InfoActivity_.intent(mActivity).start();
    }

    public void sendFeedback() {
        try {
            final String emailText = String.format(
                    "%n%n%n%n%n%n%s%nVERSION_CODE: %s%nVERSION_NAME: %s%nMONETIAZATION_TYPE: %s%nBUILD_TYPE: %s%nDATABASE_VERSION: %s%nDATABASE_NAME: %s",
                    "-----------------------",
                    VERSION_CODE,
                    VERSION_NAME,
                    MONETIAZATION_TYPE,
                    BUILD_TYPE,
                    DATABASE_VERSION,
                    DATABASE_NAME
            );
            EmailIntent.Email feedbackEmail = new EmailIntent.Email("Ocena aplikacji " + mActivity.getString(R.string.app_name), emailText, "Martin.Grzeslowski+transporter@gmil.com");

            sEmailIntent.showEmailIntent(mActivity, feedbackEmail);

            sendTimeToGoogleAnalytics();
        } catch (ActivityNotFoundException ex) {
            Log.e("sendFeedback", "Ex005", ex);
        }
    }

    private void sendTimeToGoogleAnalytics() {
        final Tracker tracker = mTransporterApplication.getTracker();
        if (tracker != null) {
            tracker.setScreenName(SCREEN_NAME);

            tracker.send(new HitBuilders.EventBuilder()
                    .setCategory(CATEGORY)
                    .build());

            tracker.setScreenName(null);
        }
    }
}
