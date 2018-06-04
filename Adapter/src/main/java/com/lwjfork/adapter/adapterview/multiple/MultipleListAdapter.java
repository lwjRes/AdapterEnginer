package com.lwjfork.adapter.adapterview.multiple;

import android.view.View;
import android.view.ViewGroup;

import com.lwjfork.adapter.adapterview.ArrayListAdapter;

import java.util.List;

/**
 * Created:2018/6/4
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public class MultipleListAdapter<T> extends ArrayListAdapter<T> {

    private IMultipleListDelegateManager delegateManager;

    protected IMultipleListDelegateManager createManager() {
        return new DefaultMultipleListDelegateManager();
    }


    public MultipleListAdapter() {
        super();
        delegateManager = createManager();
    }

    public MultipleListAdapter(List<T> mData) {
        super(mData);
        delegateManager = createManager();
    }

    @SuppressWarnings("unchecked")
    public MultipleListAdapter<T> addTypeDelegateItem(IMultipleListDelegateItem<T>[] items) {
        delegateManager.addTypeDelegateItem(items);
        return this;
    }

    @SuppressWarnings("unchecked")
    public MultipleListAdapter<T> addTypeDelegateItem(IMultipleListDelegateItem<T> item) {
        delegateManager.addTypeDelegateItem(item);
        return this;
    }


    @Override
    @SuppressWarnings("unchecked")
    public int getItemViewType(int position) {
        return delegateManager.getItemViewType(position, getData());
    }

    @Override
    public int getViewTypeCount() {
        return delegateManager.getTypeCount();
    }

    @Override
    @SuppressWarnings("unchecked")
    public View getView(int position, View convertView, ViewGroup parent) {
        return delegateManager.getView(position, convertView, parent, getData());
    }
}
