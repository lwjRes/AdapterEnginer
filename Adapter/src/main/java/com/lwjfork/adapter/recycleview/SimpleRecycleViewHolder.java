package com.lwjfork.adapter.recycleview;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
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
 * Created:2018/6/1
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public class SimpleRecycleViewHolder extends RecyclerView.ViewHolder {


    public static SimpleRecycleViewHolder getViewHolder(ViewGroup parent, int layoutId) {
        Context context = parent.getContext();
        View itemView = View.inflate(context, layoutId, null);
        return new SimpleRecycleViewHolder(itemView);
    }

    public SimpleRecycleViewHolder(View itemView) {
        super(itemView);
    }


    private SparseArrayCompat<View> views = new SparseArrayCompat<>();


    public View getConvertView() {
        return itemView;
    }


    @SuppressWarnings("unchecked")
    public <T extends View> T findViewById(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            return putViewById(viewId);
        } else {
            return (T) views.get(viewId);
        }
    }

    @SuppressWarnings("unchecked")
    private <T extends View> T putViewById(int viewId) {
        T tView = (T) itemView.findViewById(viewId);
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
