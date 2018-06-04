package com.lwjfork.adapter.adapterview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created:2018/5/21
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public abstract class ArrayListAdapter<T> extends BaseAdapter {


    private List<T> mData = Collections.emptyList();

    public ArrayListAdapter() {
    }

    public ArrayListAdapter(List<T> mData) {
        this.mData = mData;
    }

    @Override
    public int getCount() {

        return mData == null ? 0 : mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract View getView(int position, View convertView, ViewGroup parent);


    public void setData(List<T> data) {
        this.mData = data;
        notifyDataSetChanged();
    }

    public void appendData(T... datas) {
        Collections.addAll(mData, datas);
        notifyDataSetChanged();
    }

    public void appendData(List<T> data) {
        mData.addAll(data);
    }

    public void addFirst(List<T> data) {
        addItem(0, data);
    }

    public void addFirst(T... datas) {
        addItem(0, datas);
    }


    public void addLast(T... datas) {
        appendData(datas);
    }


    public void addLast(List<T> data) {
        appendData(data);
    }


    public void addItem(int index, T... datas) {
        mData.addAll(index, array2ArrayList(datas));
        notifyDataSetChanged();
    }

    public void addItem(int index, List<T> data) {
        mData.addAll(index, data);
        notifyDataSetChanged();
    }


    public boolean contain(T data) {
        return mData.contains(data);
    }


    public boolean contains(List<T> data) {
        return mData.contains(data);
    }

    public void rmove(T data) {
        mData.remove(data);
        notifyDataSetChanged();
    }

    public void removes(List<T> data) {
        mData.removeAll(data);
        notifyDataSetChanged();
    }


    public int index(T data) {
        return mData.indexOf(data);
    }


    public List<T> array2ArrayList(T... objects) {
        return Arrays.asList(objects);
    }

    public List<T> getData() {
        return mData;
    }
}
