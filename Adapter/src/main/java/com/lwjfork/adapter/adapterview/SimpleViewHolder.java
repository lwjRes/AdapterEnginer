package com.lwjfork.adapter.adapterview;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import android.view.View;
import android.view.ViewGroup;

import com.lwjfork.adapter.IFindAppCompatViewHelper;
import com.lwjfork.adapter.IFindViewHelper;

/**
 * Created:2018/5/30
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public class SimpleViewHolder implements IFindAppCompatViewHelper {


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

    public final View getConvertView() {
        return convertView;
    }

    public final void putConvertView(View convertView) {
        this.convertView = convertView;
    }


    @SuppressWarnings("unchecked")
    @Override
    public final <T extends View> T findViewByID(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            return putViewById(viewId);
        } else {
            return (T) views.get(viewId);
        }
    }

    @SuppressWarnings("unchecked")
    protected <T extends View> T putViewById(int viewId) {
        T tView = (T) convertView.findViewById(viewId);
        views.put(viewId, tView);

        return tView;
    }
}
