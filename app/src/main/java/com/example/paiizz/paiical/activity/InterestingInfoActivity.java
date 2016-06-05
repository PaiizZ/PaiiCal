package com.example.paiizz.paiical.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;
import com.example.paiizz.paiical.views.InfoAdapter;
import com.example.paiizz.paiical.views.MenuAdapter;
import com.example.paiizz.paiical.views.RecyclerItemClickListener;

import java.util.List;

public class InterestingInfoActivity extends AppCompatActivity {
    Data data;
    Intent intent;
    private InfoAdapter infoAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interesting_info);
        initComponent();
    }

    private void initComponent() {
        data = Data.getInstance();
        infoAdapter = new InfoAdapter(data.getListInteresting());
        recyclerView = (RecyclerView) findViewById(R.id.interesting_Recycler);
        recyclerView.setAdapter(infoAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        intent = new Intent(InterestingInfoActivity.this, BMIActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(InterestingInfoActivity.this, BMRActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(InterestingInfoActivity.this, LoseWeightActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(InterestingInfoActivity.this, ControlWeightActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(InterestingInfoActivity.this, GoodShapeActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(InterestingInfoActivity.this, GoodExerciseActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        }));
    }


}
