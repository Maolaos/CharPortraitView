package com.jyy.charportraitview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mListView;
    private List<String> mList=new ArrayList<>();
    private MyAapter mAapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView=findViewById(R.id.lv_contact);
        initData();

    }

    private void initData() {
        mList.add("安琪拉");
        mList.add("鲁班");
        mList.add("狄仁杰");
        mList.add("夏侯惇");
        mList.add("典韦");
        mList.add("蔡文姬");
        mList.add("诸葛亮");
        mAapter=new MyAapter(this,mList);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mListView.setLayoutManager(manager);
        mListView.setAdapter(mAapter);
    }



}
