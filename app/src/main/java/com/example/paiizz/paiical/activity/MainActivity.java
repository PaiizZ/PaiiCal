package com.example.paiizz.paiical.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;
import com.example.paiizz.paiical.models.Food;
import com.example.paiizz.paiical.models.Information;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private String[] split;
    Data data;
    Information information;
    EditText editName, editAge, editWeight, editHeight;
    RadioButton radioButtonMale, radioButtonFemale;
    Button saveButton;
    Spinner spinnerActivity;
    String spin_val;
    String[] menuActivity = {"Choose Activities", "Don't Exercise","Exercise 1-3 day/week.","Exercise 3-5 day/week.","Exercise 6-7 day/week.","Exercise every day, morning and evening."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();


    }

    private void initComponent() {
        data = Data.getInstance();
        information = Information.getInstance();
        split = new String[5];
        loadDataThaifood();

        editName = (EditText) findViewById(R.id.nameTextEditMain);
        editAge = (EditText) findViewById(R.id.ageTextEditMain);
        editWeight = (EditText) findViewById(R.id.weightTextEditMain);
        editHeight = (EditText) findViewById(R.id.heightTextEditMain);

        radioButtonMale = (RadioButton) findViewById(R.id.radioButtonMale);
        radioButtonFemale = (RadioButton) findViewById(R.id.radioButtonFemale);
        radioButtonMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButtonFemale.setChecked(false);

            }
        });

        radioButtonFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButtonMale.setChecked(false);
            }
        });

        spinnerActivity = (Spinner) findViewById(R.id.spinnerActivity);
        spinnerActivity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spin_val = menuActivity[position];
                //Log.e("Test",spin_val);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //setting array adaptors to spinners
        //ArrayAdapter is a BaseAdapter that is backed by an array of arbitrary objects
        ArrayAdapter<String> spin_adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, menuActivity);

        // setting adapteers to spinners
        spinnerActivity.setAdapter(spin_adapter);


        saveButton = (Button) findViewById(R.id.buttonSaveMain);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                information.setName(editName.getText().toString());
                information.setAge(Integer.parseInt(editAge.getText().toString()));
                information.setWeight(Double.parseDouble(editWeight.getText().toString()));
                information.setHeight(Double.parseDouble(editHeight.getText().toString()));

                Intent intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });

    }

    private void loadDataThaifood() {

        try {
            InputStream is = getAssets().open("thai food.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Food food = new Food(split[0], split[2], split[4]);
                Data.getThaifood().add(food);
                //Log.e("eiei", split[0] + split[2] + split[4]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
