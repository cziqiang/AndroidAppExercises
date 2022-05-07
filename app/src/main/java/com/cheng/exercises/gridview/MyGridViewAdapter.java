package com.cheng.exercises.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cheng.exercises.R;

public class MyGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyGridViewAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.layout_grid_item,null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv_grid);
            holder.textView = convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        //赋值
        holder.textView.setText("花");
        Glide.with(mContext).load("https://tse1-mm.cn.bing.net/th/id/R-C.7d7d1625266dd89751199b4c271763e5?rik=r3tqOmJQLHTz%2fA&riu=http%3a%2f%2fdasouji.com%2fwp-content%2fuploads%2f2017%2f07%2f%e7%b4%ab%e8%8d%86%e8%8a%b1-17.jpg&ehk=2SN4Mztht4hbdBxHzyo6oH5ZAC7AnOlBwRi%2b5rcXua4%3d&risl=&pid=ImgRaw&r=0").into(holder.imageView);
        return convertView;
    }
}
