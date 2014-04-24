package pl.grzeslowski.transport.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class RememberingStateSpinner extends Spinner {
    private Object mActualItem;
    private OnItemSelected mOnItemSelected;

    public RememberingStateSpinner(Context context) {
        super(context);
        init();
    }

    public RememberingStateSpinner(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RememberingStateSpinner(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private final void init() {
        super.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                RememberingStateSpinner.this.onItemSelected(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void onItemSelected(int position) {
        mOnItemSelected.selected(position, mActualItem);

        mActualItem = this.getAdapter().getItem(position);
    }

    public void setOnItemSelected(OnItemSelected onItemSelected) {
        mOnItemSelected = onItemSelected;
    }

    @Override
    public void setOnItemSelectedListener(OnItemSelectedListener listener) {
        throw new UnsupportedOperationException("This is not supported! Use setOnItemSelected(...) instead.");
    }


    public interface OnItemSelected {
        void selected(int newPosition, Object oldObject);
    }
}
