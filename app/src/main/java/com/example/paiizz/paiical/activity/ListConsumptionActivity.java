package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.paiizz.paiical.R;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_consumption);
        initComponent();
    }

    private void initComponent() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        calendar = Calendar.getInstance();
        toDayEat = (TextView) findViewById(R.id.textViewTodateat);
        eatFromEnegy = (TextView) findViewById(R.id.textViewEatfromEnegy);
        dateText = (TextView) findViewById(R.id.textViewDate);
        dateText.setText(dateFormat.format(date));

    }
}
