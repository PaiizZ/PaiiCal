package com.example.paiizz.paiical.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.paiizz.paiical.R;
public class SearchCalorieActivity extends AppCompatActivity {
    Spinner spinnerSearchCalorie;
    String spin_val = "";
    String[] choiceCalorie = {"The amount of calories","Less than 100 KCal", "Between 100-200 KCal", "Between 200-300 KCal", "Between 300-400 KCal", "Between 400-500 KCal", "Between 500-600 KCal","More than 600 KCal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_calorie);
    }

    private void initComponent(){
        spinnerSearchCalorie = (Spinner) findViewById(R.id.spinnerSearchCalorie);
        spinnerSearchCalorie.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int index, long id) {
                spin_val = choiceCalorie[index];
                //Log.e("Test",spin_val);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //setting array adaptors to spinners
        //ArrayAdapter is a BaseAdapter that is backed by an array of arbitrary objects
        ArrayAdapter<String> spin_adapter = new ArrayAdapter<String>(SearchCalorieActivity.this, android.R.layout.simple_spinner_item, choiceCalorie);

        // setting adapteers to spinners
        spinnerSearchCalorie.setAdapter(spin_adapter);
    }
}
