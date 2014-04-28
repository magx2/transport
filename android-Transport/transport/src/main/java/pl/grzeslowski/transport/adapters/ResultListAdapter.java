package pl.grzeslowski.transport.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.google.common.base.Preconditions;

import org.joda.time.LocalTime;

import java.util.ArrayList;
import java.util.List;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.ConnectionMark;
import pl.grzeslowski.transport.product_flavors.MonetizationType;

public class ResultListAdapter extends BaseExpandableListAdapter {

    private static final int sChildrenCount = 1;
    private static final int sFreeVersionMark = 1;
    private final Activity mActivity;
    private final List<Connection> mConnections;
    private final LayoutInflater mInflater;

    public ResultListAdapter(List<Connection> connections, Activity activity) {
        mConnections = new ArrayList<Connection>(Preconditions.checkNotNull(connections));
        mActivity = Preconditions.checkNotNull(activity);
        mInflater = activity.getLayoutInflater();
    }

    @Override
    public int getGroupCount() {
        return mConnections.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        if (BuildConfig.MONETIAZATION_TYPE == MonetizationType.PAID) {
            return sChildrenCount + mConnections.get(groupPosition).getMarks().size();
        } else {
            return sChildrenCount + sFreeVersionMark;
        }
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

        viewHolder.mProvider.setText(connection.getProvider().getName());

        final LocalTime searchTime = connection.getTime();
        viewHolder.mSearchTime.setText(String.format("%02d:%02d", searchTime.getHourOfDay(), searchTime.getMinuteOfHour()));

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (childPosition >= sChildrenCount) {

            // show marks
            return showMarks(convertView, groupPosition, childPosition);
        } else {

            // show normal child
            return showExpandedView(convertView, groupPosition);
        }
    }

    private View showExpandedView(View convertView, int groupPosition) {
        ChildViewHolder viewHolder;

        if (convertView != null && convertView.getTag() instanceof ChildViewHolder) {
            viewHolder = (ChildViewHolder) convertView.getTag();
        } else {
            convertView = mInflater.inflate(R.layout.list_result_expanded, null);
            viewHolder = new ChildViewHolder(convertView);

            convertView.setTag(viewHolder);
        }

        Connection connection = mConnections.get(groupPosition);

        final List<City> path = connection.getPath();
        viewHolder.mPath.setText(String.format("%s - %s", path.get(0).getName(), path.get(path.size() - 1).getName()));
        viewHolder.mDeparture.setText(connection.getDeparture());
        viewHolder.mPrice.setText(String.format("%s %s / %s %s", connection.getNormalPrice(), mActivity.getString(R.string.normal_price), connection.getStudentPrice(), mActivity.getString(R.string.student_price)));

        return convertView;
    }

    private View showMarks(View convertView, int groupPosition, int childPosition) {
        MarkViewHolder viewHolder;

        if (convertView != null && convertView.getTag() instanceof MarkViewHolder) {
            viewHolder = (MarkViewHolder) convertView.getTag();
        } else {
            convertView = mInflater.inflate(R.layout.list_result_mark, null);
            viewHolder = new MarkViewHolder(convertView);

            convertView.setTag(viewHolder);
        }

        if (BuildConfig.MONETIAZATION_TYPE == MonetizationType.PAID) {
            List<ConnectionMark> marks = mConnections.get(groupPosition).getMarks();
            viewHolder.mMarkView.setText(marks.get(childPosition - sChildrenCount).getMark());
        } else {
            viewHolder.mMarkView.setText(mActivity.getString(R.string.marks_in_paid_version));
        }

        viewHolder.mMarkView.setSelected(true);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    private class ViewHolder {
        private TextView mProvider;
        private TextView mSearchTime;

        ViewHolder(View convertView) {
            mProvider = (TextView) convertView.findViewById(R.id.list_result_provider);
            mSearchTime = (TextView) convertView.findViewById(R.id.list_result_time_search_connection);
        }
    }

    private class ChildViewHolder {
        private TextView mPath;
        private TextView mPrice;
        private TextView mDeparture;

        ChildViewHolder(View convertView) {
            mPath = (TextView) convertView.findViewById(R.id.list_result_expanded_path);
            mPrice = (TextView) convertView.findViewById(R.id.list_result_expanded_price);
            mDeparture = (TextView) convertView.findViewById(R.id.list_result_expanded_departure);
        }
    }

    private class MarkViewHolder {
        private TextView mMarkView;

        MarkViewHolder(View convertView) {
            mMarkView = (TextView) convertView.findViewById(R.id.list_result_mark_mark);
        }
    }

}
