package com.lwjfork.adapter.adapterview.multiple;

import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created:2018/6/4
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public class DefaultMultipleListDelegateManager<T> implements IMultipleListDelegateManager<T> {


    private ArrayList<IMultipleListDelegateItem<T>> items = new ArrayList<>();


    @Override
    public IMultipleListDelegateManager<T> addTypeDelegateItem(IMultipleListDelegateItem<T>[] items) {
        for (IMultipleListDelegateItem<T> item : items) {
            addTypeDelegateItem(item);
        }
        return this;
    }

    @Override
    public IMultipleListDelegateManager<T> addTypeDelegateItem(IMultipleListDelegateItem<T> item) {
        items.add(item);
        return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public View getView(int position, View convertView, ViewGroup parent, List<T> data) {
        for (IMultipleListDelegateItem item : items) {
            if (item.isForType(data.get(position), position, data)) {
                return item.getView(position, convertView, parent, data);
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public int getTypeCount() {
        if (items == null || items.size() <= 0) {
            return 1;
        }
        return items.size();
    }


    @Override
    @SuppressWarnings("unchecked")
    public int getItemViewType(int position, List<T> data) {
        int count = items.size();
        for (int i = 0; i < count; i++) {
            IMultipleListDelegateItem item = items.get(i);
            if (item.isForType(data.get(position), position, data)) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }
}
