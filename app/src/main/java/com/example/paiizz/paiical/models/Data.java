package com.example.paiizz.paiical.models;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PaiizZ on 4/13/2016 AD.
 */
public class Data extends AppCompatActivity {
    private static Data instance;
    private List<Food> thaifood;
    private File callText;

    private Data() {
        thaifood = new ArrayList<>();

    }

    public static Data getInstance() {
        if (instance == null) instance = new Data();
        return instance;
    }


}
