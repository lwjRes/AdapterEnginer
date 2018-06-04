package com.lwjfork.adapter.adapterview.multiple;

import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created:2018/6/4
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public interface IMulitipleType<T> {





    public View getView(int position, View convertView, ViewGroup parent, List<T> data);

}
