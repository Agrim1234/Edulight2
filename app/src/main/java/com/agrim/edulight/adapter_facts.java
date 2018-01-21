package com.agrim.edulight;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by agrim on 22/12/17.
 */

public class adapter_facts extends RecyclerView.Adapter<adapter_facts.factsvholder>{


    public adapter_facts(contents4[] content21, Context context1){
        content1 = content21;
        context3 = context1;}
    private String[] facts={"Approximately 40,000 Americans are injured by toilets each year.","The Vatican City is the country that drinks the most wine per " +
            "capita at 74 liters per citizen per year.","Ketchup was sold in the 1830s as medicine.","“Almost” is the longest word in English with all the letters in " +
            "alphabetical order.","It is impossible to sneeze with your eyes open.","No piece of square paper can be folded more than 7 times in half.","McDonalds calls" +
            " frequent buyers of their food “heavy users.”"," You burn more calories sleeping than you do watching television.","A single cloud can weight more than 1 " +
            "million pounds.","Coca-Cola would be green if coloring wasn’t added to it.","You cannot snore and dream at the same time.","10% of the World’s population " +
            "is left handed.","It is physically impossible for pigs to look up into the sky.","9 out of 10 Americans are deficient in Potassium.","About half of all " +
            "Americans are on a diet on any given day.","About 150 people per year are killed by coconuts.","More people are allergic to cow’s milk than any other food.",
            "Coconut water can be used as blood plasma.","It is considered good luck in Japan when a sumo wrestler makes your baby cry.","Donald duck comics were banned" +
            " from Finland because he doesn’t wear pants."};
    public contents4[] content1;
    private Context context3;
    @Override
    public factsvholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater2=LayoutInflater.from(parent.getContext());
        View newView = layoutinflater2.inflate(R.layout.if_facts,parent,false);
        factsvholder viewholder2=new factsvholder(newView);
        return viewholder2;
    }

    @Override
    public void onBindViewHolder(factsvholder holder, int position) {
        holder.tv8.setText(facts[position]);
    }

    @Override
    public int getItemCount() {
        return content1.length;
    }

    class factsvholder extends RecyclerView.ViewHolder{
        public TextView tv8;
        public LinearLayout llayout3;
        public factsvholder(View itemView) {
            super(itemView);
            tv8=(TextView)itemView.findViewById(R.id.txt8);
            llayout3=(LinearLayout)itemView.findViewById(R.id.llayout3);
        }
    }

}
