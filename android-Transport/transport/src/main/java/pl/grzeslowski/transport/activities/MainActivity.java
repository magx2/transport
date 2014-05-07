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

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.fragments.BuyFragment;
import pl.grzeslowski.transport.product_flavors.MonetizationType;


@EActivity(R.layout.activity_main)
public class MainActivity extends AdSenseActivity {

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
