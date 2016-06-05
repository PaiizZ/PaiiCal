package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.paiizz.paiical.R;
public class LoseWeightActivity extends AppCompatActivity {
    private TextView loseWeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_weight);
        loseWeight = (TextView)findViewById(R.id.textViewLoseWeight);
        loseWeight.setText("Start at the top of the list (most important) and go down as far as you need. Klick on any tip to read all about it. Perhaps you only need the first piece of advice?\n" +
                "\n" +
                "1.Choose a low-carb diet\n" +
                "2.Eat when hungry\n" +
                "3.Eat real food\n" +
                "4.Eat only when hungry\n" +
                "5.Measure your progress wisely\n" +
                "6.Be persistent\n" +
                "7.Women: Avoid fruit\n" +
                "8.Men: Avoid beer\n" +
                "9.Avoid artificial sweeteners\n" +
                "10.Review any medications\n" +
                "11.Stress less, sleep more\n" +
                "12.Eat less of dairy products and nuts\n" +
                "13.Supplement vitamins and minerals\n" +
                "14.Use intermittent fasting\n" +
                "15.Exercise smart\n" +
                "16.Achieve optimal ketosis\n" +
                "17.Get your hormones checked\n" +
                "18.Consider weight loss pills / drugs (if desperate)");
    }
}
