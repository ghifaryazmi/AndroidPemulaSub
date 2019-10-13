package com.example.submissionbeginner;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class About extends AppCompatActivity {
    ImageView ivProfile;
    TextView tvNama, tvTtl, tvEmail;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);

        ivProfile = findViewById(R.id.img_about_photo);
        tvNama = findViewById(R.id.tv_about_nama);
        tvTtl = findViewById(R.id.tv_about_ttl);
        tvEmail = findViewById(R.id.tv_about_email);

        Drawable res = getResources().getDrawable(R.drawable.profile);

        tvNama.setText("Mochamad Ghifari 'Azmi");
        tvTtl.setText("Kebumen, 30 September 1997");
        tvEmail.setText("ghifariazmi@gmail.com");
        Glide.with(this).load(res).override(260, 260).into(ivProfile);

    }
}
