package pl.grzeslowski.transport.tasks;

import android.os.AsyncTask;

import com.google.common.base.Preconditions;

import java.util.List;

import pl.grzeslowski.transport.fragments.ResultFragment;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.repository.DatabaseManager;

/**
 * Created by Martin on 2014-04-28.
 */
public class ConnectionsLoader extends AsyncTask<City, Void, List<Connection>> {

    private final DatabaseManager mDatabaseManager;
    private final ResultFragment mResultFragment;

    public ConnectionsLoader(DatabaseManager databaseManager, ResultFragment resultFragment) {
        mDatabaseManager = Preconditions.checkNotNull(databaseManager);
        mResultFragment = Preconditions.checkNotNull(resultFragment);
    }


    @Override
    protected List<Connection> doInBackground(City... params) {
        City from = params[0];
        City to = params[1];

        return mDatabaseManager.getConnections(from, to);
    }

    @Override
    protected void onPostExecute(List<Connection> connections) {
        mResultFragment.parseResultsToList(connections);
    }
}
