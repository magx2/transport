package pl.grzeslowski.transport.tools;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.fragments.BuyFragment;
import pl.grzeslowski.transport.product_flavors.MonetizationType;

public class BuyFragmentInitializer {

    private final Activity mActivity;

    public BuyFragmentInitializer(Activity activity) {
        mActivity = activity;
    }

    public void initBuyFragment(BuyFragment buyFragment) {
        if (BuildConfig.MONETIAZATION_TYPE == MonetizationType.PAID) {
            hideBuyRelatedViews();
        } else {
            initOpeningShow(buyFragment);
        }
    }
    private void initOpeningShow(BuyFragment buyFragment) {
        final DownloadPaidAppOpener appOpener = new DownloadPaidAppOpener(mActivity);
        buyFragment.setOnLinkClickListener(appOpener);
    }

    private void hideBuyRelatedViews() {
        mActivity.findViewById(R.id.fragment_buy).setVisibility(View.GONE);
        mActivity.findViewById(R.id.fragment_buy_shadow).setVisibility(View.GONE);
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
