package com.lwjfork.adapter.viewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created:2018/5/30
 * User：lwjfork
 * Des:
 * ====================
 */

public class SimplePageAdapter extends PagerAdapter {


    private List<View> views = new ArrayList<>();
    private List<CharSequence> titles = new ArrayList<>();

    public SimplePageAdapter(ArrayList<View> views) {
        super();
        this.views = views;
    }

    public SimplePageAdapter() {
        super();
    }

    @SuppressWarnings("UnusedReturnValue")
    public SimplePageAdapter addTitle(CharSequence charSequence) {
        titles.add(charSequence);
        return this;
    }

    @SuppressWarnings("UnusedReturnValue")
    public SimplePageAdapter addTitle(int titleRes) {
        return addTitle(getResStr(titleRes));
    }

    @SuppressWarnings("UnusedReturnValue")
    public SimplePageAdapter addTitles(List<CharSequence> titles) {
        this.titles = titles;
        return this;
    }

    @SuppressWarnings("UnusedReturnValue")
    public SimplePageAdapter addItem(View itemView) {
        views.add(itemView);
        return this;
    }

    @SuppressWarnings("UnusedReturnValue")
    public SimplePageAdapter addItem(View itemView, int titleRes) {
        return addItem(itemView, getResStr(titleRes));
    }

    @SuppressWarnings("UnusedReturnValue")
    public SimplePageAdapter addItem(View itemView, CharSequence charSequence) {
        addItem(itemView).addTitle(charSequence);
        return this;
    }

    @SuppressWarnings("UnusedReturnValue")
    public SimplePageAdapter addItems(List<View> views) {
        this.views = views;
        return this;
    }

    @SuppressWarnings("UnusedReturnValue")
    public SimplePageAdapter addItems(List<View> views, List<CharSequence> titles) {
        return addItems(views).addTitles(titles);
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
    public int getCount() {
        if (views == null) {
            return 0;
        }
        return views.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = views.get(position);
        container.addView(itemView);
        return itemView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views.get(position));
    }

    public String getResStr(int resId) {
        return null;
    }
}
