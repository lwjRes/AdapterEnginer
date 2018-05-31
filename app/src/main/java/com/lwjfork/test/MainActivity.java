package com.lwjfork.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.lwjfork.adapter.adapterview.ArrayListAdapter;
import com.lwjfork.adapter.adapterview.SimpleViewHolder;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv_test = (ListView) findViewById(R.id.lv_test);
        lv_test.setAdapter(new ArrayListAdapter<String>() {

            @Override
            public int getCount() {
                return 100;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                SimpleViewHolder viewHolder = SimpleViewHolder.getViewHolder(convertView, parent, android.R.layout.activity_list_item);
                TextView text1 = viewHolder.findTextViewById(android.R.id.text1);
                text1.setText(""+position+position+position);
                return viewHolder.getConvertView();
            }
        });
    }
}
