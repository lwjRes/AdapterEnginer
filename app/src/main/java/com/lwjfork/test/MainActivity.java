package com.lwjfork.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.lwjfork.adapter.adapterview.ArrayListAdapter;
import com.lwjfork.adapter.adapterview.SimpleViewHolder;
import com.lwjfork.adapter.adapterview.multiple.IMultipleListDelegateItem;
import com.lwjfork.adapter.adapterview.multiple.MultipleListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv_test = (ListView) findViewById(R.id.lv_test);
        ArrayListAdapter<String> adapter = new MultipleListAdapter<String>().addTypeDelegateItem(new IMultipleListDelegateItem<String>() {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return position % 2 == 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent, List<String> data) {
                SimpleViewHolder viewHolder = SimpleViewHolder.getViewHolder(convertView, parent, android.R.layout.activity_list_item);
                TextView text1 = viewHolder.findTextViewById(android.R.id.text1);
                text1.setText(data.get(position));
                text1.setBackgroundColor(getResources().getColor(android.R.color.background_dark));
                return viewHolder.getConvertView();
            }
        }).addTypeDelegateItem(new IMultipleListDelegateItem<String>() {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return position % 3 == 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent, List<String> data) {
                SimpleViewHolder viewHolder = SimpleViewHolder.getViewHolder(convertView, parent, android.R.layout.activity_list_item);
                TextView text1 = viewHolder.findTextViewById(android.R.id.text1);
                text1.setText(data.get(position));
                text1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                return viewHolder.getConvertView();
            }
        }).addTypeDelegateItem(new IMultipleListDelegateItem<String>() {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return position % 4 == 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent, List<String> data) {
                SimpleViewHolder viewHolder = SimpleViewHolder.getViewHolder(convertView, parent, android.R.layout.activity_list_item);
                TextView text1 = viewHolder.findTextViewById(android.R.id.text1);
                text1.setText(data.get(position));
                text1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                return viewHolder.getConvertView();
            }
        }).addTypeDelegateItem(new IMultipleListDelegateItem<String>() {
            @Override
            public boolean isForType(String item, int position, List<String> data) {
                return true;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent, List<String> data) {
                SimpleViewHolder viewHolder = SimpleViewHolder.getViewHolder(convertView, parent, android.R.layout.activity_list_item);
                TextView text1 = viewHolder.findTextViewById(android.R.id.text1);
                text1.setText(data.get(position));
                text1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                return viewHolder.getConvertView();
            }
        });
        lv_test.setAdapter(adapter);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            list.add("" + i);
        }
        adapter.setData(list);
    }
}
