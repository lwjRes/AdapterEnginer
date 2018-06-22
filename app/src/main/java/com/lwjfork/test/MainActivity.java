package com.lwjfork.test;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.lwj.adapter.viewpager.BannerViewPager;
import com.lwj.adapter.viewpager.SimplePageAdapter;

public class MainActivity extends AppCompatActivity implements IViewHelper, View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BannerViewPager vp_banner = findViewByID(R.id.vp_banner);


        SimplePageAdapter<TextView> pageAdapter = new SimplePageAdapter<>();

        for (int i = 0; i < 10; i++) {
            TextView textView = new TextView(this);
            textView.setText(i + "");
            pageAdapter.addItem(textView);
        }

        vp_banner.setAdapter(pageAdapter);

        vp_banner.startLoop();

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        Log.e("id", id + "");
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends View> T findViewByID(int viewId) {
        return (T) findViewById(viewId);
    }

    @Override
    public Context getContextHelper() {
        return this;
    }
}
