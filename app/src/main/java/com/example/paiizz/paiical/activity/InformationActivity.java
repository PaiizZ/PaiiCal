package com.example.paiizz.paiical.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Information;

public class InformationActivity extends AppCompatActivity {

    Information information;
    TextView textName, textGender, textAge, textWeight, textHeight ,textActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        initComponent();
    }

    private void initComponent() {
        information = Information.getInstance();

        textName = (TextView) findViewById(R.id.nameTextViewInfo);
        textGender = (TextView) findViewById(R.id.genderTextViewInfo);
        textAge = (TextView) findViewById(R.id.ageTextViewInfo);
        textWeight = (TextView) findViewById(R.id.weightTextViewInfo);
        textHeight = (TextView)findViewById(R.id.heightTextViewInfo);
        textActivity = (TextView)findViewById(R.id.activityTextViewInfo);

        textName.setText(information.getName());
        textGender.setText(information.getGender());
        textAge.setText(information.getAge());
        textWeight.setText(information.getWeight());
        textHeight.setText(information.getHeight());
        textActivity.setText(information.getActivity());

    }

}
