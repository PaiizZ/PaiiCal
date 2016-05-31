package com.example.paiizz.paiical.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.paiizz.paiical.R;

public class SearchMenuActivity extends AppCompatActivity {
    private Button searchName,searchCategory,searchCalorie;
    private ImageView imageName,imageCategory,imageCalorie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_menu);
        initComponent();
    }
    private void initComponent(){
        searchName = (Button)findViewById(R.id.buttonName);
        searchName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchMenuActivity.this,SearchNameActivity.class);
                startActivity(intent);
            }
        });

        searchCategory = (Button)findViewById(R.id.buttonCategory);
        searchCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchMenuActivity.this,SearchCategoryActivity.class);
                startActivity(intent);
            }
        });

        searchCalorie = (Button)findViewById(R.id.buttonCalorie);
        searchCalorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchMenuActivity.this,SearchCalorieActivity.class);
                startActivity(intent);
            }
        });

        imageName = (ImageView)findViewById(R.id.imageViewName);
        imageCalorie = (ImageView)findViewById(R.id.imageViewCalorie);
        imageCategory = (ImageView)findViewById(R.id.imageViewCategory);

        imageName.setImageResource(R.drawable.name);
        imageCategory.setImageResource(R.drawable.category);
        imageCalorie.setImageResource(R.drawable.calorie);


    }

}
