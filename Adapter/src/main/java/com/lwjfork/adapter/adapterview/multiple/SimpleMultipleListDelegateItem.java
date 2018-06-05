package com.lwjfork.adapter.adapterview.multiple;

import android.view.View;
import android.view.ViewGroup;

import com.lwjfork.adapter.adapterview.SimpleViewHolder;

import java.util.List;

/**
 * Created:2018/6/5
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public abstract class SimpleMultipleListDelegateItem<T> implements IMultipleListDelegateItem<T> {

    private int layoutId;

    public SimpleMultipleListDelegateItem(int layoutId) {
        this.layoutId = layoutId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent, List<T> data) {
        SimpleViewHolder viewHolder = SimpleViewHolder.getViewHolder(convertView, parent, layoutId);
        fillData(data.get(position), viewHolder, position, data);
        return viewHolder.getConvertView();
    }

    protected abstract void fillData(T item, SimpleViewHolder viewHolder, int position, List<T> data);
}
