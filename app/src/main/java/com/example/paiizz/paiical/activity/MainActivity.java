package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private String[] split;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();


    }

    private void initComponent() {
        Data data = Data.getInstance();
        split = new String[5];
        loadDataThaifood();
    }

    private void loadDataThaifood() {

        try {
            InputStream is = getAssets().open("thai food.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Log.e("eiei", split[0] + split[2] + split[4]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
