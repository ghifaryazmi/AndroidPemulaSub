package com.example.submissionbeginner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Food> listFood;
    public DetailsAdapter(Context context){
        this.context = context;
    }

    ArrayList<Food> getListFood(){
        return listFood;
    }

    public void setListFood(ArrayList<Food> listFood){ this.listFood = listFood;}


    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_details, viewGroup, false);
        return new ListViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {

        Food food = getListFood().get(position);
        Glide.with(context)
                .load(food.getPhoto())
                .override(250, 250)
                .into(holder.imgPhoto);
        holder.tvName.setText(food.getNameFood());
        holder.tvDetails.setText(food.getDetailFood());
    }

    @Override
    public int getItemCount() {
        return getListFood().size();
    }


    public static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvDetails;

        public ListViewHolder(View itemView) {
            super(itemView);
           imgPhoto = itemView.findViewById(R.id.iv_photo_food);
            tvDetails = itemView.findViewById(R.id.tv_details_detail_food);
            tvName = itemView.findViewById(R.id.tv_details_name_food);
        }

    }
}
