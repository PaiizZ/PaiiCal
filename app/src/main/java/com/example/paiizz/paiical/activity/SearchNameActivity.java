package com.example.paiizz.paiical.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;
import com.example.paiizz.paiical.models.Food;

public class SearchNameActivity extends AppCompatActivity {
    Data data;
    Button buttonSearchName;
    EditText searchName;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_name);
        initComponent();
    }

    private void initComponent() {
        data = Data.getInstance();
        searchName = (EditText) findViewById(R.id.editTextSearchName);
        buttonSearchName = (Button) findViewById(R.id.buttonSearchInName);
        buttonSearchName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = searchName.getText().toString();
                data.removeDateInListSearchName();
                for (Food allfood : data.getListAllfood()) {
                    if (allfood.getName().substring(0, name.length()).equalsIgnoreCase(name)) {

                        data.getListSearchName().add(allfood);
                    }
                }
                Intent intent = new Intent(SearchNameActivity.this, ListMenuActivity.class);
                data.setIndex_search(2);
                startActivity(intent);
            }
        });
    }

}
