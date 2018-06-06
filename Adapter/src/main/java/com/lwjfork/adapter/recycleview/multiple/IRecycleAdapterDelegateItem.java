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

public interface IRecycleAdapterDelegateItem<T, K extends RecyclerView.ViewHolder> {


    boolean isForType(List<T> datas, int position);

    int getItemViewType();

    K onCreateViewHolder(ViewGroup parent, int viewType);

    void onBindViewHolder(List<String> datas,K holder, int position);

}
