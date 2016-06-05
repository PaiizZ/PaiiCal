package com.example.paiizz.paiical.views;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.paiizz.paiical.R;
import com.example.paiizz.paiical.models.Food;

import java.util.List;
import java.util.Random;

/**
 * Created by PaiizZ on 6/5/2016 AD.
 */
public class InfoAdapter extends RecyclerView.Adapter<InfoViewHolder>{
        private List<String> listInfo;
        private String name ;


        public InfoAdapter(List<String> objects) {
                listInfo = objects;
        }

        @Override
        public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                final LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
                final View v = layoutInflater.inflate(R.layout.interesting_cell, parent, false);
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                v.setBackgroundColor(color);
                return new InfoViewHolder(v);
        }

        @Override
        public void onBindViewHolder(InfoViewHolder holder, int position) {
                name = listInfo.get(position).toString();
                holder.listinfoview.setText(name);
        }

        @Override
        public int getItemCount() {
                return listInfo.size();
        }
}
