package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.paiizz.paiical.R;
public class GoodExerciseActivity extends AppCompatActivity {

    private TextView goodExercise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_exercise);
        goodExercise = (TextView)findViewById(R.id.textViewGoodExercise);
        goodExercise.setText("Exercise is a great way to get a healthier, stronger body. It can also be a great way to relax and make you happier. It is important to remember, though, that you should always alternate between different types of exercise to ensure that your whole body gets the attention it needs. If you want to get started exercising to improve your quality of life, read below for helpful explanations, tips, and example workout routines for every ability level and lifestyle.\n" +
                "\n" +
                "Here's how the study participants ranked their motivators:\n" +
                "\n" +
                "1.Fitness\n" +
                "2.Feelings of well-being\n" +
                "3.Pep and energy\n" +
                "4.Enjoyment of the exercise\n" +
                "5.Making exercise a priority\n" +
                "6.Sleeping better\n" +
                "7.Feeling alert\n" +
                "Being relaxed\n" +
                "Weight management\n" +
                "Appearance");
    }

}
