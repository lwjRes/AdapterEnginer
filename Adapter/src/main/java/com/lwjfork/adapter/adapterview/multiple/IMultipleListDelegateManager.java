package com.lwjfork.adapter.adapterview.multiple;

import java.util.List;

/**
 * Created:2018/6/4
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */

public interface IMultipleListDelegateManager<T> extends IMultipleType<T> {


    int getTypeCount();


    int getItemViewType(int position, List<T> data);


    @SuppressWarnings({"UnusedReturnValue", "unchecked"})
    IMultipleListDelegateManager<T> addTypeDelegateItem(IMultipleListDelegateItem<T>... items);

    @SuppressWarnings("UnusedReturnValue")
    IMultipleListDelegateManager<T> addTypeDelegateItem(IMultipleListDelegateItem<T> item);

}
