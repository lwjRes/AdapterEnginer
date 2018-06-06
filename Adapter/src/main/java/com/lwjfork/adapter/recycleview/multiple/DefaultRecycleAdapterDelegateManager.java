package com.lwjfork.adapter.recycleview.multiple;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created:2018/6/6
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public class DefaultRecycleAdapterDelegateManager<T> implements IRecycleAdapterDelegateManager<T> {

    private List<IRecycleAdapterDelegateItem> items = new ArrayList<>();

    @Override
    @SuppressWarnings("unchecked")
    public int getItemViewType(List<T> datas, int position) {
        for (IRecycleAdapterDelegateItem item : items) {
            if (item.isForType(datas, position)) {
                return item.getItemViewType();
            }
        }

        return 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        for (IRecycleAdapterDelegateItem item : items) {
            if (item.getItemViewType() == viewType) {
                return item.onCreateViewHolder(parent, viewType);
            }
        }
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(RecyclerView.ViewHolder holder, List<T> datas, int position) {
        for (IRecycleAdapterDelegateItem item : items) {
            if (item.isForType(datas, position)) {
                item.onBindViewHolder(datas, holder, position);
                break;
            }
        }
    }

    @Override
    public <V extends RecyclerView.ViewHolder> IRecycleAdapterDelegateManager<T> addTypeDelegateItem(IRecycleAdapterDelegateItem<T, V>[] items) {
        for (IRecycleAdapterDelegateItem<T, V> item : items) {
            addTypeDelegateItem(item);
        }
        return this;
    }

    @Override
    public <V extends RecyclerView.ViewHolder> IRecycleAdapterDelegateManager<T> addTypeDelegateItem(IRecycleAdapterDelegateItem<T, V> item) {
        items.add(item);
        return this;
    }
}
