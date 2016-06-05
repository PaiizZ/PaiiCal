package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.paiizz.paiical.R;

public class BMIActivity extends AppCompatActivity {
    private TextView BMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        BMI = (TextView)findViewById(R.id.textViewBMI);
        BMI.setText("BMI (Body Mass Index) is a measurement of body fat based on height and weight that applies to both men and women between the ages of 18 and 65 years.\n" +
                "\n" +
                "BMI can be used to indicate if you are overweight, obese, underweight or normal. A healthy BMI score is between 20 and 25. A score below 20 indicates that you may be underweight; a value above 25 indicates that you may be overweight.\n" +
                "\n" +
                "You can calculate your BMI by using our BMI Calculator below, or by using the BMI Formula.\n" +
                "\n" +
                "Please remember, however, that this is only one of many possible ways to assess your weight. If you have any concerns about your weight, please discuss them with your physician, who is in a position, unlike this BMI calculator, to address your specific individual situation.\n" +
                "\n" +
                "BMI Classification\n" +
                "18.5 or less Underweight Info Treatment\n" +
                "18.5 to 24.99 Normal Weight Info Treatment\n" +
                "25 to 29.99 Overweight Info Treatment\n" +
                "30 to 34.99 Obesity (Class 1) Info Treatment\n" +
                "35 to 39.99 Obesity (Class 2) Info Treatment\n" +
                "40 or greater Morbid Obesity");
    }
}
