package pl.grzeslowski.transport.fragments;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.idunnololz.widgets.AnimatedExpandableListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.TransporterApplication;
import pl.grzeslowski.transport.adapters.ResultListAdapter;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.repository.DatabaseManager;
import pl.grzeslowski.transport.tasks.ConnectionsLoader;
import pl.grzeslowski.transport.tools.ConnectionComparator;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.util.Collections.sort;

@EFragment(R.layout.fragment_result)
public class ResultFragment extends Fragment {
    private static final String sConnectionsTag = "connections";
    private static final String sFromTag = "from";
    private static final String sToTag = "to";
    private static final String SCREEN_NAME = "PROGRESS_DIALOG";
    private static final String CATEGORY = "CANCEL";
    private static final String sSdf = "hh:mm";

    @ViewById(R.id.fragment_result_list)
    AnimatedExpandableListView mResultList;
    @ViewById(R.id.fragment_result_empty_view)
    View mEmptyView;
    @Bean
    DatabaseManager mDatabaseManager;
    private List<Connection> mConnections = new ArrayList<Connection>();
    private ProgressDialog mProgressDialog;
    private ConnectionsLoader mLoader;
    private City mFrom;
    private City mTo;

    @AfterViews
    void prepare() {
        if (!mConnections.isEmpty()) {
            parseResultsToList(mConnections);
        }

        initAnimatingList();
        initEmptyView();
    }

    private void initAnimatingList() {
        mResultList.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                // We call collapseGroupWithAnimation(int) and
                // expandGroupWithAnimation(int) to animate group
                // expansion/collapse.
                if (mResultList.isGroupExpanded(groupPosition)) {
                    mResultList.collapseGroupWithAnimation(groupPosition);
                } else {
                    mResultList.expandGroupWithAnimation(groupPosition);
                }
                return true;
            }

        });
    }

    private void initEmptyView() {
        mResultList.setEmptyView(mEmptyView);
    }

    public void showResultsFor(final City from, final City to) {
        if (mLoader == null) {
            mFrom = from;
            mTo = to;

            showProgressDialog();

            checkNotNull(from);
            checkNotNull(to);

            final TransporterApplication application = (TransporterApplication) getActivity().getApplication();
            mLoader = new ConnectionsLoader(application, mDatabaseManager, this);
            mLoader.execute(from, to);
        }
    }

    private void showProgressDialog() {
        mProgressDialog = new ProgressDialog(getActivity(), R.style.TransporterProgressDialog);
        mProgressDialog.setTitle(getActivity().getString(R.string.loading_connections_title));
        mProgressDialog.setMessage(getActivity().getString(R.string.loading_connections_message));

        final TransporterApplication transporterApplication = (TransporterApplication) getActivity().getApplication();
        mProgressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                closeLoader();
                sendToGoogleAnalytics();
            }

            private void sendToGoogleAnalytics() {
                final Tracker tracker = transporterApplication.getTracker();
                if (tracker != null) {
                    tracker.setScreenName(SCREEN_NAME);

                    final SimpleDateFormat sdf = new SimpleDateFormat(sSdf);
                    final Date now = new Date();
                    String action = sdf.format(now);

                    tracker.send(new HitBuilders.EventBuilder()
                            .setAction(CATEGORY)
                            .setLabel(action)
                            .build());

                    tracker.setScreenName(null);
                }
            }

        });
        mProgressDialog.show();
    }

    public void parseResultsToList(final List<Connection> connections) {
        sort(connections, new ConnectionComparator());
        setAdapter(connections);

        mConnections = connections;

        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
        mLoader = null;
    }

    private void setAdapter(List<Connection> elements) {
        ResultListAdapter adapter = new ResultListAdapter(elements, getActivity(), mFrom, mTo);
        mResultList.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mConnections = (List<Connection>) savedInstanceState.get(sConnectionsTag);
            mFrom = (City) savedInstanceState.get(sFromTag);
            mTo = (City) savedInstanceState.get(sToTag);
        }

        return null;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putSerializable(sConnectionsTag, new ArrayList<Connection>(mConnections));
        outState.putSerializable(sFromTag, mFrom);
        outState.putSerializable(sToTag, mTo);

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onPause() {
        super.onPause();

        closeLoader();
    }

    private void closeLoader() {
        if (mLoader != null) {
            mLoader.cancel(true);
            mLoader = null;
        }
    }
}
