package com.lwjfork.adapter.viewpager;

import java.util.List;

/**
 * Created:2018/6/8
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public interface IViewPagerAdapter<K, V extends IViewPagerAdapter<K, V>> {

    @SuppressWarnings("UnusedReturnValue")
    public V addTitle(CharSequence charSequence);

    @SuppressWarnings("UnusedReturnValue")
    public V addItem(K item);

    @SuppressWarnings("UnusedReturnValue")
    public V addItemTitles(List<CharSequence> itemTitles);

    @SuppressWarnings("UnusedReturnValue")
    public V addItems(List<K> items);

    @SuppressWarnings("UnusedReturnValue")
    default V addItem(K item, CharSequence itemTitle) {
        return addItem(item).addTitle(itemTitle);
    }

    @SuppressWarnings("UnusedReturnValue")
    default V addItems(List<K> items, List<CharSequence> itemTitles) {
        return addItems(items).addItemTitles(itemTitles);
    }

}
