package com.agrim.edulight;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by agrim on 13/12/17.
 */

public class adapter_articles extends RecyclerView.Adapter<adapter_articles.articlevholder> {
    public adapter_articles(contents3[] content21, Context context1){
        content1 = content21;
        context3 = context1;
        listener1 = null;}
    public interface OnItemClickListener{void onItemClick(contents1[] content1);}
    public contents3[] content1;
    private Context context3;
    private final adapter1.OnItemClickListener listener1;
    private String[] heads={"INDIAN RAILWAYS","AVIATION SECTOR","ELECTRONICS SECTOR","IT SECTOR","TEXTILE SECTOR","AUTOMOBILE SECTOR","INDUSTRIAL SECTOR","INDIAN CULTURE","INDIAN FOOD",
            "INDIAN RIVERS","INDIAN WATERFALLS","INDIAN MOUNTAINS","INDIAN CONSTITUTION","INDIAN POLITICAL PARTIES","EDUCATION SECTOR","AGRICULTURE SECTOR",
            "BANKING SECTOR","INDIN ARMY","DEFENSE SECTOR","FMCG SECTOR","LANGUAGES INDIA","TELECOM SECTOR","STARTUP CULTURE","SPORTS SECTOR","POWER SECTOR",
            "SPACE SECTOR","RELIGIONS IN INDIA"};
    private int[] i3={R.drawable.railways, R.drawable.aviation, R.drawable.electronics, R.drawable.it, R.drawable.textile, R.drawable.auto, R.drawable.industry,
            R.drawable.culture, R.drawable.spices, R.drawable.rivers, R.drawable.waterfall, R.drawable.mountains, R.drawable.constitution, R.drawable.parties,
            R.drawable.education, R.drawable.agriculture, R.drawable.banks, R.drawable.army, R.drawable.defence, R.drawable.fmcg, R.drawable.langauge,
            R.drawable.telecom, R.drawable.startup, R.drawable.sports, R.drawable.power, R.drawable.isro, R.drawable.religions};
    @Override
    public articlevholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater2=LayoutInflater.from(parent.getContext());
        View newView = layoutinflater2.inflate(R.layout.if_articles,parent,false);
        articlevholder viewholder2=new articlevholder(newView);
        return viewholder2;}
    @Override
    public void onBindViewHolder(final articlevholder holder, final int position) {
        holder.tv8.setText(heads[position]);
        Picasso.with(context3).load(i3[position]).fit().centerInside().into(holder.im3);
        holder.llayout3.setOnClickListener(new View.OnClickListener() {
            public Context getContext() {return context3;}
            @Override
            public void onClick(View view) {
                if (position==0)
                {Intent intent5=new Intent(getContext(),rail.class);
                    context3.startActivity(intent5);}
                else{if (position==1)
                {Intent intent6=new Intent(getContext(),aviation.class);
                    context3.startActivity(intent6);}
                else {if (position==2)
                {Intent intent7=new Intent(getContext(),electronics.class);
                    context3.startActivity(intent7);}
                else {if (position==3)
                {Intent intent8=new Intent(getContext(),it.class);
                    context3.startActivity(intent8);}
                else {if (position==4)
                {Intent intent9=new Intent(getContext(),textile.class);
                    context3.startActivity(intent9);}
                else {if (position==5)
                {Intent intent10=new Intent(getContext(),auto.class);
                    context3.startActivity(intent10);}
                else {if (position==6)
                {Intent intent11=new Intent(getContext(),industry.class);
                    context3.startActivity(intent11);}
                else {if (position==7)
                {Intent intent12=new Intent(getContext(),culture.class);
                    context3.startActivity(intent12);}
                else {if (position==8)
                {Intent intent13=new Intent(getContext(),food.class);
                    context3.startActivity(intent13);}
                else {if (position==9)
                {Intent intent14=new Intent(getContext(),rivers.class);
                    context3.startActivity(intent14);}
                else {if (position==10)
                {Intent intent15=new Intent(getContext(),waterfall.class);
                    context3.startActivity(intent15);}
                else {if (position==11)
                {Intent intent16=new Intent(getContext(),mountains.class);
                    context3.startActivity(intent16);}
                else {if (position==12)
                {Intent intent17=new Intent(getContext(),constitution.class);
                    context3.startActivity(intent17);}
                else {if (position==13)
                {Intent intent18=new Intent(getContext(),parties.class);
                    context3.startActivity(intent18);}
                else {if (position==14)
                {Intent intent19=new Intent(getContext(),education.class);
                    context3.startActivity(intent19);}
                else {if (position==15)
                {Intent intent20=new Intent(getContext(),agriculture.class);
                    context3.startActivity(intent20);}
                else {if (position==16)
                {Intent intent21=new Intent(getContext(),banks.class);
                    context3.startActivity(intent21);}
                else {if (position==17)
                {Intent intent22=new Intent(getContext(),army.class);
                    context3.startActivity(intent22);}
                else {if (position==18)
                {Intent intent23=new Intent(getContext(),defense.class);
                    context3.startActivity(intent23);}
                else {if (position==19)
                {Intent intent24=new Intent(getContext(),fmcg.class);
                    context3.startActivity(intent24);}
                else {if (position==20)
                {Intent intent25=new Intent(getContext(),language.class);
                    context3.startActivity(intent25);}
                else {if (position==21)
                {Intent intent26=new Intent(getContext(),telecom.class);
                    context3.startActivity(intent26);}
                else {if (position==22)
                {Intent intent27=new Intent(getContext(),startup.class);
                    context3.startActivity(intent27);}
                else {if (position==23)
                {Intent intent28=new Intent(getContext(),sports.class);
                    context3.startActivity(intent28);}
                else {if (position==24)
                {Intent intent29=new Intent(getContext(),power.class);
                    context3.startActivity(intent29);}
                else {if (position==25)
                {Intent intent30=new Intent(getContext(),isro.class);
                    context3.startActivity(intent30);}
                else {if (position==26)
                {Intent intent31=new Intent(getContext(),religion.class);
                    context3.startActivity(intent31);}}}}}}}}}}}}}}}}}}}}}}}}}}}}});}
    public void bind(final contents3[] content1, final AdapterView.OnItemClickListener listener1){}
    @Override
    public int getItemCount() {return content1.length;}
    class articlevholder extends RecyclerView.ViewHolder{
        public TextView tv8;
        public ImageView im3;
        public LinearLayout llayout3;
        public articlevholder(View itemView) {
            super(itemView);
            tv8=(TextView)itemView.findViewById(R.id.txt8);
            llayout3=(LinearLayout)itemView.findViewById(R.id.llayout3);
            im3=(ImageView)itemView.findViewById(R.id.img3);}}
}

