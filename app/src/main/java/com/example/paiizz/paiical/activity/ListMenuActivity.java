package com.example.paiizz.paiical.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;
import com.example.paiizz.paiical.models.Food;
import com.example.paiizz.paiical.views.MenuAdapter;
import com.example.paiizz.paiical.views.RecyclerItemClickListener;

import java.util.ArrayList;

public class ListMenuActivity extends AppCompatActivity {
    private int index_category, index_calorie;
    private MenuAdapter menuAdapter;
    private RecyclerView recyclerView;
    private Data data;
    private int index_case;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        data = Data.getInstance();
        switch (data.getIndex_search()) {
            case 1:
                index_category = (int) getIntent().getSerializableExtra("index_category");
                index_case = 1;
                break;
            case 2:
                index_case = 2;
                break;
            case 3:
                index_calorie = (int) getIntent().getSerializableExtra("calorie");
                index_case = 3;
                break;
            default:
                break;
        }
        initComponent();
    }

    private void initComponent() {

        // Log.e("index_category",index_category+"");
        //Log.e("Thai1",data.getListThaifood().size()+"");
        if (index_case == 1) {
            switch (index_category) {
                case 1: {
                    //Log.e("Thai2",data.getListThaifood().size()+"");
                    menuAdapter = new MenuAdapter(data.getListThaifood(),this);
                    // Log.e("menuAdapter", menuAdapter.getItemCount() + "");
                    break;
                }
                case 2: {
                    menuAdapter = new MenuAdapter(data.getListSinglefood(),this);
                    break;
                }
                case 3: {
                    menuAdapter = new MenuAdapter(data.getListInterfood(),this);
                    break;
                }
                case 4: {
                    menuAdapter = new MenuAdapter(data.getListSnack(),this);
                    break;
                }
                case 5: {
                    menuAdapter = new MenuAdapter(data.getListDessert(),this);
                    break;
                }
                case 6: {
                    menuAdapter = new MenuAdapter(data.getListDrink(),this);
                    break;
                }
                case 7: {
                    menuAdapter = new MenuAdapter(data.getListFriut(),this);
                    break;
                }
                case 8: {
                    menuAdapter = new MenuAdapter(data.getListRestaurant(),this);
                    break;
                }
                case 9: {
                    menuAdapter = new MenuAdapter(data.getListEtc(),this);
                    break;
                }
                default:
                    break;
            }
        } else if (index_case == 2) {
            menuAdapter = new MenuAdapter(data.getListSearchName(),this);
        } else if (index_case == 3) {
            switch (index_calorie) {
                case 1: {
                    menuAdapter = new MenuAdapter(data.getListLess100(),this);
                    break;
                }
                case 2: {
                    menuAdapter = new MenuAdapter(data.getListBetween100to200(),this);
                    break;
                }
                case 3: {
                    menuAdapter = new MenuAdapter(data.getListBetween200to300(),this);
                    break;
                }
                case 4: {
                    menuAdapter = new MenuAdapter(data.getListBetween300to400(),this);
                    break;
                }
                case 5: {
                    menuAdapter = new MenuAdapter(data.getListBetween300to400(),this);
                    break;
                }
                case 6: {
                    menuAdapter = new MenuAdapter(data.getListMore500(),this);
                    break;
                }
                default:
                    break;
            }
        }
        recyclerView = (RecyclerView) findViewById(R.id.menu_Recycler);
        recyclerView.setAdapter(menuAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

            }
        }));
    }


}
