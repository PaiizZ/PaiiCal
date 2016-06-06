package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Cal;
import com.example.paiizz.paiical.models.Data;
import com.example.paiizz.paiical.views.ConsumptionAdapter;
import com.example.paiizz.paiical.views.MenuAdapter;
import com.example.paiizz.paiical.views.RecyclerItemClickListener;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;

public class ListConsumptionActivity extends AppCompatActivity {
    private TextView toDayEat, eatFromEnegy, dateText;
    private ImageView imageView;
    private ConsumptionAdapter consumptionAdapter;
    Data data;
    Cal cal;
    private RecyclerView recyclerView;

    public ListConsumptionActivity getInstance() {
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_consumption);
        initComponent();
    }


    private void initComponent() {
        data = Data.getInstance();
        cal = Cal.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        toDayEat = (TextView) findViewById(R.id.textViewTodateat);
        toDayEat.setText("Todat,eat " + cal.calKcalthateat(data.getListEat()) + " Kcal");
        eatFromEnegy = (TextView) findViewById(R.id.textViewEatfromEnegy);
        eatFromEnegy.setText(String.format("%.2f %% from energy want", cal.percentKcalthateat(data.getListEat())));
        dateText = (TextView) findViewById(R.id.textViewDate);
        dateText.setText(dateFormat.format(date));
        imageView = (ImageView) findViewById(R.id.imageViewConsumption);
        if (cal.percentKcalthateat(data.getListEat()) <= 100.0)
            imageView.setImageResource(R.drawable.smiley);
        else
            imageView.setImageResource(R.drawable.sad);


        consumptionAdapter = new ConsumptionAdapter(data.getListEat(), this);
        recyclerView = (RecyclerView) findViewById(R.id.consumption_recycler);
        recyclerView.setAdapter(consumptionAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

}
