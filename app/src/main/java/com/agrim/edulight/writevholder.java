package com.agrim.edulight;

import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by agrim on 20/11/17.
 */

public class writevholder extends RecyclerView.ViewHolder {

    public TextView tv1,tv2;
    public ImageView im1;
    public LinearLayout llayout2;

    public writevholder(View itemView) {
        super(itemView);
        tv1 = (TextView)itemView.findViewById(R.id.txt);
        tv2 = (TextView)itemView.findViewById(R.id.txt1);
        im1 = (ImageView)itemView.findViewById(R.id.img);
        llayout2=(LinearLayout)itemView.findViewById(R.id.llayout2);
    }
}
