package pl.grzeslowski.transport.fragments;

import android.support.v4.app.Fragment;
import android.widget.TextView;

import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.activities.MainActivity;

@EFragment(R.layout.fragment_buy)
public class BuyFragment extends Fragment {

    @ViewById(R.id.fragment_buy_link)
    TextView mLink;

   public void setOnLinkClickListener(MainActivity.DownloadPaidAppOpener appOpener) {
       mLink.setOnClickListener(appOpener);
   }
}
