package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.paiizz.paiical.R;
public class ControlWeightActivity extends AppCompatActivity {
    private TextView controlWeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_weight);
        controlWeight = (TextView)findViewById(R.id.textViewControlWeight);
        controlWeight.setText("You've just lost weight and you don't want to see that number go back up on your scale. Although gaining the weight back might feel inevitable, it doesn’t have to be. In fact a recent analysis by the National Weight Control Registry found long-term weight maintenance is possible — if you follow these key behaviors. Below, 11 tricks from dietitians and successful dieters who were able to lose and weight and keep if off.\n" +
                "\n" +
                "1.Fight off hunger with more filling foods. \n" +
                "2.Avoid temptation. \n" +
                "3.Count calories. \n" +
                "4.Plan your meals in advance.\n" +
                "5.Consider adding minutes to your exercise plan\n" +
                "6.Measure your portions. \n" +
                "7.Weigh yourself daily.\n" +
                "8.Include dairy in your diet.\n" +
                "9.Let your plate be your guide.\n" +
                "10.Watch less TV. \n" +
                "11.Eat breakfast.");
    }
}
