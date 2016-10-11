package com.test.tt101101;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by teacher on 2016/10/11.
 */

public class MyAdapter extends BaseAdapter {
    String data[];
    Context context;

    public MyAdapter( Context c, String[] d)
    {
        this.context = c;
        this.data = d;
    }

    @Override
    public int getCount() {
        return data.length;
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
        View v = inflater.inflate(R.layout.myitem, null);

        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText(data[position] + ":" + position);
        return v;
    }
}
