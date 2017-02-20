package com.atwbin.orderdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.aesion.snapupdowntimerview.SnapUpCountDownTimerView;

import java.util.List;

/**
 * @author Wbin
 * @title xxxxx.java
 * @project 千品猫商城
 * @date 2017/2/17 0017 14:58
 * @ copyright  Copyright © 2016 qpmall.com Inc. All Rights Reserved.
 * @description 系统名称：
 */
public class RecycieViewAdapter extends RecyclerView.Adapter<RecycieViewAdapter.ViewHolder> {

    private Context context;
    private List<String> data;

    public RecycieViewAdapter(Context context, List<String> data) {
        super();
        this.context = context;
        this.data = data;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.order_one, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }


    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private CheckBox cb;
        private TextView fastName, orderNum, orderDate;
        private SnapUpCountDownTimerView orderTime;

        public ViewHolder(View itemView) {
            super(itemView);
            cb = (CheckBox) itemView.findViewById(R.id.cb);
            fastName = (TextView) itemView.findViewById(R.id.fastName);
            orderNum = (TextView) itemView.findViewById(R.id.orderNum);
            orderTime = (SnapUpCountDownTimerView) itemView.findViewById(R.id.orderTime);
            orderTime.setTime(23, 59, 59);
            orderTime.start();
        }


    }
}
