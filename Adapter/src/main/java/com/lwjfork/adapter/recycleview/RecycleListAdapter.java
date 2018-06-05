package com.lwjfork.adapter.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created:2018/6/1
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public abstract class RecycleListAdapter<T, K extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<K> {


    protected List<T> mData = Collections.emptyList();
    private int layoutId;


    public RecycleListAdapter() {
        this(Collections.<T>emptyList());
    }

    public RecycleListAdapter(List<T> mData) {
        super();
        this.mData = mData;
    }

    @Override
    public abstract K onCreateViewHolder(ViewGroup parent, int viewType);

    @Override
    public abstract void onBindViewHolder(K holder, int position);


    public final T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public final int getItemCount() {
        return mData == null ? 0 : mData.size();
    }


    public final void setData(List<T> data) {
        this.mData = data;
        notifyDataSetChanged();
    }


    public final void addItem2First(boolean isAnim, T item) {
        addItem(isAnim, 0, item);
    }

    public final void addItems2First(boolean isAnim, T... items) {
        addItems(isAnim, 0, items);
    }


    public final void addItems2First(boolean isAnim, List<T> items) {
        addItems(isAnim, 0, items);
    }

    public final void addItem2Last(boolean isAnim, T item) {
        int count = mData.size();
        addItem(isAnim, count, item);
    }

    public final void addItems2Last(boolean isAnim, T... items) {
        int count = mData.size();
        addItems(isAnim, count, items);
    }

    public final void addItems2Last(boolean isAnim, List<T> items) {
        int count = mData.size();
        addItems(isAnim, count, items);
    }

    @SuppressWarnings("unchecked")
    public final void addItems(boolean isAnim, int index, T... items) {
        mData.addAll(index, array2ArrayList(items));
        if (isAnim) {
            notifyItemRangeInserted(index, items.length);
        } else {
            notifyDataSetChanged();
        }
    }

    @SuppressWarnings("unchecked")
    public final void addItems(boolean isAnim, int index, List<T> items) {
        mData.addAll(index, items);
        if (isAnim) {
            notifyItemRangeInserted(index, items.size());
        } else {
            notifyDataSetChanged();
        }
    }


    public final void addItem(boolean isAnim, int index, T item) {
        mData.add(index, item);
        if (isAnim) {
            notifyItemInserted(index);
        } else {
            notifyDataSetChanged();
        }
    }

    public void rmove(boolean isAnim, T data) {
        int index = mData.indexOf(data);
        if (index >= 0) {
            mData.remove(data);
            if (isAnim) {
                notifyItemRemoved(index);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    public void removes(boolean isAnim, List<T> data) {
        mData.removeAll(data);
        notifyDataSetChanged();

        int index = Collections.indexOfSubList(mData, data);
        if (index >= 0) {
            mData.removeAll(data);
            if (isAnim) {
                notifyItemRangeRemoved(index, data.size());
            } else {
                notifyDataSetChanged();
            }
        }
    }


    @SuppressWarnings("unchecked")
    public List<T> array2ArrayList(T... objects) {
        return Arrays.asList(objects);
    }
}
