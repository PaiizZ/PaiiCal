package com.example.paiizz.paiical.models;

/**
 * Created by PaiizZ on 5/21/2016 AD.
 */
public class Cal {
    private static Cal instance;
    Information information;
    private double weight, height, age;
    private String activity;


    private Cal() {
        //information = Information.getInstance();


    }
    public void setInformation(Information information){
        this.information = information;
        weight = Double.parseDouble(information.getWeight());
        height = Double.parseDouble(information.getHeight());
        age = Double.parseDouble(information.getAge());
        activity = information.getActivity();
    }
    public static Cal getInstance() {
        if (instance == null) instance = new Cal();
        return instance;
    }

    public double getBMI() {
        return weight / Math.pow(height*0.01,2);
    }

    public double getBMR() {
        if (information.getGender().equalsIgnoreCase("male")) {
            return 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        }
        return 665 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
    }

    public double getEnergy() {
        if (activity.equalsIgnoreCase("Exercise 1-3 day/week."))
            return getBMR() * 1.375;
        else if (activity.equalsIgnoreCase("Exercise 3-5 day/week."))
            return getBMR() * 1.55;
        else if (activity.equalsIgnoreCase("Exercise 6-7 day/week."))
            return getBMR() * 1.725;
        else if (activity.equalsIgnoreCase("Exercise every day, morning and evening."))
            return getBMR() * 1.9;
        else
            return getBMR() * 1.2;
    }

    public String getCriterion() {
        if (getBMI() < 18.50)
            return "Thin";
        else if (getBMI() >= 18.50 && getBMI() <= 22.99)
            return "Normal";
        else if (getBMI() >= 23 && getBMI() <= 24.99)
            return "Fat level 1";
        else if (getBMI() >= 25 && getBMI() <= 29.99)
            return "Fat level 2";
        else
            return "Fat level 3";
    }
}
