package com.example.paiizz.paiical.models;

/**
 * Created by PaiizZ on 4/13/2016 AD.
 */
public class Food {

    private String name;
    private String calorie;
    private String value;
    private String type;


    public Food(String name, String calorie, String value, String type) {
        this.name = name;
        this.calorie = calorie;
        this.value = value;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public String getCalorie() {
        return calorie;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
