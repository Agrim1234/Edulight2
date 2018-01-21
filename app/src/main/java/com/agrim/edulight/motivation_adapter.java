package com.agrim.edulight;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by agrim on 18/12/17.
 */

public class motivation_adapter extends RecyclerView.Adapter<motivationvholder> {
    public motivation_adapter(contents4[] content21, Context context1){
        content1 = content21;
        context3 = context1;
        listener1 = null;}
    public interface OnItemClickListener{void onItemClick(contents1[] content1);}
    public contents4[] content1;
    private Context context3;
    private final adapter1.OnItemClickListener listener1;
    @Override
    public motivationvholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater2=LayoutInflater.from(parent.getContext());
        View newView = layoutinflater2.inflate(R.layout.if_motivation,parent,false);
        motivationvholder viewholder2=new motivationvholder(newView);
        return viewholder2;
    }
    @Override
    public void onBindViewHolder(motivationvholder holder, final int position) {
        holder.tv8.setText(content1[position].head);
        holder.llayout3.setOnClickListener(new View.OnClickListener() {
            public Context getContext() {return context3;}
            @Override
            public void onClick(View view) {
                if (position==0)
                {context3.startActivity(new Intent(getContext(),poem1.class));}
                else {if (position==1)
                {context3.startActivity(new Intent(getContext(),poem2.class));}
                else {if (position==2)
                {context3.startActivity(new Intent(getContext(),poem3.class));}
                else {if (position==3)
                {context3.startActivity(new Intent(getContext(),poem4.class));}
                else {if (position==4)
                {context3.startActivity(new Intent(getContext(),poem5.class));}
                else {if (position==5)
                {context3.startActivity(new Intent(getContext(),poem6.class));}
                }}}}}}});}
    @Override
    public int getItemCount() {
        return content1.length;
    }
}
