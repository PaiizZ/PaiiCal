package com.example.paiizz.paiical.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MenuActivity extends AppCompatActivity {
    private Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initComponent();
    }

    private void initComponent() {
        data = Data.getInstance();

    }


}
