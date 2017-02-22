package com.atwbin.orderdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.atwbin.orderdemo.R;
import com.atwbin.orderdemo.entity.SecondData;
import com.atwbin.orderdemo.view.roundedimageview.RoundedImageView;
import java.util.List;

/**
 * @author Wbin
 * @title SecondAdapter.java
 * @project 千品猫商城
 * @date 2017/2/22 0022 10:25
 * @ copyright  Copyright © 2016 qpmall.com Inc. All Rights Reserved.
 * @description 系统名称：
 */
public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder> {

    private Context context;
    private List<SecondData> datas;

    public SecondAdapter(Context context, List<SecondData> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.order_second, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (datas != null) {
//            ImageLoader.getInstance().displayImage(datas.get(position).goodImage,holder.imageView);
//            holder.orderName.setText(datas.get(position).name);
//            holder.num.setText(datas.get(position).num);
        }
    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private RoundedImageView imageView;
        private TextView orderName, num;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (RoundedImageView) itemView.findViewById(R.id.imageView);
            orderName = (TextView) itemView.findViewById(R.id.orderName);
            num = (TextView) itemView.findViewById(R.id.num);

        }

    }
}
