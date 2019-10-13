package com.example.submissionbeginner;

import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListViewHolder> {

    private ArrayList<Food> listFood;
    private Context context;
//
//    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
//        this.onItemClickCallback = onItemClickCallback;
//    }

    public ArrayList<Food> getListFood(){
    return listFood;
}
    public ListFoodAdapter(Context context) {
        this.context = context;
    }
    public void setListFood(ArrayList<Food> listFood){
        this.listFood = listFood;
    }


    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_food, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Food food = getListFood().get(position);
        Glide.with(context)
                .load(food.getPhoto())
                .override(55, 55)
                .into(holder.imgPhoto);

        holder.tvName.setText(food.getNameFood());
        holder.tvDetails.setText(food.getCityFood());

        holder.rLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //onItemClickCallback.onItemClicked(listFood.get(holder.getAdapterPosition()));
                Food f = getListFood().get(position);
                Intent intent = new Intent(context,Details.class);
                intent.putExtra(Details.FOOD_PHOTO, f.getPhoto());
                intent.putExtra(Details.FOOD_NAME, f.getNameFood());
                intent.putExtra(Details.FOOD_DETAILS, f.getDetailFood());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetails;
        RelativeLayout rLayout;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_photo_food);
            tvDetails = itemView.findViewById(R.id.tv_detail_food);
            tvName = itemView.findViewById(R.id.tv_food_name);
            rLayout = itemView.findViewById(R.id.rlayout);
        }

    }

//    public interface OnItemClickCallback{
//        void onItemClicked(Food data);
//    }
}
