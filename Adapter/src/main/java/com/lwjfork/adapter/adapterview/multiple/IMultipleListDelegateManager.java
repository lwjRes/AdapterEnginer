package com.lwjfork.adapter.adapterview.multiple;

import java.util.List;

/**
 * Created:2018/6/4
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public interface IMultipleListDelegateManager<T> extends IMulitipleType<T> {


    int getTypeCount();


    int getItemViewType(int position, List<T> data);


    @SuppressWarnings({"UnusedReturnValue", "unchecked"})
    IMultipleListDelegateManager<T> addTypeDelegateItem(IMultipleListDelegateItem<T>... items);

    @SuppressWarnings("UnusedReturnValue")
    IMultipleListDelegateManager<T> addTypeDelegateItem(IMultipleListDelegateItem<T> item);

}
