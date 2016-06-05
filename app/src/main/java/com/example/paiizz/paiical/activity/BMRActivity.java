package com.example.paiizz.paiical.activity;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.paiizz.paiical.R;

public class BMRActivity extends AppCompatActivity {
private TextView BMR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);
        BMR = (TextView)findViewById(R.id.textViewBMR);
        BMR.setText("To determine your total daily calorie needs, multiply your BMR by the appropriate activity factor, as follows:\n" +
                "\n" +
                "If you are sedentary (little or no exercise) : Calorie-Calculation = BMR x 1.2\n" +
                "If you are lightly active (light exercise/sports 1-3 days/week) : Calorie-Calculation = BMR x 1.375\n" +
                "If you are moderatetely active (moderate exercise/sports 3-5 days/week) : Calorie-Calculation = BMR x 1.55\n" +
                "If you are very active (hard exercise/sports 6-7 days a week) : Calorie-Calculation = BMR x 1.725\n" +
                "If you are extra active (very hard exercise/sports & physical job or 2x training) : Calorie-Calculation = BMR x 1.9\n" +
                "\n" +
                "Total Calorie Needs Example\n" +
                "If you are sedentary, multiply your BMR (1745) by 1.2 = 2094. This is the total number of calories you need in order to maintain your current weight.");
    }
}
