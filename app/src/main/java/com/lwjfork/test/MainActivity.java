package com.lwjfork.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.lwjfork.adapter.IFindAppCompatViewHelper;
import com.lwjfork.adapter.adapterview.ArrayListAdapter;
import com.lwjfork.adapter.adapterview.SimpleViewHolder;
import com.lwjfork.adapter.adapterview.multiple.MultipleListAdapter;
import com.lwjfork.adapter.adapterview.multiple.SimpleMultipleListDelegateItem;
import com.lwjfork.adapter.recycleview.SimpleRecycleListAdapter;
import com.lwjfork.adapter.recycleview.SimpleRecycleViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IFindAppCompatViewHelper {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv_test = findListViewById(R.id.lv_test);
        RecyclerView rcv_test = findRecyclerViewById(R.id.rcv_test);
        AppCompatTextView ac_tv = findAppCompatTextViewById(R.id.ac_tv);
        ac_tv.setText("AppCompatTextView");
        ArrayListAdapter<String> adapter = new MultipleListAdapter<String>().addTypeDelegateItem(new SimpleMultipleListDelegateItem<String>(android.R.layout.activity_list_item) {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return position % 2 == 0;
            }

            @Override
            protected void fillData(String item, SimpleViewHolder viewHolder, int position, List<String> data) {
                TextView text1 = viewHolder.findViewByID(android.R.id.text1);
                text1.setText(item);
                text1.setBackgroundColor(getResources().getColor(android.R.color.background_dark));
            }

        }).addTypeDelegateItem(new SimpleMultipleListDelegateItem<String>(android.R.layout.activity_list_item) {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return position % 3 == 0;
            }

            @Override
            protected void fillData(String item, SimpleViewHolder viewHolder, int position, List<String> data) {
                TextView text1 = viewHolder.findViewByID(android.R.id.text1);
                text1.setText(item);
                text1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        }).addTypeDelegateItem(new SimpleMultipleListDelegateItem<String>(android.R.layout.activity_list_item) {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return position % 4 == 0;
            }

            @Override
            protected void fillData(String item, SimpleViewHolder viewHolder, int position, List<String> data) {
                TextView text1 = viewHolder.findViewByID(android.R.id.text1);
                text1.setText(item);
                text1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        }).addTypeDelegateItem(new SimpleMultipleListDelegateItem<String>(android.R.layout.activity_list_item) {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return true;
            }

            @Override
            protected void fillData(String item, SimpleViewHolder viewHolder, int position, List<String> data) {
                TextView text1 = viewHolder.findViewByID(android.R.id.text1);
                text1.setText(item);
                text1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        });
        lv_test.setAdapter(adapter);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            list.add("" + i);
        }
        adapter.setData(list);


        SimpleRecycleListAdapter<String> adapter1 = new SimpleRecycleListAdapter<String>(android.R.layout.activity_list_item) {

            @Override
            protected void fillData(SimpleRecycleViewHolder holder, int position, String data, List<String> datas) {
                holder.findTextViewById(android.R.id.text1).setText(data);
            }
        };
        rcv_test.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rcv_test.setAdapter(adapter1);
        adapter1.setData(list);

    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends View> T findViewByID(int viewId) {
        return (T) findViewById(viewId);
    }
}
