package com.lwjfork.adapter.adapterview;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created:2018/5/30
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public class SimpleViewHolder {


    private SparseArrayCompat<View> views = new SparseArrayCompat<>();

    private View convertView;


    public static SimpleViewHolder getViewHolder(View convertView, ViewGroup parent, int layoutId) {
        SimpleViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new SimpleViewHolder();
            Context context = parent.getContext();
            View itemView = View.inflate(context, layoutId, null);
            viewHolder.putConvertView(itemView);
            itemView.setTag(viewHolder);

        } else {
            viewHolder = (SimpleViewHolder) convertView.getTag();
        }

        return viewHolder;
    }

    public View getConvertView() {
        return convertView;
    }

    public void putConvertView(View convertView) {
        this.convertView = convertView;
    }


    @SuppressWarnings("unchecked")
    public <T extends View> T findViewById(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            return putView(viewId);
        } else {
            return (T) views.get(viewId);
        }
    }

    @SuppressWarnings("unchecked")
    private <T extends View> T putView(int viewId) {
        T tView = (T) convertView.findViewById(viewId);
        views.put(viewId, tView);

        return tView;
    }


    public LinearLayout findLinearLayoutById(int viewId) {
        return findViewById(viewId);
    }


    public RelativeLayout findRelativeLayoutById(int viewId) {
        return findViewById(viewId);
    }

    public FrameLayout findFrameLayoutById(int viewId) {
        return findViewById(viewId);
    }


    public TextView findTextViewById(int viewId) {
        return findViewById(viewId);
    }


    public Button findButtonById(int viewId) {
        return findViewById(viewId);
    }


    public ImageView findImageViewById(int viewId) {
        return findViewById(viewId);
    }


    public ImageButton findImageButtonById(int viewId) {
        return findViewById(viewId);
    }


    public CheckBox findCheckBoxById(int viewId) {
        return findViewById(viewId);
    }


    public RadioButton findRadioButtonById(int viewId) {
        return findViewById(viewId);
    }


    public RadioGroup findRadioGroupById(int viewId) {
        return findViewById(viewId);
    }

    public Switch findSwitchById(int viewId) {
        return findViewById(viewId);
    }


}
