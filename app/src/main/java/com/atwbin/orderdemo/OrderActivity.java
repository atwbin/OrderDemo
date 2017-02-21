package com.atwbin.orderdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.atwbin.orderdemo.model.TimeLineModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class OrderActivity extends AppCompatActivity {

    @Bind(R.id.recyclerView)
    RecyclerView mRecycieView;
    RecycieViewAdapter mAdapter;
   private List<GoodBean> datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        datas = new ArrayList<>();
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(OrientationHelper.VERTICAL);
        mRecycieView.setLayoutManager(manager);
        mAdapter = new RecycieViewAdapter(this, getData());
        mRecycieView.setAdapter(mAdapter);
    }

    private List<TimeLineModel> getData() {
        List<TimeLineModel> models = new ArrayList<TimeLineModel>();

        models.add(new TimeLineModel("你提交了订单，请等待系统确认", "2016-08-09","花花"));
        models.add(new TimeLineModel("你的订单从德国发货，预计8-22能送达", "2016-08-09","花花"));
        models.add(new TimeLineModel("打包成功", "2016-08-10","花花"));
        models.add(new TimeLineModel("扫描员已经扫描完成", "2016-08-10","花花"));
        models.add(new TimeLineModel("正在运送中 ... ", "2016-08-12","花花"));
        models.add(new TimeLineModel("到达HK海关 ... ", "2016-08-15","花花"));
        models.add(new TimeLineModel("海关 清关中... ", "2016-08-19","花花"));
        models.add(new TimeLineModel("正在送往深圳中康站... ", "2016-08-20","花花"));
        models.add(new TimeLineModel("正在配送中，请保持手机通畅", "2016-08-21","花花"));

        return models;
    }


}
