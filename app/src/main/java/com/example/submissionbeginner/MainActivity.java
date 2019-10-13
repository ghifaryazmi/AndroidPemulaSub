package com.example.submissionbeginner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFoods;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvFoods = findViewById(R.id.rv_food);
        rvFoods.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(FoodData.getListData());
        showRecyclerList();


    }

    private void showRecyclerList() {
        rvFoods.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(this);
        listFoodAdapter.setListFood(list);
        rvFoods.setAdapter(listFoodAdapter);

//        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(Food data) {
//                showSelectedFood(data);
//            }
//        });
    }
//
//    private void showSelectedFood(Food food) {
//        Intent intent = new Intent(this, Details.class);
//        startActivity(intent);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

       int id = item.getItemId();
       if (id==R.id.about){
           Intent i = new Intent(this, About.class);
           startActivity(i);
       }

        return super.onOptionsItemSelected(item);
    }
}
