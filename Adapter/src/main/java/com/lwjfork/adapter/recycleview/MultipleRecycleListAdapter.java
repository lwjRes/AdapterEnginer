package com.lwjfork.adapter.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.lwjfork.adapter.recycleview.multiple.DefaultRecycleAdapterDelegateManager;
import com.lwjfork.adapter.recycleview.multiple.IRecycleAdapterDelegateItem;
import com.lwjfork.adapter.recycleview.multiple.IRecycleAdapterDelegateManager;

import java.util.Collections;
import java.util.List;

/**
 * Created:2018/6/6
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public class MultipleRecycleListAdapter<T> extends RecycleListAdapter<T, RecyclerView.ViewHolder> {


    public MultipleRecycleListAdapter() {
        this(Collections.emptyList());
    }

    public MultipleRecycleListAdapter(List<T> mData) {
        super(mData);
        delegateManager = createManager();
    }

    private IRecycleAdapterDelegateManager<T> delegateManager;

    protected IRecycleAdapterDelegateManager<T> createManager() {
        return new DefaultRecycleAdapterDelegateManager<>();
    }

    @SuppressWarnings("unchecked")
    public final <V extends RecyclerView.ViewHolder> MultipleRecycleListAdapter<T> addTypeDelegateItem(IRecycleAdapterDelegateItem<T, V>[] items) {
        delegateManager.addTypeDelegateItem(items);
        return this;
    }

    @SuppressWarnings("unchecked")
    public final <V extends RecyclerView.ViewHolder> MultipleRecycleListAdapter<T> addTypeDelegateItem(IRecycleAdapterDelegateItem<T, V> item) {
        delegateManager.addTypeDelegateItem(item);
        return this;
    }


    @Override
    public int getItemViewType(int position) {
        return delegateManager.getItemViewType(mData, position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return delegateManager.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        delegateManager.onBindViewHolder(holder, mData, position);
    }
}
