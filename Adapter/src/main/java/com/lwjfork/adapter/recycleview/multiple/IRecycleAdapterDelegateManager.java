package com.lwjfork.adapter.recycleview.multiple;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created:2018/6/6
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public interface IRecycleAdapterDelegateManager<T> {


    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    void onBindViewHolder(RecyclerView.ViewHolder holder, List<T> datas, int position);


    int getItemViewType(List<T> datas, int position);

    <V extends RecyclerView.ViewHolder> IRecycleAdapterDelegateManager<T> addTypeDelegateItem(IRecycleAdapterDelegateItem<T, V>... items);

    @SuppressWarnings("UnusedReturnValue")
    <V extends RecyclerView.ViewHolder> IRecycleAdapterDelegateManager<T> addTypeDelegateItem(IRecycleAdapterDelegateItem<T, V> item);
}
