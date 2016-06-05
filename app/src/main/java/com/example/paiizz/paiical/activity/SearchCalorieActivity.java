package com.example.paiizz.paiical.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;

public class SearchCalorieActivity extends AppCompatActivity {
    Spinner spinnerSearchCalorie;
    String spin_val = "";
    String[] choiceCalorie = {"Choice for search calories","Less than 100 KCal", "Between 100-200 KCal", "Between 200-300 KCal", "Between 300-400 KCal", "Between 400-500 KCal","More than 500 KCal"};
    Button searchCalorie;
    int numCalorie;
    Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_calorie);
        initComponent();
    }

    private void initComponent(){
        data = Data.getInstance();
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

        searchCalorie = (Button)findViewById(R.id.buttonCalorie);
        searchCalorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spin_val.equalsIgnoreCase("Less than 100 KCal")) numCalorie = 1 ;
                else if (spin_val.equalsIgnoreCase("Between 100-200 KCal")) numCalorie = 2;
                else if (spin_val.equalsIgnoreCase("Between 200-300 KCal")) numCalorie = 3 ;
                else if (spin_val.equalsIgnoreCase("Between 300-400 KCal")) numCalorie = 4;
                else if (spin_val.equalsIgnoreCase("Between 400-500 KCal")) numCalorie = 5;
                else numCalorie = 6 ;
                Intent intent = new Intent(SearchCalorieActivity.this,ListMenuActivity.class);
                intent.putExtra("calorie",numCalorie);
                data.setIndex_search(3);
                startActivity(intent);
            }
        });
    }
}
