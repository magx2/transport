package pl.grzeslowski.transport.activities;

import com.google.common.base.Preconditions;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.FragmentById;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.fragments.BuyFragment;
import pl.grzeslowski.transport.fragments.ResultFragment;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.tools.BuyFragmentInitializer;
import pl.grzeslowski.transport.tools.MenuHelper;

@EActivity(R.layout.activity_result)
@OptionsMenu(R.menu.main)
public class ResultActivity extends AdSenseActivity {
    private MenuHelper mMenuHelper;

    @FragmentById(R.id.fragment_buy)
    BuyFragment mBuyFragment;
    @Extra
    City mFrom;
    @Extra
    City mTo;
    @FragmentById(R.id.activity_result_fragment_result)
    ResultFragment mResultFragment;

    @OptionsItem(R.id.menu_info)
    void showInfo() {
        mMenuHelper.showInfo();
    }

    @OptionsItem(R.id.menu_feedback)
    void sendFeedback() {
        mMenuHelper.sendFeedback();
    }

    @AfterViews
    void prepare() {
        Preconditions.checkNotNull(mFrom);
        Preconditions.checkNotNull(mTo);

        mResultFragment.showResultsFor(mFrom, mTo);

        // turning on back method for action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initBuyFragment();

        mMenuHelper = new MenuHelper(this);
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
