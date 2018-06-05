package com.lwjfork.adapter.adapterview.multiple;

import java.util.List;

/**
 * Created:2018/6/4
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public interface IMultipleListDelegateItem<T> extends IMultipleType<T> {


    boolean isForType(T item, int position,  List<T> data);

}
