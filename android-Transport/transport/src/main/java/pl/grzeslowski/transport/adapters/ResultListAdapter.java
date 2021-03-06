package pl.grzeslowski.transport.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.idunnololz.widgets.AnimatedExpandableListView;

import org.joda.time.LocalTime;

import java.util.ArrayList;
import java.util.List;

import pl.grzeslowski.transport.BuildConfig;
import pl.grzeslowski.transport.R;
import pl.grzeslowski.transport.model.City;
import pl.grzeslowski.transport.model.Connection;
import pl.grzeslowski.transport.model.ConnectionMark;
import pl.grzeslowski.transport.product_flavors.MonetizationType;
import pl.grzeslowski.transport.tools.TimeCounter;

import static com.google.common.base.Preconditions.checkNotNull;

public class ResultListAdapter extends AnimatedExpandableListView.AnimatedExpandableListAdapter {

    private static final int sChildrenCount = 1;
    private static final int sFreeVersionMark = 1;
    private final Activity mActivity;
    private final List<Connection> mConnections;
    private final LayoutInflater mInflater;
    private final TimeCounter mTimeCounter;
    private final City mFrom;
    private final City mTo;
    private final int mStrongBackgroungColor;
    private final int mWeakBackgroungColor;

    public ResultListAdapter(List<Connection> connections, Activity activity, City from, City to) {
        mConnections = new ArrayList<Connection>(checkNotNull(connections));
        mActivity = checkNotNull(activity);
        mInflater = activity.getLayoutInflater();
        mTimeCounter = new TimeCounter();

        mFrom = checkNotNull(from);
        mTo = checkNotNull(to);

        mStrongBackgroungColor = activity.getResources().getColor(R.color.apptheme_color);
        mWeakBackgroungColor = activity.getResources().getColor(R.color.apptheme_color_light);
    }

    @Override
    public int getGroupCount() {
        return mConnections.size();
    }

    @Override
    public int getRealChildrenCount(int groupPosition) {
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
        final String time = String.format("%02d:%02d", searchTime.getHourOfDay(), searchTime.getMinuteOfHour());

        String formattedTimeTo = "";
        if (mTimeCounter.shouldCountTimeTo(searchTime)) {
            final int timeTo = mTimeCounter.countTimeTo(searchTime);

            formattedTimeTo = String.format(" (za %02d:%02d)", timeTo / 60, timeTo % 60);
        }
        viewHolder.mSearchTime.setText(time + formattedTimeTo);

        int color;
        if (isStartingAndEndingInSearchingResults(connection.getPath())) {
            color = mStrongBackgroungColor;
        } else {
            color = mWeakBackgroungColor;
        }
        viewHolder.mLayout.setBackgroundColor(color);

        return convertView;
    }

    private boolean isStartingAndEndingInSearchingResults(List<City> path) {
        City from = path.get(0);
        City to = path.get(path.size() - 1);

        return mFrom.equals(from) && mTo.equals(to);
    }

    @Override
    public View getRealChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (childPosition >= sChildrenCount) {

            // show marks
            return showMarks(convertView, groupPosition, childPosition, parent);
        } else {

            // show normal child
            return showExpandedView(convertView, groupPosition, parent);
        }
    }

    private View showExpandedView(View convertView, int groupPosition, ViewGroup parent) {
        ChildViewHolder viewHolder;

        if (convertView != null && convertView.getTag() instanceof ChildViewHolder) {
            viewHolder = (ChildViewHolder) convertView.getTag();
        } else {
            convertView = mInflater.inflate(R.layout.list_result_expanded, parent, false);
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

    private View showMarks(View convertView, int groupPosition, int childPosition, ViewGroup parent) {
        final int realChildPosition = childPosition - sChildrenCount;

        MarkViewHolder viewHolder;

        if (convertView != null && convertView.getTag() instanceof MarkViewHolder) {
            viewHolder = (MarkViewHolder) convertView.getTag();
        } else {
            convertView = mInflater.inflate(R.layout.list_result_mark, parent, false);
            viewHolder = new MarkViewHolder(convertView);

            convertView.setTag(viewHolder);
        }

        if (BuildConfig.MONETIAZATION_TYPE == MonetizationType.PAID) {
            showPaidMark(groupPosition, realChildPosition, viewHolder);
        } else {
            showFreeMark(realChildPosition, viewHolder);
        }

        viewHolder.mMarkView.setSelected(true);

        return convertView;
    }

    private void showPaidMark(int groupPosition, int realChildPosition, MarkViewHolder viewHolder) {
        List<ConnectionMark> marks = mConnections.get(groupPosition).getMarks();
        viewHolder.mMarkView.setText(marks.get(realChildPosition).getMark());
    }

    private void showFreeMark(int realChildPosition, MarkViewHolder viewHolder) {
        viewHolder.mMarkView.setText(mActivity.getString(R.string.marks_in_paid_version));

        viewHolder.mMarkView.setOnClickListener(null);
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    private class ViewHolder {
        private View mLayout;
        private TextView mProvider;
        private TextView mSearchTime;

        ViewHolder(View convertView) {
            mLayout = convertView.findViewById(R.id.list_result_layout);
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
