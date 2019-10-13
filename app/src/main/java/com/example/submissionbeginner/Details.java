package com.example.submissionbeginner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Details extends AppCompatActivity {
    ImageView ivPhotoFood;
    TextView nameFood, detailsFood;

    public static final String FOOD_NAME = "FOOD_NAME";
    public static final String FOOD_DETAILS = "FOOD_DETAILS";
    public static final String FOOD_PHOTO = "FOOD_PHOTO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);

        nameFood = findViewById(R.id.tv_details_name_food);
        detailsFood = findViewById(R.id.tv_details_detail_food);
        ivPhotoFood = findViewById(R.id.iv_photo_food);

        String name = getIntent().getStringExtra(FOOD_NAME);
        String details = getIntent().getStringExtra(FOOD_DETAILS);
        int imgPhoto = getIntent().getIntExtra(FOOD_PHOTO, 0);

        nameFood.setText(name);
        detailsFood.setText(details);

//        Drawable dr = ResourcesCompat.getDrawable(imgPhoto);
        Glide.with(Details.this).load(ContextCompat.getDrawable(this, imgPhoto)).into(ivPhotoFood);


       // Log.i("photo", imgPhoto);
    }
}
