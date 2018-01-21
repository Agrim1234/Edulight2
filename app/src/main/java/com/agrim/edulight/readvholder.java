package com.agrim.edulight;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by agrim on 22/11/17.
 */

public class readvholder extends RecyclerView.ViewHolder {

    public TextView tv5,tv6;
    public ImageView im2;
    public LinearLayout llayout1;

    public readvholder(View itemView) {
        super(itemView);
        tv5=(TextView)itemView.findViewById(R.id.txt5);
        tv6=(TextView)itemView.findViewById(R.id.txt6);
        llayout1=(LinearLayout)itemView.findViewById(R.id.llayout1);
        im2=(ImageView)itemView.findViewById(R.id.img1);
    }
}
