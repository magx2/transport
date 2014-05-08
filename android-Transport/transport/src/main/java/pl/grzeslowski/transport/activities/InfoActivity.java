package pl.grzeslowski.transport.activities;

import android.support.v7.app.ActionBarActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;
import org.androidannotations.annotations.OptionsItem;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.fragments.BuyFragment;
import pl.grzeslowski.transport.tools.BuyFragmentInitializer;


@EActivity(R.layout.activity_info)
public class InfoActivity extends ActionBarActivity {

    @FragmentById(R.id.fragment_buy)
    BuyFragment mBuyFragment;

    @AfterViews
    void prepare() {

        // turning on back method for action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initBuyFragment();
    }

    private void initBuyFragment() {
        final BuyFragmentInitializer buyFragmentInitializer = new BuyFragmentInitializer(this);

        buyFragmentInitializer.initBuyFragment(mBuyFragment);
    }

    @OptionsItem(android.R.id.home)
    void multipleMenuItems() {
        finish();
    }
}
