package com.agrim.edulight;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by agrim on 21/12/17.
 */

public class havefun_adapter extends RecyclerView.Adapter<havefun_adapter.havefun_vh>{
    public havefun_adapter(contents3[] content21, Context context1){
        content1 = content21;
        context3 = context1;
        listener1 = null;
    }

    public interface OnItemClickListener{void onItemClick(contents1[] content1);}
    public contents3[] content1;
    private Context context3;
    private final adapter1.OnItemClickListener listener1;
    private String[] havefun={"Do some facebook","Play Hangman" };
    private int[] havefun1={R.drawable.fb,R.drawable.h};
    @Override
    public havefun_vh onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater layoutinflater2=LayoutInflater.from(parent.getContext());
        View newView = layoutinflater2.inflate(R.layout.if_havefun,parent,false);
        havefun_vh viewholder2=new havefun_vh(newView);
        return viewholder2;
    }
    @Override
    public void onBindViewHolder(havefun_vh holder, final int position) {
        holder.tv8.setText(havefun[position]);
        Picasso.with(context3).load(havefun1[position]).fit().centerInside().into(holder.im3);
        holder.llayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position==1)
                {Intent intent=context3.getPackageManager().getLaunchIntentForPackage("com.agrim.hangman");
                context3.startActivity(intent);}
                else{if (position==0)
                {context3.startActivity(openfacebook(context3));}}
            }
        });
    }
    @Override
    public int getItemCount() {return content1.length;}
    class havefun_vh extends RecyclerView.ViewHolder {
        public TextView tv8;
        public ImageView im3;
        public LinearLayout llayout3;
        public havefun_vh(View itemView) {
            super(itemView);
            tv8=(TextView)itemView.findViewById(R.id.txt8);
            llayout3=(LinearLayout)itemView.findViewById(R.id.llayout3);
            im3=(ImageView)itemView.findViewById(R.id.img3);}
    }
    public static Intent openfacebook(Context context){
        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana",0);
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/100001395736103"));
            return intent;
        }catch (Exception e){
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/agrim.agarwal.56"));
            return intent;
        }
    }
}
