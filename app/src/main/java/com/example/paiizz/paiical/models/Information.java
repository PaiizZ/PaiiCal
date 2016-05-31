package com.example.paiizz.paiical.models;

/**
 * Created by PaiizZ on 4/13/2016 AD.
 */
public class Information {
    private static Information instance;
    private String name, gender, age;
    private String weight;
    private String height;
    private String activity;
    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }




    public static Information getInstance() {
        if (instance == null) instance = new Information();
        return instance;
    }
    public Information(){
        name="";
        gender="";
        weight="";
        height="";
        age="";
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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
