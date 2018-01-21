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

public class industry extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changeindustry=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("INDUSTRIAL SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.l%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.l%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(14,"industry");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.l++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(14);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.l++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.industry).fit().centerInside().into(im4);
        final String[] str2={"Manufacturing has emerged as one of the high growth sectors in India. Prime Minister of India," +
                " Mr Narendra Modi, had launched the ‘Make in India’ program to place India on the world map as a " +
                "manufacturing hub and give global recognition to the Indian economy. India is expected to become the fifth" +
                " largest manufacturing country in the world by the end of year 2020" +
                "The Gross Value Added (GVA) at basic constant (2011-12) prices from the manufacturing sector in India grew" +
                " 7.9 per cent year-on-year in 2016-17, as per the 2nd provisional estimate of annual national income " +
                "published by the Government of India. Under the Make in India initiative, the Government of India aims to" +
                " increase the share of the manufacturing sector to the gross domestic product (GDP) to 25 per cent by 2022," +
                " from 16 per cent, and to create 100 million new jobs by 2022. Business conditions in the Indian " +
                "manufacturing sector continue to remain positive.\n"+"\n" +
                " With the help of Make in India drive, India is on the path of becoming the hub for hi-tech manufacturing " +
                "as global giants such as GE, Siemens, HTC, Toshiba, and Boeing have either set up or are in process of " +
                "setting up manufacturing plants in India, attracted by India's market of more than a billion consumers and" +
                " increasing purchasing power."+
                "Cumulative Foreign Direct Investment (FDI) in India’s manufacturing sector reached US$ 70.51 billion by" +
                " June 2017.\n" +"\n"+
                "India has become one of the most attractive destinations for investments in the manufacturing sector." +
                " In a bid to push the 'Make in India' initiative to the global level, Mr Narendra Modi, Prime Minister of " +
                "India, pitched India as a manufacturing destination at the World International Fair in Germany's Hannover " +
                "in 2015. Mr Modi showcased India as a business friendly destination to attract foreign businesses to invest" +
                " and manufacture in the country." +
                "The Government of India has taken several initiatives to promote a healthy environment for the growth of manufacturing sector in the country."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(industry.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }

    public Context getContext() {
        return context;
    }
    }

