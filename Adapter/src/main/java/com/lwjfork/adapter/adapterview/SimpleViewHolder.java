package com.lwjfork.adapter.adapterview;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v4.util.SparseArrayCompat;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created:2018/5/30
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */
@SuppressWarnings({"unused", "WeakerAccess", "unchecked"})
public final class SimpleViewHolder {


    private SparseArrayCompat<View> views = new SparseArrayCompat<>();

    private View convertView;

    public static SimpleViewHolder getViewHolder(View convertView, ViewGroup parent, int layoutId) {
        SimpleViewHolder viewHolder;
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


    public final <T extends View> T findViewById(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            return putViewById(viewId);
        } else {
            return (T) views.get(viewId);
        }
    }


    @SuppressWarnings("unchecked")
    protected final <T extends View> T putViewById(@IdRes int viewId) {
        T tView = (T) convertView.findViewById(viewId);
        views.put(viewId, tView);

        return tView;
    }
}
