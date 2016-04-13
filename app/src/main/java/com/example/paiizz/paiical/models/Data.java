package com.example.paiizz.paiical.models;

import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by PaiizZ on 4/13/2016 AD.
 */
public class Data {
    private static Data instance;
    private List<Food> thaifood;
   private File callText;

    private Data(){
        thaifood = new ArrayList<>();
        dataThaifood();

    }
    public static Data getInstance() {
        if (instance == null) instance = new Data();
        return instance;
    }
    private void dataThaifood(){

        callText = new File("/src/textFile/thaifood.txt");
        try{
            Scanner input = new Scanner(callText);
            while(input.hasNext()){
                Food thiafoodData = new Food(input.next(),input.nextInt(),input.next());
                String data = "fuck";
                thaifood.add(thiafoodData);
                Log.e("data",data);
            }

        } catch(Exception o){
            Log.e("data", "File not found");
        }



    }
}
