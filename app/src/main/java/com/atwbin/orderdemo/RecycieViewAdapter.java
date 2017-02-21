package com.atwbin.orderdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;


import com.atwbin.orderdemo.model.TimeLineModel;

import java.util.List;

/**
 * @author Wbin
 * @title RecycieViewAdapter.java
 * @project 千品猫商城
 * @date 2017/2/17 0017 14:58
 * @ copyright  Copyright © 2016 qpmall.com Inc. All Rights Reserved.
 * @description 系统名称：
 */
public class RecycieViewAdapter extends RecyclerView.Adapter<RecycieViewAdapter.ViewHolder> {

    private Context context;
    private List<TimeLineModel> mDataSet;

    public RecycieViewAdapter(Context context, List<TimeLineModel> datas) {
        super();
        this.context = context;
        this.mDataSet = datas;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = View.inflate(context, R.layout.order_one, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
          holder.orderDate.setText(mDataSet.get(position).getEvent());
        holder.orderNum.setText(mDataSet.get(position).getTime());
        holder.fastName.setText(mDataSet.get(position).getName());
    }


    @Override
    public int getItemCount() {
        return mDataSet==null?0:mDataSet.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private CheckBox cb;
        private TextView fastName, orderNum, orderDate;
//        private SnapUpCountDownTimerView orderTime;

        public ViewHolder(View itemView) {
            super(itemView);
            cb = (CheckBox) itemView.findViewById(R.id.cb);
            fastName = (TextView) itemView.findViewById(R.id.fastName);
            orderNum = (TextView) itemView.findViewById(R.id.orderNum);
            orderDate = (TextView) itemView.findViewById(R.id.orderDate);
//            orderTime = (SnapUpCountDownTimerView) itemView.findViewById(R.id.orderTime);
//            orderTime.setTime(23, 59, 59);
//            orderTime.start();  // compile project(':snapupdowntimerview')
        }
    }
}
