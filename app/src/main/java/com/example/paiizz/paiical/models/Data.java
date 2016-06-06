package com.example.paiizz.paiical.models;

import java.util.ArrayList;

/**
 * Created by PaiizZ on 4/13/2016 AD.
 */
public class Data {
    private static Data instance;
    private static ArrayList<Food> listAllfood, listThaifood, listSinglefood, listInterfood, listSnack, listDessert, listDrink, listFriut, listRestaurant, listEtc;
    private static ArrayList<Food> listLess100, listBetween100to200, listBetween200to300, listBetween300to400, listBetween400to500, listMore500;
    private static ArrayList<Food> listEat, listSearchName;
    private static ArrayList<String> listInteresting;
    private int index_search;
    private boolean checkEdit;


    private Data() {
        index_search = 0;

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
        listLess100 = new ArrayList<>();
        listBetween100to200 = new ArrayList<>();
        listBetween200to300 = new ArrayList<>();
        listBetween300to400 = new ArrayList<>();
        listBetween400to500 = new ArrayList<>();
        listMore500 = new ArrayList<>();
        listEat = new ArrayList<>();
        listInteresting = new ArrayList<>();
        listSearchName = new ArrayList<>();
        addlistInterestingInfo();
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

    public static ArrayList<Food> getListThaifood() {
        return listThaifood;
    }

    public static ArrayList<Food> getListSinglefood() {
        return listSinglefood;
    }

    public static ArrayList<Food> getListInterfood() {
        return listInterfood;
    }

    public static ArrayList<Food> getListSnack() {
        return listSnack;
    }

    public static ArrayList<Food> getListDessert() {
        return listDessert;
    }

    public static ArrayList<Food> getListDrink() {
        return listDrink;
    }

    public static ArrayList<Food> getListFriut() {
        return listFriut;
    }

    public static ArrayList<Food> getListRestaurant() {
        return listRestaurant;
    }

    public static ArrayList<Food> getListEtc() {
        return listEtc;
    }

    public static ArrayList<Food> getListEat() {
        return listEat;
    }

    public static ArrayList<String> getListInteresting() {
        return listInteresting;
    }

    public boolean isCheckEdit() {
        return checkEdit;
    }

    public void setCheckEdit(boolean checkEdit) {
        this.checkEdit = checkEdit;
    }

    public int getIndex_search() {
        return index_search;
    }

    public void setIndex_search(int index_search) {
        this.index_search = index_search;
    }

    public static ArrayList<Food> getListSearchName() {
        return listSearchName;
    }

    public void removeDateInListSearchName() {
        listSearchName.clear();
    }

    public void addlistInterestingInfo() {
        getListInteresting().add("BMI");
        getListInteresting().add("BMR");
        getListInteresting().add("How to lose weight");
        getListInteresting().add("How to control weight");
        getListInteresting().add("How to good shape");
        getListInteresting().add("How to good exercise");
    }
}
