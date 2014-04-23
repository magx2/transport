package pl.grzeslowski.transport.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.Collections2;

import java.util.ArrayList;
import java.util.List;

import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;

public class ResultListAdapter extends BaseAdapter {

    private final List<Connection> mConnections;
    private final LayoutInflater mInflater;

    public ResultListAdapter(List<Connection> connections, Activity activity) {
        mConnections = new ArrayList<Connection>(Preconditions.checkNotNull(connections));
        mInflater = activity.getLayoutInflater();
    }

    @Override
    public int getCount() {
        return mConnections.size();
    }

    @Override
    public Object getItem(int position) {
        return mConnections.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_result, null);
            viewHolder = new ViewHolder(convertView);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Connection connection = mConnections.get(position);

        String cities = Joiner.on(", ").join(Collections2.transform(connection.getPath(), new Function<City, String>() {
            @Override
            public String apply(City input) {
                return input.getName();
            }
        }));
        String text = String.format("by: %s%ntime: %02d:%02d%npath: [%s]", connection.getProvider().getName(), connection.getTime().getHourOfDay(), connection.getTime().getMinuteOfHour(), cities);
        viewHolder.mTextView.setText(text);

        return convertView;
    }

    private class ViewHolder {
        private TextView mTextView;

        ViewHolder(View convertView) {
            mTextView = (TextView) convertView.findViewById(R.id.list_result_text_view);
        }
    }

}
