package com.example.paiizz.paiical.activity;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.paiizz.paiical.R;

public class MenuActivity extends AppCompatActivity {

    private Button searchMenu,listConsumption,information,interestingInfo;
    private ImageView iconSearchMenu,iconConsumption,iconInformation,iconInteresting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initComponent();
    }

    private void initComponent(){

        iconSearchMenu = (ImageView)findViewById(R.id.imageViewSearchMenu);
        iconSearchMenu.setImageResource(R.drawable.search);
        iconConsumption = (ImageView)findViewById(R.id.imageViewConsumption);
        iconConsumption.setImageResource(R.drawable.consumption);
        iconInformation = (ImageView)findViewById(R.id.imageViewInformation);
        iconInformation.setImageResource(R.drawable.information);
        iconInteresting = (ImageView)findViewById(R.id.imageViewInteresting);
        iconInteresting.setImageResource(R.drawable.interesting);

        searchMenu = (Button)findViewById(R.id.buttonSearchMenu);
        searchMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,SearchMenuActivity.class);
                startActivity(intent);
            }
        });

        listConsumption = (Button)findViewById(R.id.buttonConsumption);
        listConsumption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,ListConsumptionActivity.class);
                startActivity(intent);
            }
        });

        information = (Button)findViewById(R.id.buttonInformation);
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,InformationActivity.class);
                startActivity(intent);
            }
        });

        interestingInfo = (Button)findViewById(R.id.buttonInteresting);
        interestingInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, InterestingInfoActivity.class);
                startActivity(intent);
            }
        });
    }


}
