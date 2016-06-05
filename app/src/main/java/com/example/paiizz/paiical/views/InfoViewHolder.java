package com.example.paiizz.paiical.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.paiizz.paiical.R;

/**
 * Created by PaiizZ on 6/5/2016 AD.
 */
public class InfoViewHolder extends RecyclerView.ViewHolder {
    TextView listinfoview;

    InfoViewHolder(View itemView) {
        super(itemView);
        listinfoview = (TextView) itemView.findViewById(R.id.info_card);
    }
}
