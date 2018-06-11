package com.lwjfork.adapter.viewpager;

import java.util.List;

/**
 * Created:2018/6/8
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */
@SuppressWarnings({"UnusedReturnValue", "unused"})
public interface IViewPagerAdapter<K, V extends IViewPagerAdapter<K, V>> {

    V addTitle(CharSequence charSequence);

    V addItem(K item);

    V addItemTitles(List<CharSequence> itemTitles);

    V addItems(List<K> items);

    default V addItem(K item, CharSequence itemTitle) {
        return addItem(item).addTitle(itemTitle);
    }

    default V addItems(List<K> items, List<CharSequence> itemTitles) {
        return addItems(items).addItemTitles(itemTitles);
    }

}
