package pl.grzeslowski.transport.fragments;

import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.Arrays;

import pl.grzeslowski.transport.R;

/**
 * Created by Martin on 2014-04-22.
 */
@EFragment(R.layout.fragment_result)
public class ResultFragment extends Fragment {

    @ViewById(R.id.fragment_result_list)
    ListView mResultList;

    @AfterViews
    void prepare() {
        ListAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, Arrays.asList("as", "df", "fg"));
        mResultList.setAdapter(adapter);
    }
}
