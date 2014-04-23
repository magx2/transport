package pl.grzeslowski.transport.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
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

public class ResultListAdapter extends BaseExpandableListAdapter {

    private final List<Connection> mConnections;
    private final LayoutInflater mInflater;

    public ResultListAdapter(List<Connection> connections, Activity activity) {
        mConnections = new ArrayList<Connection>(Preconditions.checkNotNull(connections));
        mInflater = activity.getLayoutInflater();
    }

    @Override
    public int getGroupCount() {
        return mConnections.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_result, null);
            viewHolder = new ViewHolder(convertView);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Connection connection = mConnections.get(groupPosition);

        String text = String.format("by: %s%ntime: %02d:%02d", connection.getProvider().getName(), connection.getTime().getHourOfDay(), connection.getTime().getMinuteOfHour());
        viewHolder.mTextView.setText(text);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ChildViewHolder viewHolder;

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_result_expanded, null);
            viewHolder = new ChildViewHolder(convertView);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ChildViewHolder) convertView.getTag();
        }

        Connection connection = mConnections.get(groupPosition);

        String cities = Joiner.on(", ").join(Collections2.transform(connection.getPath(), new Function<City, String>() {
            @Override
            public String apply(City input) {
                return input.getName();
            }
        }));
        viewHolder.mTextView.setText(cities);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    private class ViewHolder {
        private TextView mTextView;

        ViewHolder(View convertView) {
            mTextView = (TextView) convertView.findViewById(R.id.list_result_text_view);
        }
    }

    private class ChildViewHolder {
        private TextView mTextView;

        ChildViewHolder(View convertView) {
            mTextView = (TextView) convertView.findViewById(R.id.list_result_expanded_text_view);
        }
    }

}
