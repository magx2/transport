package pl.grzeslowski.transport.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crashlytics.android.Crashlytics;

import org.androidannotations.annotations.EActivity;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.R;



@EActivity(R.layout.activity_main)
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Crashlytics.start(this);
        Crashlytics.log(Log.INFO, "INIT", String.format("VERSION_CODE: %s,\nVERSION_NAME: %s,\nMONETIAZATION_TYPE: %s,\nDATABASE_VERSION: %s,\nDATABASE_NAME: %s", BuildConfig.VERSION_CODE, BuildConfig.VERSION_NAME, BuildConfig.MONETIAZATION_TYPE, BuildConfig.DATABASE_VERSION, BuildConfig.DATABASE_NAME));
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
}
