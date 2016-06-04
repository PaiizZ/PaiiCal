package com.example.paiizz.paiical.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.paiizz.paiical.R;

/**
 * Created by PaiizZ on 6/4/2016 AD.
 */
public class MenuViewHolder extends RecyclerView.ViewHolder {

    TextView listmenuview;

    MenuViewHolder(View itemView) {
        super(itemView);
        listmenuview = (TextView) itemView.findViewById(R.id.menu_card);
    }
}

