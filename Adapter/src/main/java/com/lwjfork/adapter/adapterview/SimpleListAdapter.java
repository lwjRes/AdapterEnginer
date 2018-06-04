package com.lwjfork.adapter.adapterview;

import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created:2018/6/1
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public class SimpleListAdapter<T> extends ArrayListAdapter<T> {

    private int layoutId;

    public SimpleListAdapter(int layoutId) {
        this.layoutId = layoutId;
    }

    public SimpleListAdapter(List mData, int layoutId) {
        super(mData);
        this.layoutId = layoutId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SimpleViewHolder holder = SimpleViewHolder.getViewHolder(convertView, parent, layoutId);
        fillData(getItem(position), holder, position);
        return holder.getConvertView();
    }

    public void fillData(T item, SimpleViewHolder viewHolder, int position) {

    }
}
