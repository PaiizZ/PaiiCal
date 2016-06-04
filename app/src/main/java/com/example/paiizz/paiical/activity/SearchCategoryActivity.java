package com.example.paiizz.paiical.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.paiizz.paiical.R;
public class SearchCategoryActivity extends AppCompatActivity {

    ImageButton buttonThaifood,buttonSinglefood,buttonInterfood,buttonSnack,buttonDessert,buttonDrink,buttonFriut,buttonRestaurant,buttonEtc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_category);
        initComponent();
    }

    private void initComponent(){

        buttonThaifood = (ImageButton)findViewById(R.id.imageButtonThaifood);
        buttonThaifood.setImageResource(R.drawable.thaifood);
        buttonThaifood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchCategoryActivity.this,ListMenuActivity.class);
                intent.putExtra("index_category",1);
                startActivity(intent);
            }
        });

        buttonSinglefood = (ImageButton)findViewById(R.id.imageButtonSinglefood);
        buttonSinglefood.setImageResource(R.drawable.singlefood);
        buttonSinglefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchCategoryActivity.this,ListMenuActivity.class);
                intent.putExtra("index_category",2);
                startActivity(intent);
            }
        });

        buttonInterfood = (ImageButton)findViewById(R.id.imageButtonInterfood);
        buttonInterfood.setImageResource(R.drawable.interfood);
        buttonInterfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchCategoryActivity.this,ListMenuActivity.class);
                intent.putExtra("index_category",3);
                startActivity(intent);
            }
        });

        buttonSnack = (ImageButton)findViewById(R.id.imageButtonSnack);
        buttonSnack.setImageResource(R.drawable.snack);
        buttonSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchCategoryActivity.this,ListMenuActivity.class);
                intent.putExtra("index_category",4);
                startActivity(intent);
            }
        });

        buttonDessert = (ImageButton)findViewById(R.id.imageButtonDessert);
        buttonDessert.setImageResource(R.drawable.dessert);
        buttonDessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchCategoryActivity.this,ListMenuActivity.class);
                intent.putExtra("index_category",5);
                startActivity(intent);
            }
        });

        buttonDrink = (ImageButton)findViewById(R.id.imageButtonDrink);
        buttonDrink.setImageResource(R.drawable.drink);
        buttonDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchCategoryActivity.this,ListMenuActivity.class);
                intent.putExtra("index_category",6);
                startActivity(intent);
            }
        });

        buttonFriut = (ImageButton)findViewById(R.id.imageButtonFriut);
        buttonFriut.setImageResource(R.drawable.friut);
        buttonFriut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchCategoryActivity.this,ListMenuActivity.class);
                intent.putExtra("index_category",7);
                startActivity(intent);
            }
        });

        buttonRestaurant = (ImageButton)findViewById(R.id.imageButtonRestaurant);
        buttonRestaurant.setImageResource(R.drawable.restaurut);
        buttonRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchCategoryActivity.this,ListMenuActivity.class);
                intent.putExtra("index_category",8);
                startActivity(intent);
            }
        });

        buttonEtc = (ImageButton)findViewById(R.id.imageButtonEtc);
        buttonEtc.setImageResource(R.drawable.etc);
        buttonEtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchCategoryActivity.this,ListMenuActivity.class);
                intent.putExtra("index_category",9);
                startActivity(intent);
            }
        });



    }

}
