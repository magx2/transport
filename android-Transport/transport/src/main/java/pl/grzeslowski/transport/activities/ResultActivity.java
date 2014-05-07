package pl.grzeslowski.transport.activities;

import com.google.common.base.Preconditions;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.FragmentById;
import org.androidannotations.annotations.OptionsItem;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.fragments.ResultFragment;
import pl.grzeslowski.transport.model.City;

@EActivity(R.layout.activity_result)
public class ResultActivity extends AdSenseActivity {

    @Extra
    City mFrom;
    @Extra
    City mTo;
    @FragmentById(R.id.activity_result_fragment_result)
    ResultFragment mResultFragment;

    @AfterViews
    void prepare() {
        Preconditions.checkNotNull(mFrom);
        Preconditions.checkNotNull(mTo);

        mResultFragment.showResultsFor(mFrom, mTo);

        // turning on back method for action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @OptionsItem(android.R.id.home)
    void multipleMenuItems() {
        finish();
    }

}
