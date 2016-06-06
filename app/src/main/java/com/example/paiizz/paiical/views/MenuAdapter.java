package com.example.paiizz.paiical.views;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.activity.ListConsumptionActivity;
import com.example.paiizz.paiical.activity.ListMenuActivity;
import com.example.paiizz.paiical.activity.MainActivity;
import com.example.paiizz.paiical.models.Cal;
import com.example.paiizz.paiical.models.Data;
import com.example.paiizz.paiical.models.Food;

import java.util.List;
import java.util.Random;

/**
 * Created by PaiizZ on 6/4/2016 AD.
 */
public class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {

    private List<Food> listFood;
    private String name;
    private String calorie;
    private String value;
    private String type;
    private ListMenuActivity listMenuActivity;

    public MenuAdapter(List<Food> objects, ListMenuActivity listMenuActivity) {
        listFood = objects;
        this.listMenuActivity = listMenuActivity;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        final View v = layoutInflater.inflate(R.layout.menu_cell, parent, false);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        v.setBackgroundColor(color);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, final int position) {
        name = listFood.get(position).getName();
        calorie = listFood.get(position).getCalorie();
        value = listFood.get(position).getValue();
        type = listFood.get(position).getType();
        holder.listmenuview.setText(name + "\n" + calorie + " KCal " + value + " " + type);

        holder.listmenuview.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                new AlertDialog.Builder(v.getContext())
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setTitle("Add to list consumption")
                        .setMessage("Are you sure to add this food?")
                        .setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Data.getInstance().getListEat().add(listFood.get(position));
                                Intent intent = new Intent(listMenuActivity, ListConsumptionActivity.class);
                                listMenuActivity.startActivity(intent);
                            }
                        })
                        .setPositiveButton("No", null)
                        .show();
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }
}


