package com.lwjfork.test;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.lwjfork.adapter.IViewHelper;
import com.lwjfork.adapter.adapterview.ArrayListAdapter;
import com.lwjfork.adapter.adapterview.MultipleAdapter;
import com.lwjfork.adapter.adapterview.SimpleViewHolder;
import com.lwjfork.adapter.recycleview.MultipleRecycleAdapter;
import com.lwjfork.adapter.recycleview.SimpleRecycleViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IViewHelper, View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv_test = findViewByID(R.id.lv_test);
        RecyclerView rcv_test = findViewByID(R.id.rcv_test);
        ArrayListAdapter<String> adapter = new MultipleAdapter<String>().addTypeDelegateItem(new MultipleAdapter.SimpleDelegateItem<String>(android.R.layout.activity_list_item) {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return position % 2 == 0;
            }

            @Override
            protected void fillData(String item, SimpleViewHolder viewHolder, int position, List<String> data) {
                TextView text1 = viewHolder.findViewByID(android.R.id.text1);
                text1.setText(item);
                text1.setBackgroundColor(getColorById(android.R.color.background_dark));
            }

        }).addTypeDelegateItem(new MultipleAdapter.SimpleDelegateItem<String>(android.R.layout.activity_list_item) {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return position % 3 == 0;
            }

            @Override
            protected void fillData(String item, SimpleViewHolder viewHolder, int position, List<String> data) {
                TextView text1 = viewHolder.findViewByID(android.R.id.text1);
                text1.setText(item);
                text1.setBackgroundColor(getColorById(R.color.colorPrimaryDark));
            }
        }).addTypeDelegateItem(new MultipleAdapter.SimpleDelegateItem<String>(android.R.layout.activity_list_item) {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return position % 4 == 0;
            }

            @Override
            protected void fillData(String item, SimpleViewHolder viewHolder, int position, List<String> data) {
                TextView text1 = viewHolder.findViewByID(android.R.id.text1);
                text1.setText(item);
                text1.setBackgroundColor(getColorById(R.color.colorAccent));
            }
        }).addTypeDelegateItem(new MultipleAdapter.SimpleDelegateItem<String>(android.R.layout.activity_list_item) {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return true;
            }

            @Override
            protected void fillData(String item, SimpleViewHolder viewHolder, int position, List<String> data) {
                TextView text1 = viewHolder.findViewByID(android.R.id.text1);
                text1.setText(item);
                text1.setBackgroundColor(getColorById(R.color.colorAccent));
            }
        });
        lv_test.setAdapter(adapter);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            list.add("" + i);
        }
        adapter.setData(list);
        MultipleRecycleAdapter<String> recycleAdapter = new MultipleRecycleAdapter<>();
        recycleAdapter.addTypeDelegateItem(new MultipleRecycleAdapter.SimpleDelegateItem<String>(2, android.R.layout.activity_list_item) {
            @Override
            public boolean isForType(List<String> datas, int position) {
                return position % 2 == 0;
            }

            @Override
            public void onBindViewHolder(List<String> datas, SimpleRecycleViewHolder holder, int position) {
                TextView text1 = holder.findViewByID(android.R.id.text1);
                text1.setText(datas.get(position));
                text1.setBackgroundColor(getColorById(R.color.colorAccent));
            }
        });
        recycleAdapter.addTypeDelegateItem(new MultipleRecycleAdapter.SimpleDelegateItem<String>(2, android.R.layout.activity_list_item) {
            @Override
            public boolean isForType(List<String> datas, int position) {
                return position % 2 == 1;
            }

            @Override
            public void onBindViewHolder(List<String> datas, SimpleRecycleViewHolder holder, int position) {
                TextView text1 = holder.findViewByID(android.R.id.text1);
                text1.setText(datas.get(position));
                text1.setBackgroundColor(getColorById(R.color.colorPrimaryDark));
            }
        });
        rcv_test.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rcv_test.setAdapter(recycleAdapter);
        recycleAdapter.setData(list);


    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends View> T findViewByID(int viewId) {
        return (T) findViewById(viewId);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Log.e("id", id + "");
    }

    @Override
    public Context getContextHelper() {
        return this;
    }
}
