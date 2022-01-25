package com.shia.practice91;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CartItemAdapter extends RecyclerView.Adapter<CartItemAdapter.MyViewHolder> {

    List<CartItem> cartItemList;
    Context context;

    public CartItemAdapter(List<CartItem> cartItemList, Context context) {
        this.cartItemList = cartItemList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View avatarView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list, parent, false);
        return new MyViewHolder(avatarView);
    }

    @Override
    public void onBindViewHolder(CartItemAdapter.MyViewHolder holder, int position) {
        CartItem adapterItem = cartItemList.get(position);

        holder.adapterAvatar.setImageResource(adapterItem.getUserAvatar());
        holder.adapterName.setText(adapterItem.getUserName());

        /*holder.adapterItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Item : " + position, Toast.LENGTH_SHORT).show();
            }
        });*/


        holder.adapterItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (holder.getPosition()) {
                    case 0:
                        Intent intent0 = new Intent(context, LaptopStore.class);
                        intent0.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(context, PhoneStore.class);
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(context, BackPackStore.class);
                        intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(context, CarStore.class);
                        intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(context, BikeStore.class);
                        intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(context, DressStore.class);
                        intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(context, FlagStore.class);
                        intent6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(context, FlowerStore.class);
                        intent7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(context, ProfileStore.class);
                        intent8.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(context, TvStore.class);
                        intent9.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent9);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return cartItemList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView adapterAvatar;
        public TextView adapterName;
        public LinearLayout adapterItem;

        public MyViewHolder(View view) {
            super(view);

            adapterAvatar = view.findViewById(R.id.imageAvatar);
            adapterName = view.findViewById(R.id.txtName);
            adapterItem = view.findViewById(R.id.itemLayout);
        }
    }
}
