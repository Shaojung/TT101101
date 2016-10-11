package com.test.tt101101;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by teacher on 2016/10/11.
 */

public class MyAdapter extends BaseAdapter {
    String data[];
    Context context;
    ArrayList<Student> mylist;

    public MyAdapter(Context c, ArrayList<Student> mylist)
    {
        this.context = c;
        this.mylist = mylist;
    }

    @Override
    public int getCount() {
        return mylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder ;
        if (convertView == null)
        {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.myitem, null);
            convertView.setTag(holder);
            holder.tv = (TextView) convertView.findViewById(R.id.textView);
            holder.tv2 = (TextView) convertView.findViewById(R.id.textView2);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv.setText(mylist.get(position).name);
        holder.tv2.setText(mylist.get(position).tel);
        Log.d("ADAPTER", "position:" + position);
        return convertView;
    }
    static class ViewHolder
    {
        TextView tv;
        TextView tv2;
    }
}
