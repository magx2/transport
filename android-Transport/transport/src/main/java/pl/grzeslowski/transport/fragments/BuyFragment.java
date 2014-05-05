package pl.grzeslowski.transport.fragments;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.product_flavors.MonetizationType;

@EFragment(R.layout.fragment_buy)
public class BuyFragment extends Fragment {

    @ViewById(R.id.fragment_buy_link)
    TextView mLink;

    @AfterViews
    void prepare() {
        if (BuildConfig.MONETIAZATION_TYPE == MonetizationType.PAID) {
            getView().setVisibility(View.GONE);

            final View shadow = getActivity().findViewById(R.id.activity_main_buy_shadow);
            shadow.setVisibility(View.GONE);
        } else {
            final DownloadPaidAppOpener appOpener = new DownloadPaidAppOpener(getActivity());

            mLink.setOnClickListener(appOpener);
        }
    }


    private class DownloadPaidAppOpener implements View.OnClickListener {
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
