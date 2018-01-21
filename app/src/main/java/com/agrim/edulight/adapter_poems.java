package com.agrim.edulight;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.squareup.picasso.Picasso;

/**
 * Created by agrim on 18/12/17.
 */

public class adapter_poems extends RecyclerView.Adapter<poemvholder> {
    public adapter_poems(contents3[] content21, Context context1){
        content2= content21;
        context3 = context1;
        listener1 = null;}

    public interface OnItemClickListener{void onItemClick(contents1[] content1);}
    public contents3[] content2;
    private Context context3;
    private final adapter1.OnItemClickListener listener1;
    private String[] heads={"MOTIVATIONAL POEMS","FRIENDSHIP POEM","FUNNY POEM","LIFE POEM","LOVE POEM","SAD POEM","CHILDEREN","NATURE POEM","DEATH POEM",
            "FAMOUS POEM","SPIRITUAL POEM","TEEN POEM","SAD LOVE POEM","FAMILY POEM","SHORT POEM","SONNET POEM"};
    private int[] i3={
            R.drawable.motivation, R.drawable.friendship, R.drawable.funny, R.drawable.life, R.drawable.love, R.drawable.sad, R.drawable.childeren, R.drawable.nature,
            R.drawable.death, R.drawable.famous, R.drawable.spiritual, R.drawable.teen, R.drawable.sadlove, R.drawable.family, R.drawable.short1, R.drawable.sonnet};
    @Override
    public poemvholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater2=LayoutInflater.from(parent.getContext());
        View newView = layoutinflater2.inflate(R.layout.if_poems,parent,false);
        poemvholder viewholder2=new poemvholder(newView);
        return viewholder2;
    }
    @Override
    public void onBindViewHolder(poemvholder holder, final int position) {
        holder.tv8.setText(heads[position]);
        Picasso.with(context3).load(i3[position]).fit().centerInside().into(holder.im3);
        holder.llayout3.setOnClickListener(new View.OnClickListener() {
            public Context getContext() {return context3;}
            @Override
            public void onClick(View view) {
                if (position==0)
                {Intent intent5=new Intent(getContext(),motivation.class);
                    context3.startActivity(intent5);}
                else{if (position==1)
                {Intent intent6=new Intent(getContext(),friendship.class);
                    context3.startActivity(intent6);}
                else {if (position==2)
                {Intent intent7=new Intent(getContext(),funny.class);
                    context3.startActivity(intent7);}
                else {if (position==3)
                {Intent intent8=new Intent(getContext(),life.class);
                    context3.startActivity(intent8);}
                else {if (position==4)
                {Intent intent9=new Intent(getContext(),love.class);
                    context3.startActivity(intent9);}
                else {if (position==5)
                {Intent intent10=new Intent(getContext(),sad.class);
                    context3.startActivity(intent10);}
                else {if (position==6)
                {Intent intent11=new Intent(getContext(),childeren.class);
                    context3.startActivity(intent11);}
                else {if (position==7)
                {Intent intent12=new Intent(getContext(),nature.class);
                    context3.startActivity(intent12);}
                else {if (position==8)
                {Intent intent13=new Intent(getContext(),death.class);
                    context3.startActivity(intent13);}
                else {if (position==9)
                {Intent intent14=new Intent(getContext(),famous.class);
                    context3.startActivity(intent14);}
                else {if (position==10)
                {Intent intent15=new Intent(getContext(),spiritual.class);
                    context3.startActivity(intent15);}
                else {if (position==11)
                {Intent intent16=new Intent(getContext(),teen.class);
                    context3.startActivity(intent16);}
                else {if (position==12)
                {Intent intent17=new Intent(getContext(),sadlove.class);
                    context3.startActivity(intent17);}
                else {if (position==13)
                {Intent intent18=new Intent(getContext(),family.class);
                    context3.startActivity(intent18);}
                else {if (position==14)
                {Intent intent19=new Intent(getContext(),short1.class);
                    context3.startActivity(intent19);}
                else {if (position==15)
                {Intent intent20=new Intent(getContext(),sonnet.class);
                    context3.startActivity(intent20);}}}}}}}}}}}}}}}}}});}

    public void bind(final contents3[] content2, final AdapterView.OnItemClickListener listener1){}
    @Override
    public int getItemCount() {return content2.length;}}

