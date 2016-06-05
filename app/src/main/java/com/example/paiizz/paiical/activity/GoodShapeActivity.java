package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.paiizz.paiical.R;
public class GoodShapeActivity extends AppCompatActivity {
    private TextView goodShape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_shape);
        goodShape = (TextView)findViewById(R.id.textViewGoodShape);
        goodShape.setText("The other section is Fitness, which has both internal and external benefits. One the outside, fitness includes weight lifting, running, sports, walking, things you can do to enhance, tone, and build muscle. However, fitness also has benefits for the inside such as great cardiovascular benefits among others.\n" +
                "\n" +
                "1.   Acupuncture\n" +
                "2.   Biofeedback\n" +
                "3. Therapeutic Massage\n" +
                "4. Eat Less Later in the Day\n" +
                "5. Supplements and Vitamins\n" +
                "6. Eliminate Stress\n" +
                "7. sleep\n" +
                "8. Laugh it Off\n" +
                "9. Nutrition\n" +
                "10. Yoga\n" +
                "11. stop smorking\n" +
                "12.Mixing Medications\n" +
                "13.Drink Wisely\n" +
                "14.Young at Heart\n" +
                "15.Regular Checkups");
    }
}
