package com.atwbin.orderdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class OrderActivity extends AppCompatActivity {

    @Bind(R.id.recyclerView)
    RecyclerView mRecycieView;
    RecycieViewAdapter mAdapter;
    private List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initData();
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(OrientationHelper.VERTICAL);
        mRecycieView.setLayoutManager(manager);
        mAdapter = new RecycieViewAdapter(this, data);
        mRecycieView.setAdapter(mAdapter);
    }

    private void initData() {
        data = new ArrayList<>();
        data.add("快递名称");
        data.add("商品名称");
        data.add("日期");
        data.add("时间");
        data.add("商品名称5");
        data.add("商品名称6");
        data.add("商品名称7");
        data.add("商品名称8");
    }
}
