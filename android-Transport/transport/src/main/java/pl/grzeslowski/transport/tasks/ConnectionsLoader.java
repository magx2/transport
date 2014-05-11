package pl.grzeslowski.transport.tasks;

import android.os.AsyncTask;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.common.base.Preconditions;

import java.util.List;

import pl.grzeslowski.transport.TransporterApplication;
import pl.grzeslowski.transport.fragments.ResultFragment;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.repository.DatabaseManager;
import pl.grzeslowski.transport.tools.Profiler;

public class ConnectionsLoader extends AsyncTask<City, Void, List<Connection>> {

    public static final String CATEGORY = "PROFILING";
    public static final String ACTION = "mDatabaseManager.getConnections(City, City)";
    private static final String SCREEN_NAME = "CONNECTIONS_LOADER";
    private final DatabaseManager mDatabaseManager;
    private final ResultFragment mResultFragment;
    private final TransporterApplication mTransporterApplication;

    public ConnectionsLoader(TransporterApplication transporterApplication, DatabaseManager databaseManager, ResultFragment resultFragment) {
        mTransporterApplication = Preconditions.checkNotNull(transporterApplication);
        mDatabaseManager = Preconditions.checkNotNull(databaseManager);
        mResultFragment = Preconditions.checkNotNull(resultFragment);
    }


    @Override
    protected List<Connection> doInBackground(City... params) {
        City from = params[0];
        City to = params[1];

        final Profiler profiler = new Profiler().start();
        final List<Connection> connections = mDatabaseManager.getConnections(from, to);
        final long end = profiler.stop().getEnd();

        sendTimeToGoogleAnalytics(end, from, to);

        return connections;
    }

    private void sendTimeToGoogleAnalytics(long end, City from, City to) {
        final Tracker tracker = mTransporterApplication.getTracker();
        if (tracker != null) {
            tracker.setScreenName(SCREEN_NAME);

            tracker.send(new HitBuilders.EventBuilder()
                    .setCategory(CATEGORY)
                    .setAction(ACTION)
                    .setLabel(buildLabelString(end, from, to))
                    .build());

            tracker.setScreenName(null);
        }
    }

    private String buildLabelString(long end, City from, City to) {
        return String.format("TIME{%6s} FROM{%s} TO{%s}", end, from, to);
    }

    @Override
    protected void onPostExecute(List<Connection> connections) {
        mResultFragment.parseResultsToList(connections);
    }
}
