package com.lwj.adapter.recycleview;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created:2018/6/1
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */
@SuppressWarnings({"unchecked",
        "unused",
        "WeakerAccess",
})
public final class SimpleRecycleViewHolder extends RecyclerView.ViewHolder {


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
        T tView = (T) itemView.findViewById(viewId);
        views.put(viewId, tView);

        return tView;
    }

}
