package com.lwjfork.adapter.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

/**
 * Created:2018/6/1
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public class SimpleRecycleListAdapter<T> extends RecyclerView.Adapter<SimpleRecycleViewHolder> {

    private List<T> mData = Collections.emptyList();
    private int layoutId;


    public SimpleRecycleListAdapter() {
    }

    public SimpleRecycleListAdapter(List<T> mData) {
        this.mData = mData;
    }

    @Override
    public SimpleRecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return SimpleRecycleViewHolder.getViewHolder(parent, layoutId);
    }

    @Override
    public void onBindViewHolder(SimpleRecycleViewHolder holder, int position) {
        fillData(holder, position, getItem(position));
    }

    protected void fillData(SimpleRecycleViewHolder holder, int position, T data) {

    }

    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }


    public void setData(List<T> data) {
        this.mData = data;
        notifyDataSetChanged();
    }


}
