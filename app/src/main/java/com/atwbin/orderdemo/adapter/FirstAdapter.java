package com.atwbin.orderdemo.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;


import com.aesion.snapupdowntimerview.SnapUpCountDownTimerView;
import com.atwbin.orderdemo.R;
import com.atwbin.orderdemo.entity.FirstData;
import com.atwbin.orderdemo.entity.SecondData;
import com.atwbin.orderdemo.model.TimeLineModel;
import com.atwbin.orderdemo.views.MyRecycleView;

import java.util.List;

/**
 * @author Wbin
 * @title FirstAdapter.java
 * @project 千品猫商城
 * @date 2017/2/17 0017 14:58
 * @ copyright  Copyright © 2016 qpmall.com Inc. All Rights Reserved.
 * @description 系统名称：
 */
public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.ViewHolder> {

    private Context context;
    private List<FirstData> mDataSet;
    private List<SecondData> secondDatas;

    public FirstAdapter(Context context, List<FirstData> datas, List<SecondData> secondDatas) {
        super();
        this.context = context;
        this.mDataSet = datas;
        this.secondDatas = secondDatas;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = View.inflate(context, R.layout.order_first, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.orderDate.setText(mDataSet.get(position).date);
        holder.orderNum.setText(mDataSet.get(position).time);
        holder.fastName.setText(mDataSet.get(position).name);

        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(OrientationHelper.VERTICAL);
        holder.myRecycleView.setLayoutManager(manager);
        SecondAdapter secondAdapter = new SecondAdapter(context, secondDatas);
        holder.myRecycleView.setAdapter(secondAdapter);
    }


    @Override
    public int getItemCount() {
        return mDataSet == null ? 0 : mDataSet.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private CheckBox cb;
        private TextView fastName, orderNum, orderDate;
        private SnapUpCountDownTimerView orderTime;
        private MyRecycleView myRecycleView;

        public ViewHolder(View itemView) {
            super(itemView);
            cb = (CheckBox) itemView.findViewById(R.id.cb);
            fastName = (TextView) itemView.findViewById(R.id.fastName);
            orderNum = (TextView) itemView.findViewById(R.id.orderNum);
            orderDate = (TextView) itemView.findViewById(R.id.orderDate);
            myRecycleView = (MyRecycleView) itemView.findViewById(R.id.myRecycleView);
            orderTime = (SnapUpCountDownTimerView) itemView.findViewById(R.id.orderTime);
            orderTime.setTime(23, 59, 59);
            orderTime.start();

        }
    }
}
