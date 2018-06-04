package com.lwjfork.adapter.adapterview.multiple;

import java.util.List;

/**
 * Created:2018/6/4
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public interface IMultipleListDelegateItem<T> extends IMulitipleType<T> {


    boolean isForType(T item, int position,  List<T> data);

}
