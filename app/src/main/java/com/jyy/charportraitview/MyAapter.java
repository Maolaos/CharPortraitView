package com.jyy.charportraitview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jyy.library.CharPortraitView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by wanxiang on 2018/8/8.
 */

public class MyAapter extends RecyclerView.Adapter<MyAapter.MyViewHolder> {
    private Context mContext;
    private List<String> mList;
    private LayoutInflater mInflater;
    private String[] colors={"#2b2b2b","#03A9F4","#FFEB3B"};

    public MyAapter(Context mContext,List<String> mList){
        this.mContext=mContext;
        this.mList= mList;
        this.mInflater=mInflater.from(mContext);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(mList.get(position));
        holder.portrait.setContent(mList.get(position)).setHead(false);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private CharPortraitView portrait;
       public MyViewHolder(View itemView) {
           super(itemView);
           name=itemView.findViewById(R.id.tv_name);
           portrait=itemView.findViewById(R.id.cv_portrait);

       }
   }
}
