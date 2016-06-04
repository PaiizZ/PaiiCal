package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;
import com.example.paiizz.paiical.models.Food;
import com.example.paiizz.paiical.views.MenuAdapter;

import java.util.ArrayList;

public class ListMenuActivity extends AppCompatActivity {
    private int index_category;
    private MenuAdapter menuAdapter;
    private Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        index_category = (int) getIntent().getSerializableExtra("index_category");
        initComponent();
    }

    private void initComponent() {
        data = Data.getInstance();
        Log.e("index_category",index_category+"");
        switch (index_category) {
            case 1: {
                menuAdapter = new MenuAdapter(data.getListThaifood());
            }
            case 2: {
                menuAdapter = new MenuAdapter(data.getListSinglefood());
            }
            case 3: {
                menuAdapter = new MenuAdapter(data.getListInterfood());
            }
            case 4: {
                menuAdapter = new MenuAdapter(data.getListSnack());
            }
            case 5: {
                menuAdapter = new MenuAdapter(data.getListDessert());
            }
            case 6: {
                menuAdapter = new MenuAdapter(data.getListDrink());
            }
            case 7: {
                menuAdapter = new MenuAdapter(data.getListFriut());
            }
            case 8: {
                menuAdapter = new MenuAdapter(data.getListRestaurant());
            }
            default: {
                menuAdapter = new MenuAdapter(data.getListEtc());
            }


        }


    }


}
