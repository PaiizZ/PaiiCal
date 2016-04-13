package com.example.paiizz.paiical.models;

/**
 * Created by PaiizZ on 4/13/2016 AD.
 */
public class Information {
    private static Information instance;
    private String name, gender;
    private int age;
    private double weight, height;

    public static Information getInstance() {
        if (instance == null) instance = new Information();
        return instance;
    }
}
