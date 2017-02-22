package com.atwbin.orderdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.atwbin.orderdemo.adapter.FirstAdapter;
import com.atwbin.orderdemo.entity.FirstData;
import com.atwbin.orderdemo.entity.SecondData;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class OrderActivity extends AppCompatActivity {

    @Bind(R.id.recyclerView)
    RecyclerView mRecycieView;
    FirstAdapter fAdapter;
    private List<SecondData> secondDatas;
    private List<FirstData> firstDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(OrientationHelper.VERTICAL);
        mRecycieView.setLayoutManager(manager);
        fAdapter = new FirstAdapter(this, firstDatas,secondDatas);
        mRecycieView.setAdapter(fAdapter);


    }

    private void initData() {
        firstDatas = new ArrayList<>();

        firstDatas.add(new FirstData("圆通", "2016-01-11", "12:25:06"));
        firstDatas.add(new FirstData("圆通", "2016-01-11", "12:25:06"));
        firstDatas.add(new FirstData("圆通", "2016-01-11", "12:25:06"));
        firstDatas.add(new FirstData("圆通", "2016-01-11", "12:25:06"));
        firstDatas.add(new FirstData("圆通", "2016-01-11", "12:25:06"));
        firstDatas.add(new FirstData("圆通", "2016-01-11", "12:25:06"));
        firstDatas.add(new FirstData("圆通", "2016-01-11", "12:25:06"));
        firstDatas.add(new FirstData("圆通", "2016-01-11", "12:25:06"));

        secondDatas = new ArrayList<>();
        secondDatas.add(new SecondData("ass", "，名称", 1));
        secondDatas.add(new SecondData("ass", "，名称", 2));
        secondDatas.add(new SecondData("ass", "，名称", 3));


    }

}
