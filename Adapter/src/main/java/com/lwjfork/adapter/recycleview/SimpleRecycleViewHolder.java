package com.lwjfork.adapter.recycleview;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.lwjfork.adapter.IFindAppCompatViewHelper;

/**
 * Created:2018/6/1
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public class SimpleRecycleViewHolder extends RecyclerView.ViewHolder implements IFindAppCompatViewHelper {


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
        T tView = (T) itemView.findViewById(viewId);
        views.put(viewId, tView);
        return tView;
    }

}
