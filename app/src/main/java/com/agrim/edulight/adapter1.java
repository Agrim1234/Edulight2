package com.agrim.edulight;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.squareup.picasso.Picasso;

import static java.security.AccessController.getContext;

/**
 * Created by agrim on 22/11/17.
 */
public class adapter1 extends RecyclerView.Adapter<readvholder> {
    public adapter1(contents1[] content21, Context context1){
        content1 = content21;
        context2 = context1;
        listener = null;
    }
    public interface OnItemClickListener{
        void onItemClick(contents1[] content1);
    }
    public contents1[] content1;
    private Context context2;
    private final OnItemClickListener listener;
    private int[] i2={R.drawable.article1, R.drawable.poem1, R.drawable.fact, R.drawable.top10, R.drawable.country, R.drawable.cgame
    };
    private String[] heads={"ARTICLES","POEMS","INTERESTING FACTS","TOP10","DIFFERENT COUNTRIES","COMPUTER GAMING"};
    private String[] descs={"Simply Learning","Just Sharing","For Killing Boredom","The Best","Know Your Country","For Action Lovers"};
    @Override
    public readvholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater = LayoutInflater.from(parent.getContext());
        View newView = layoutinflater.inflate(R.layout.itemformat1,parent,false);
        readvholder viewholder1=new readvholder(newView);
        return viewholder1;
    }
    @Override
    public void onBindViewHolder(readvholder holder, final int position) {
        holder.tv5.setText(heads[position]);
        holder.tv6.setText(descs[position]);
        holder.llayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0)
                {Intent intent5=new Intent(getContext(),articles.class);
                    context2.startActivity(intent5);}
                else {if(position==1)
                {Intent intent6=new Intent(getContext(),poems.class);
                context2.startActivity(intent6);}
                else {if (position==2)
                {Intent intent7=new Intent(getContext(),facts.class);
                context2.startActivity(intent7);}
                else {if (position==3)
                {Intent intent8=new Intent(getContext(),topten.class);
                context2.startActivity(intent8);}
                else {if (position==4)
                {Intent intent9=new Intent(getContext(),countries.class);
                context2.startActivity(intent9);}
                else {if (position==5)
                {Intent intent10=new Intent(getContext(),gaming.class);
                context2.startActivity(intent10);}}}}}}
            }
        });
        Picasso.with(context2).load(i2[position]).fit().centerInside().into(holder.im2);
    }
    @Override
    public int getItemCount() {
       return content1.length;
    }
    public Context getContext() {
        return context2;
    }
    public void bind(final contents1[] content1, final AdapterView.OnItemClickListener listener){
        };}