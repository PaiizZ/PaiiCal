package com.example.paiizz.paiical.models;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by PaiizZ on 4/13/2016 AD.
 */
public class Data extends AppCompatActivity {
    private static Data instance;
    private static List<Food> thaifood;
    private boolean checkEdit ;
    //  private File callText;


    private Data() {
        thaifood = new ArrayList<>();
        checkEdit = true;

    }

    public static Data getInstance() {
        if (instance == null) instance = new Data();
        return instance;
    }

    public static List<Food> getThaifood() {
        return thaifood;
    }

    public boolean isCheckEdit() {
        return checkEdit;
    }

    public void setCheckEdit(boolean checkEdit) {
        this.checkEdit = checkEdit;
    }

}
