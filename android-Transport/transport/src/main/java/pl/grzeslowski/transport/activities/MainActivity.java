package pl.grzeslowski.transport.activities;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.fragments.BuyFragment;
import pl.grzeslowski.transport.product_flavors.MonetizationType;
import pl.grzeslowski.transport.tools.EmailIntent;


@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.main)
public class MainActivity extends AdSenseActivity {
    private static final EmailIntent sEmailIntent = new EmailIntent();

    @OptionsItem(R.id.menu_info)
    void showInfo() {

    }

    @OptionsItem(R.id.menu_feedback)
    void sendFeedback() {
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
        EmailIntent.Email feedbackEmail = new EmailIntent.Email("Ocena aplikacji " + getString(R.string.app_name), emailText, "Martin.Grzeslowski+transporter@gmil.com");

        sEmailIntent.showEmailIntent(this, feedbackEmail);
    }


    @FragmentById(R.id.activity_main_fragment_buy)
    BuyFragment mBuyFragment;

    @AfterViews
    void prepare() {
        if (BuildConfig.MONETIAZATION_TYPE == MonetizationType.PAID) {
            hideBuyRelatedViews();
        } else {
            initOpeningShow();
        }
    }


    private void initOpeningShow() {
        final DownloadPaidAppOpener appOpener = new DownloadPaidAppOpener(this);
        mBuyFragment.setOnLinkClickListener(appOpener);
    }

    private void hideBuyRelatedViews() {
        findViewById(R.id.activity_main_fragment_buy).setVisibility(View.GONE);
        findViewById(R.id.activity_main_buy_shadow).setVisibility(View.GONE);
    }

    public class DownloadPaidAppOpener implements View.OnClickListener {
        private static final String sPadPackage = "pl.grzeslowski.transporter";
        private static final String sMarketUri = "market://details?id=" + sPadPackage;

        private final Activity mActivity;

        private DownloadPaidAppOpener(Activity activity) {
            mActivity = activity;
        }

        @Override
        public void onClick(View v) {
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(sMarketUri));

                mActivity.startActivity(intent);
            } catch (ActivityNotFoundException ex) {
                Log.e("free_version", "Could not open [" + sMarketUri + "]", ex);
            }
        }
    }
}
