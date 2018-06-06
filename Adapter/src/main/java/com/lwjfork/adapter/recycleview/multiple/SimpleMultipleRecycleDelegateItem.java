package com.lwjfork.adapter.recycleview.multiple;

import android.view.ViewGroup;

import com.lwjfork.adapter.recycleview.SimpleRecycleViewHolder;

import java.util.List;

/**
 * Created:2018/6/6
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public abstract class SimpleMultipleRecycleDelegateItem<T> implements IRecycleAdapterDelegateItem<T, SimpleRecycleViewHolder> {


    private int viewType;
    private int layoutId;

    public SimpleMultipleRecycleDelegateItem(int viewType, int layoutId) {
        this.viewType = viewType;
        this.layoutId = layoutId;
    }

    @Override
    public abstract boolean isForType(List<T> datas, int position);

    @Override
    public int getItemViewType() {
        return viewType;
    }

    @Override
    public SimpleRecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return SimpleRecycleViewHolder.getViewHolder(parent, layoutId);
    }

    @Override
    public abstract void onBindViewHolder(List<String> datas, SimpleRecycleViewHolder holder, int position);
}
