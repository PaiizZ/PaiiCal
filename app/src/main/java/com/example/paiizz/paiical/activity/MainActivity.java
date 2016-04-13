package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent(){
        data = Data.getInstance();
    }
}
