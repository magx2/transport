package pl.grzeslowski.transport.activities;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.fragments.BuyFragment;
import pl.grzeslowski.transport.tools.BuyFragmentInitializer;
import pl.grzeslowski.transport.tools.MenuHelper;


@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.main)
public class MainActivity extends AdSenseActivity {
    private final MenuHelper mMenuHelper;

    @FragmentById(R.id.fragment_buy)
    BuyFragment mBuyFragment;

    public MainActivity() {
        mMenuHelper = new MenuHelper(this);
    }

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
        final BuyFragmentInitializer buyFragmentInitializer = new BuyFragmentInitializer(this);

        buyFragmentInitializer.initBuyFragment(mBuyFragment);
    }
}
