package com.example.paiizz.paiical.models;

import android.support.v7.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by PaiizZ on 4/13/2016 AD.
 */
public class Data extends AppCompatActivity {
    private static Data instance;
    private static ArrayList<Food> listAllfood,listThaifood, listSinglefood, listInterfood, listSnack, listDessert, listDrink, listFriut, listRestaurant, listEtc;
    private static ArrayList<Food> listLess100,listBetween100to200,listBetween200to300,listBetween300to400,listBetween400to500,listMore500;

    private boolean checkEdit;
    //  private File callText;


    private Data() {
        listAllfood = new ArrayList<>();
        listThaifood = new ArrayList<>();
        listSinglefood = new ArrayList<>();
        listInterfood = new ArrayList<>();
        listSnack = new ArrayList<>();
        listDessert = new ArrayList<>();
        listDrink = new ArrayList<>();
        listFriut = new ArrayList<>();
        listRestaurant = new ArrayList<>();
        listEtc = new ArrayList<>();
        listLess100  = new ArrayList<>();
        listBetween100to200  = new ArrayList<>();
        listBetween200to300  = new ArrayList<>();
        listBetween300to400  = new ArrayList<>();
        listBetween400to500  = new ArrayList<>();
        listMore500  = new ArrayList<>();


        checkEdit = true;

    }

    public static Data getInstance() {
        if (instance == null) instance = new Data();
        return instance;
    }
    public static ArrayList<Food> getListAllfood() {
        return listAllfood;
    }

    public static ArrayList<Food> getListLess100() {
        return listLess100;
    }

    public static ArrayList<Food> getListBetween100to200() {
        return listBetween100to200;
    }

    public static ArrayList<Food> getListBetween200to300() {
        return listBetween200to300;
    }

    public static ArrayList<Food> getListBetween300to400() {
        return listBetween300to400;
    }

    public static ArrayList<Food> getListBetween400to500() {
        return listBetween400to500;
    }

    public static ArrayList<Food> getListMore500() {
        return listMore500;
    }
    public static List<Food> getListThaifood() {
        return listThaifood;
    }

    public static List<Food> getListSinglefood() {
        return listSinglefood;
    }

    public static List<Food> getListInterfood() {
        return listInterfood;
    }

    public static List<Food> getListSnack() {
        return listSnack;
    }

    public static List<Food> getListDessert() {
        return listDessert;
    }

    public static List<Food> getListDrink() {
        return listDrink;
    }

    public static List<Food> getListFriut() {
        return listFriut;
    }

    public static List<Food> getListRestaurant() {
        return listRestaurant;
    }

    public static List<Food> getListEtc() {
        return listEtc;
    }

    public boolean isCheckEdit() {
        return checkEdit;
    }

    public void setCheckEdit(boolean checkEdit) {
        this.checkEdit = checkEdit;
    }

}
