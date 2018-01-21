package com.agrim.edulight;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by agrim on 14/12/17.
 */

public class rail extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changerail=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("INDIAN RAILWAYS");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.r%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.r%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(21,"rail");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.r++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(21);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.r++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.railways).fit().centerInside().into(im4);
        final String[] str2={"Indian Railways (reporting mark IR) is a state-owned national railway system of India. Operated by the Ministry of Railways, in fiscal " +
                "2015-2016, IR carried 8.107 billion passengers (more than 22 million passengers per day), transported 1.101 billion tons of freight, and had 7,216" +
                " stations. It is the fourth largest railway network in the world by size, comprising 119,630 kilometres (74,330 mi) of total track and 92,081 " +
                "km (57,216 mi) of running track over a route of 66,687 km (41,437 mi) at the end of 2015-16. Forty-five percent of its routes are electrified, " +
                "using entirely 25 kV AC electric traction. The track is mostly broad gauge with small stretches of metre and narrow gauge track;37% of the tracks are" +
                " double or multiple tracked.\n" +"\n"+
                "IR operates both long distance and suburban rail systems. IR ran on average 13,313 passenger trains daily in 2015-16. The trains have a five-digit " +
                "numbering system. Mail or express trains, the most common types, run at an average speed of 50.9 km/hr. As of the end of 2015-16, IR's rolling stock " +
                "comprised over 254,006 freight wagons, 70,241 passenger coaches and 11,122 locomotives (39 powered by steam, 5,869 by diesel fuel and 5,214 " +
                "by electricity). It also owns locomotive and coach production facilities at several places in India. IR is the world's eighth biggest employer and had" +
                " 1.33143 million employees at the end of 2015-16. In 2015–2016, IR had revenues of ₹1.683 trillion (US$26 billion), consisting of ₹1.069 trillion " +
                "(US$17 billion) freight earnings and ₹442.83 billion (US$6.9 billion) passengers earnings. It had an operating ratio of 90.5% in 2015-16.\n" +"\n"+
                "The total track length of network is 119,640 km (74,340 mi) while the total route length of the network is 66,687 km (41,437 mi). There are 28,371 " +
                "km (17,629 mi) of double or multiple line routes. Track sections are rated for speeds ranging from 80 to 220 km/h (50 to 137 mph), though trains " +
                "don't really clock speeds of 200 km/h. Maximum speed attained by passenger trains is 177 km/h-180 km/h (110 mph)."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(rail.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);}
    public Context getContext() {
        return context;
    }
}
