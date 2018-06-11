package com.lwjfork.adapter.recycleview;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.lwjfork.adapter.IViewHelper;

/**
 * Created:2018/6/1
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public final class SimpleRecycleViewHolder extends RecyclerView.ViewHolder implements IViewHelper {


    public static SimpleRecycleViewHolder getViewHolder(ViewGroup parent, int layoutId) {
        Context context = parent.getContext();
        View itemView = View.inflate(context, layoutId, null);
        return new SimpleRecycleViewHolder(itemView);
    }

    public SimpleRecycleViewHolder(View itemView) {
        super(itemView);
    }


    private final SparseArrayCompat<View> views = new SparseArrayCompat<>();


    public final View getConvertView() {
        return itemView;
    }


    @Override
    public Context getContextHelper() {
        return itemView.getContext();
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
    protected final <T extends View> T putViewById(int viewId) {
        T tView = findViewByID(itemView, viewId);
        views.put(viewId, tView);
        return tView;
    }

}
