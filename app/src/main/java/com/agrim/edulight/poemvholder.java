package com.agrim.edulight;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by agrim on 18/12/17.
 */

public class poemvholder extends RecyclerView.ViewHolder{
    public TextView tv8;
    public ImageView im3;
    public LinearLayout llayout3;
    public poemvholder(View itemView) {
        super(itemView);
        tv8=(TextView)itemView.findViewById(R.id.txt8);
        llayout3=(LinearLayout)itemView.findViewById(R.id.llayout3);
        im3=(ImageView)itemView.findViewById(R.id.img3);}}
