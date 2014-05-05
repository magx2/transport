package pl.grzeslowski.transport.activities;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crashlytics.android.Crashlytics;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.fragments.BuyFragment;
import pl.grzeslowski.transport.product_flavors.MonetizationType;


@EActivity(R.layout.activity_main)
public class MainActivity extends ActionBarActivity {

    @FragmentById(R.id.activity_main_fragment_buy)
    BuyFragment mBuyFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initCrashlitics();
    }

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


    private void initCrashlitics() {
        Crashlytics.start(this);
        Crashlytics.log(Log.INFO, "INIT", String.format(
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
        ));
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_search, container, false);
            return rootView;
        }
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
