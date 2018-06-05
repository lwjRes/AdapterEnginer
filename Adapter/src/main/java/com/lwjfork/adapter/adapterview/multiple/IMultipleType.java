package com.lwjfork.adapter.adapterview.multiple;

import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created:2018/6/4
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public interface IMultipleType<T> {





    public View getView(int position, View convertView, ViewGroup parent, List<T> data);

}
