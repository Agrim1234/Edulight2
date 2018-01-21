package com.agrim.edulight;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by agrim on 20/11/17.
 */

public class adapter2 extends RecyclerView.Adapter<writevholder> {
    public contents2[] content2;
    private Context context;
    private final int[] i1={
        R.drawable.article,
        R.drawable.poem,
        R.drawable.fact
    };
    public adapter2(contents2[] content21,Context context1){
        content2 = content21;
        context=context1;
    }
    public adapter2(contents2[] content2) {
    }
    @Override
    public writevholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View newView = layoutInflater.inflate(R.layout.itemformat2,parent,false);
        writevholder viewHolder2=new writevholder(newView);
        return viewHolder2;
    }
    @Override
    public void onBindViewHolder(writevholder holder, final int position) {
        holder.tv1.setText(content2[position].head);
        holder.tv2.setText(content2[position].desc);
        holder.llayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position==0)
                {Intent intent14=new Intent(getContext(),articles2.class);
                context.startActivity(intent14);}
                else{if (position==1)
                {Intent intent15=new Intent(getContext(),poems2.class);
                context.startActivity(intent15);}
                else{if (position==2)
                {Intent intent16=new Intent(getContext(),facts2.class);
                context.startActivity(intent16);}}}
            }
        });
        Picasso.with(context).load(i1[position]).fit().centerInside().into(holder.im1);
    }
    private int dpToPx(int i) {
        return i;
    }
    @Override
    public int getItemCount() {
        return content2.length;
    }
    public Context getContext() {
        return context;
    }
}
