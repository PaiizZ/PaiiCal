package com.example.paiizz.paiical.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Cal;
import com.example.paiizz.paiical.models.Information;

public class InformationActivity extends AppCompatActivity {

    Information information;
    Cal cal;
    TextView textName, textGender, textAge, textWeight, textHeight ,textActivity ,textBMI,textCriterion,textEnergy ;
    Button edit,menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        initComponent();
    }

    private void initComponent() {
        information = Information.getInstance();
        cal = Cal.getInstance();

        textName = (TextView) findViewById(R.id.nameTextViewInfo);
        textGender = (TextView) findViewById(R.id.genderTextViewInfo);
        textAge = (TextView) findViewById(R.id.ageTextEditInfo);
        textWeight = (TextView) findViewById(R.id.weightTextViewInfo);
        textHeight = (TextView)findViewById(R.id.heightTextViewInfo);
        textActivity = (TextView)findViewById(R.id.activityTextViewInfo);
        textBMI = (TextView)findViewById(R.id.BMITextViewInfo);
        textCriterion = (TextView)findViewById(R.id.criterionTextViewInfo);
        textEnergy = (TextView)findViewById(R.id.WantTextViewInfo);

        textName.setText(information.getName());
        textGender.setText(information.getGender());
        textAge.setText(information.getAge());
        textWeight.setText(information.getWeight());
        textHeight.setText(information.getHeight());
        textActivity.setText(information.getActivity());
        textBMI.setText(String.format("%.2f", cal.getBMI()));
        textCriterion.setText(cal.getCriterion());
        textEnergy.setText(String.format("%.2f", cal.getEnergy()));

        edit = (Button) findViewById(R.id.buttonEditInfo);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(InformationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        menu = (Button) findViewById(R.id.buttonMenuInfo);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(InformationActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

    }

}
