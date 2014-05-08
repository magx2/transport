package pl.grzeslowski.transport.tools;

import android.app.Activity;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.activities.InfoActivity_;

public class MenuHelper {
    private static final EmailIntent sEmailIntent = new EmailIntent();
    private final Activity mActivity;

    public MenuHelper(Activity activity) {
        mActivity = activity;
    }

    public void showInfo() {
        InfoActivity_.intent(mActivity).start();
    }

    public void sendFeedback() {
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
    }
}
