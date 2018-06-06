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

public class SimpleFragmentStatePageAdapter<T extends Fragment> extends FragmentStatePagerAdapter {


    private List<T> fragments = new ArrayList<>();

    private List<CharSequence> titles = new ArrayList<>();


    public SimpleFragmentStatePageAdapter(FragmentManager fm) {
        super(fm);
    }

    public SimpleFragmentStatePageAdapter(FragmentManager fm, ArrayList<T> fragments, ArrayList<CharSequence> titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    public void addItem(T frag) {
        fragments.add(frag);
        titles.add(null);
    }

    public void addItem(T frag, CharSequence title) {
        fragments.add(frag);
        titles.add(title);
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

}
