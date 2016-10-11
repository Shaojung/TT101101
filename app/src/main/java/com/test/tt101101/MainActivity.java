package com.test.tt101101;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] data;
    ArrayList<Student> mylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new String[] {"AA", "BBB", "CC22", "DD44", "EEEEE555", "FF","GG","HH","II","LL", "FF1","GG2","HH3","II4","LL5"};
        mylist = new ArrayList<>();
        mylist.add(new Student("AA", "11111"));
        mylist.add(new Student("BB", "2222222"));
        mylist.add(new Student("CC", "333333"));
        mylist.add(new Student("DD", "4444444"));

        lv = (ListView) findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(MainActivity.this, mylist);
        lv.setAdapter(adapter);
    }

}
