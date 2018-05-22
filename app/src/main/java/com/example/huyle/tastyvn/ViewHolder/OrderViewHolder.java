package com.example.huyle.tastyvn.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.huyle.tastyvn.Interface.ItemClickListener;
import com.example.huyle.tastyvn.R;

public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView txtOrderId, txtOrderStatus, txtOrderTable;

    private ItemClickListener itemClickListener;

    public OrderViewHolder(View itemView) {
        super(itemView);

        txtOrderTable = (TextView)itemView.findViewById(R.id.order_table);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);

    }
}
