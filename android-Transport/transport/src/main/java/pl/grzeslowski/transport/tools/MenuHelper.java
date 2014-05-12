package pl.grzeslowski.transport.tools;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.util.Log;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.common.base.Preconditions;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.TransporterApplication;
import pl.grzeslowski.transport.activities.InfoActivity_;

public class MenuHelper {
    private static final EmailIntent sEmailIntent = new EmailIntent();
    private static final String SCREEN_NAME = "SEND_EMAIL";
    private static final String CATEGORY = "SENDING_EMAIL";
    private final TransporterApplication mTransporterApplication;
    private final Activity mActivity;

    public MenuHelper(Activity activity) {
        mTransporterApplication = Preconditions.checkNotNull((TransporterApplication) activity.getApplication());
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
                    BuildConfig.VERSION_CODE,
                    BuildConfig.VERSION_NAME,
                    BuildConfig.MONETIAZATION_TYPE,
                    BuildConfig.BUILD_TYPE,
                    BuildConfig.DATABASE_VERSION,
                    BuildConfig.DATABASE_NAME
            );
            EmailIntent.Email feedbackEmail = new EmailIntent.Email("Ocena aplikacji " + mActivity.getString(R.string.app_name), emailText, "Martin.Grzeslowski+transporter@gmil.com");

            sEmailIntent.showEmailIntent(mActivity, feedbackEmail);

            sendTimeToGoogleAnalytics(emailText);
        } catch (ActivityNotFoundException ex) {
            Log.e("sendFeedback", "Ex005", ex);
        }
    }

    private void sendTimeToGoogleAnalytics(String emailText) {
        final Tracker tracker = mTransporterApplication.getTracker();
        if (tracker != null) {
            tracker.setScreenName(SCREEN_NAME);

            tracker.send(new HitBuilders.EventBuilder()
                    .setCategory(CATEGORY)
                    .setAction(emailText)
                    .build());

            tracker.setScreenName(null);
        }
    }
}
