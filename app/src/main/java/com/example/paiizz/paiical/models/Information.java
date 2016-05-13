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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
