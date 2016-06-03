package com.example.paiizz.paiical.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Cal;
import com.example.paiizz.paiical.models.Data;
import com.example.paiizz.paiical.models.Food;
import com.example.paiizz.paiical.models.Information;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "preferenceName";
    public static final String PREFS_GENDER = "preferenceGender";
    public static final String PREFS_AGE = "preferenceAge";
    public static final String PREFS_WEIGHT = "preferenceWeight";
    public static final String PREFS_HEIGHT = "preferenceHeight";
    public static final String PREFS_ACTIVITY = "preferenceActivity";
    private String[] split;
    Data data;
    Information information;
    Cal cal;
    EditText editName, editAge, editWeight, editHeight;
    RadioButton radioButtonMale, radioButtonFemale;
    Spinner spinnerActivity;
    Button saveButton;
    String spin_val, gender = "";
    String[] menuActivity = {"Choose Activities", "Don't Exercise.", "Exercise 1-3 day/week.", "Exercise 3-5 day/week.", "Exercise 6-7 day/week.", "Exercise every day, morning and evening."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();

        SharedPreferences sharedPref = MainActivity.this.getPreferences(Context.MODE_PRIVATE);


        String checkPref = sharedPref.getString(PREFS_NAME, null);
        if (checkPref != null) {
            information.setName(sharedPref.getString(PREFS_NAME, null));
            information.setGender(sharedPref.getString(PREFS_GENDER, null));
            information.setAge(sharedPref.getString(PREFS_AGE, null));
            information.setWeight(sharedPref.getString(PREFS_WEIGHT, null));
            information.setHeight(sharedPref.getString(PREFS_HEIGHT, null));
            information.setActivity(sharedPref.getString(PREFS_ACTIVITY, null));

            if (data.isCheckEdit()) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
            data.setCheckEdit(true);
        }


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
                gender = "Male";

            }
        });

        radioButtonFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButtonMale.setChecked(false);
                gender = "Female";
            }
        });

        spinnerActivity = (Spinner) findViewById(R.id.spinnerActivity);
        spinnerActivity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int index, long id) {
                spin_val = menuActivity[index];
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
                information.setGender(gender);
                information.setAge(editAge.getText().toString());
                information.setWeight(editWeight.getText().toString());
                information.setHeight(editHeight.getText().toString());
                information.setActivity(spin_val);
                cal = Cal.getInstance();
                cal.setInformation();

                SharedPreferences sharedPref = MainActivity.this.getPreferences(Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(PREFS_NAME, editName.getText().toString());
                editor.putString(PREFS_GENDER, gender);
                editor.putString(PREFS_AGE, editAge.getText().toString());
                editor.putString(PREFS_WEIGHT, editWeight.getText().toString());
                editor.putString(PREFS_HEIGHT, editHeight.getText().toString());
                editor.putString(PREFS_ACTIVITY, spin_val);
                editor.commit();


                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
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
