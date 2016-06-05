package com.example.paiizz.paiical.activity;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Data;
import com.example.paiizz.paiical.models.Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MenuActivity extends AppCompatActivity {

    private Button searchMenu,listConsumption,information,interestingInfo;
    private ImageView iconSearchMenu,iconConsumption,iconInformation,iconInteresting;
    private String[] split,nameFood;
    private Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initComponent();
    }

    private void initComponent(){
        data = Data.getInstance();
        split = new String[5];
        nameFood = new String[100];
        loadDataThaifood();
        loadDataSinglefood();
        loadDataInterfood();
        loadDataSnack();
        loadDataDessert();
        loadDataDrink();
        loadDataFriut();
        loadDataRestaurant();
        loadDataEtc();

        iconSearchMenu = (ImageView)findViewById(R.id.imageViewSearchMenu);
        iconSearchMenu.setImageResource(R.drawable.search);
        iconConsumption = (ImageView)findViewById(R.id.imageViewConsumption);
        iconConsumption.setImageResource(R.drawable.consumption);
        iconInformation = (ImageView)findViewById(R.id.imageViewInformation);
        iconInformation.setImageResource(R.drawable.information);
        iconInteresting = (ImageView)findViewById(R.id.imageViewInteresting);
        iconInteresting.setImageResource(R.drawable.interesting);

        searchMenu = (Button)findViewById(R.id.buttonSearchMenu);
        searchMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,SearchMenuActivity.class);
                startActivity(intent);
            }
        });

        listConsumption = (Button)findViewById(R.id.buttonConsumption);
        listConsumption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,ListConsumptionActivity.class);
                startActivity(intent);
            }
        });

        information = (Button)findViewById(R.id.buttonInformation);
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,InformationActivity.class);
                startActivity(intent);
            }
        });

        interestingInfo = (Button)findViewById(R.id.buttonInteresting);
        interestingInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, InterestingInfoActivity.class);
                startActivity(intent);
            }
        });
    }
    private void loadDataThaifood() {
        int i = 0;
        try {
            InputStream is = getAssets().open("thai food.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                nameFood[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        i = 0;
        try {
            InputStream is = getAssets().open("val thai.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Food food = new Food(nameFood[i], split[0], split[2], split[4]);
                data.getListThaifood().add(food);
                data.getListAllfood().add(food);
                addListCalorie(Integer.parseInt(split[0]), food);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadDataSinglefood() {
        int i = 0;
        try {
            InputStream is = getAssets().open("single dish meal.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                nameFood[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        i = 0;
        try {
            InputStream is = getAssets().open("val single.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Food food = new Food(nameFood[i], split[0], split[2], split[4]);
                data.getListSinglefood().add(food);
                data.getListAllfood().add(food);
                addListCalorie(Integer.parseInt(split[0]), food);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadDataInterfood() {

        int i = 0;
        try {
            InputStream is = getAssets().open("international food.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                nameFood[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        i = 0;
        try {
            InputStream is = getAssets().open("val inter.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Food food = new Food(nameFood[i], split[0], split[2], split[4]);
                data.getListInterfood().add(food);
                data.getListAllfood().add(food);
                addListCalorie(Integer.parseInt(split[0]), food);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadDataSnack() {

        int i = 0;
        try {
            InputStream is = getAssets().open("snack.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                nameFood[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        i = 0;
        try {
            InputStream is = getAssets().open("val snack.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Food food = new Food(nameFood[i], split[0], split[2], split[4]);
                data.getListSnack().add(food);
                data.getListAllfood().add(food);
                addListCalorie(Integer.parseInt(split[0]), food);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadDataFriut() {

        int i = 0;
        try {
            InputStream is = getAssets().open("friut.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                nameFood[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        i = 0;
        try {
            InputStream is = getAssets().open("val friut.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Food food = new Food(nameFood[i], split[0], split[2], split[4]);
                data.getListFriut().add(food);
                data.getListAllfood().add(food);
                addListCalorie(Integer.parseInt(split[0]), food);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadDataDessert() {

        int i = 0;
        try {
            InputStream is = getAssets().open("dessert.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                nameFood[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        i = 0;
        try {
            InputStream is = getAssets().open("val dessert.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Food food = new Food(nameFood[i], split[0], split[2], split[4]);
                data.getListDessert().add(food);
                data.getListAllfood().add(food);
                addListCalorie(Integer.parseInt(split[0]), food);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadDataDrink() {

        int i = 0;
        try {
            InputStream is = getAssets().open("drink.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                nameFood[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        i = 0;
        try {
            InputStream is = getAssets().open("val drink.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Food food = new Food(nameFood[i], split[0], split[2], split[4]);
                data.getListDrink().add(food);
                data.getListAllfood().add(food);
                addListCalorie(Integer.parseInt(split[0]), food);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadDataRestaurant() {

        int i = 0;
        try {
            InputStream is = getAssets().open("restaurant.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                nameFood[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        i = 0;
        try {
            InputStream is = getAssets().open("val restaurant.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Food food = new Food(nameFood[i], split[0], split[2], split[4]);
                data.getListRestaurant().add(food);
                data.getListAllfood().add(food);
                addListCalorie(Integer.parseInt(split[0]), food);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadDataEtc() {

        int i = 0;
        try {
            InputStream is = getAssets().open("etc.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                nameFood[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        i = 0;
        try {
            InputStream is = getAssets().open("val etc.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                split = line.split(" ");
                Food food = new Food(nameFood[i], split[0], split[2], split[4]);
                data.getListEtc().add(food);
                data.getListAllfood().add(food);
                addListCalorie(Integer.parseInt(split[0]), food);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addListCalorie(int i, Food food) {
        if (i < 100) {
            data.getListLess100().add(food);
        } else if (i >= 100 && i < 200) {
            data.getListBetween100to200().add(food);
        } else if (i >= 200 && i < 300) {
            data.getListBetween200to300().add(food);
        } else if (i >= 300 && i < 400) {
            data.getListBetween300to400().add(food);
        } else if (i >= 400 && i < 500) {
            data.getListBetween400to500().add(food);
        } else {
            data.getListMore500().add(food);
        }
    }


}
