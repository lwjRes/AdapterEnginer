package com.lwjfork.adapter.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created:2018/5/21
 * User：lwjfork
 * Email:lwjfork@gmail.com
 * Des:
 * ====================
 */
@SuppressWarnings({"unchecked",
        "unused",
        "WeakerAccess",
        "SameParameterValue"})
public class SimpleFragmentStatePageAdapterHelper<T extends Fragment> extends FragmentStatePagerAdapter implements IViewPagerAdapterHelper<T, SimpleFragmentStatePageAdapterHelper<T>> {


    private List<T> fragments = new ArrayList<>();

    private List<CharSequence> titles = new ArrayList<>();


    public SimpleFragmentStatePageAdapterHelper(FragmentManager fm) {
        super(fm);
    }

    public SimpleFragmentStatePageAdapterHelper(FragmentManager fm, ArrayList<T> fragments, ArrayList<CharSequence> titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (titles == null || titles.size() < 1) {
            return null;
        }
        if (position <= titles.size() - 1) {
            return titles.get(position);
        }
        return null;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public SimpleFragmentStatePageAdapterHelper<T> addTitle(CharSequence charSequence) {
        titles.add(charSequence);
        return this;
    }

    @Override
    public SimpleFragmentStatePageAdapterHelper<T> addItem(T item) {
        fragments.add(item);
        return this;
    }

    @Override
    public SimpleFragmentStatePageAdapterHelper<T> addItemTitles(List<CharSequence> itemTitles) {
        titles = itemTitles;
        return this;
    }

    @Override
    public SimpleFragmentStatePageAdapterHelper<T> addItems(List<T> items) {
        fragments = items;
        return this;
    }

}
