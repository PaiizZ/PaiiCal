package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;
import com.example.paiizz.paiical.views.ConsumptionAdapter;
import com.example.paiizz.paiical.views.MenuAdapter;
import com.example.paiizz.paiical.views.RecyclerItemClickListener;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class ListConsumptionActivity extends AppCompatActivity {
    private TextView toDayEat, eatFromEnegy, dateText;
    private Calendar calendar;
    Date date;
    private ConsumptionAdapter consumptionAdapter;
    Data data;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_consumption);
        initComponent();
    }

    private void initComponent() {
        data = Data.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        calendar = Calendar.getInstance();
        toDayEat = (TextView) findViewById(R.id.textViewTodateat);
        eatFromEnegy = (TextView) findViewById(R.id.textViewEatfromEnegy);
        dateText = (TextView) findViewById(R.id.textViewDate);
        dateText.setText(dateFormat.format(date));


        consumptionAdapter = new ConsumptionAdapter(data.getListEat());
        recyclerView = (RecyclerView) findViewById(R.id.consumption_recycler);
        recyclerView.setAdapter(consumptionAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

            }
        }));

    }
}
