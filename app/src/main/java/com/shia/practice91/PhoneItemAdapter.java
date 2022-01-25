package com.shia.practice91;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PhoneItemAdapter extends RecyclerView.Adapter<PhoneItemAdapter.MyViewHolder> {

    List<PhoneItem> phoneItemList;
    Context context;

    public PhoneItemAdapter(List<PhoneItem> phoneItemList, Context context) {
        this.phoneItemList = phoneItemList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.phone_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( PhoneItemAdapter.MyViewHolder holder, int position) {
        PhoneItem phoneItem = phoneItemList.get(position);

        holder.adapterAvatar.setImageResource(phoneItem.getAvatar());
        holder.adapterName.setText(phoneItem.getName());
        holder.adapterMessage.setText(phoneItem.getMessage());
        holder.adapterPrice.setText(phoneItem.getPrice());

        holder.phoneList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Item : " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return phoneItemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView adapterAvatar;
        public TextView adapterName;
        public TextView adapterMessage;
        public TextView adapterPrice;
        public RelativeLayout phoneList;

        public MyViewHolder(View view) {
            super(view);

            adapterAvatar = view.findViewById(R.id.imageView);
            adapterName = view.findViewById(R.id.goodName);
            adapterMessage = view.findViewById(R.id.goodModel);
            adapterPrice = view.findViewById(R.id.goodPrice);
            phoneList = view.findViewById(R.id.phoneList);
        }
    }
}
