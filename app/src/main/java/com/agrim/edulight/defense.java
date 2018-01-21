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

public class defense extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changedefense=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("DEFENSE SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.h%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.h%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(9,"defense");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.h++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(9);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.h++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.defence).fit().centerInside().into(im4);
        final String[] str2={"The Defence industry of India is a strategically important sector in India. With strength" +
                " of over 1.3 million active personnel, it is world's 3rd largest military force and has the world's " +
                "largest volunteer army. The total budget sanctioned for the Indian military for the financial year " +
                "2015 is 2.47 trillion Indian rupees ($40.07 billion). The military budget of India is about 2.4% for" +
                " year 2015 of the total GDP as per World Bank statistics. The defence expenditure for Fisical year 2017-18 " +
                "allotted by Ministry of Finance is,excluding " +
                "pensions a sum of 2,74,114 crores but including 86,488 crores for Defence capital.\n"+"\n" +
                "India has been spending worth nearly $3.5 billion to boost its ageing Soviet era military equipment. It" +
                " has been pushing for greater indigenisation of the military industry as India imports around 70 per " +
                "cent of its defence hardware mainly from Russia, Japan Israel and United States." +
                "Although India’s track record as an arms exporter bears witness of its limited success recent defence " +
                "export contract are noteworthy. In March 2011 New Delhi agreed to sell its first indigenously designed" +
                " and built multi-role offshore patrol vessel (OPV) named Barracuda, to Mauritius. In March 2017, India" +
                " finalised a deal with Myanmar for sale of indigenously developed lightweight torpedoes worth USD 37.9 " +
                "million.Similar naval plateforms were sold to Srilanka and Vietnam as well.\n"+"\n"+
                "The production of Indian defence equipments prior to 2011 was completely in the hands of the Government" +
                " of India. The Government of India also opened up the Foreign direct investment to 49% from the existing" +
                " 26% and thereby increasing flow of funds from foreign countries. With the increase in FDI cap, private" +
                " players such as companies from many developed countries will also be attracted to the Indian defence" +
                " economy as they can have share in the Indian defence Companies."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(defense.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);}
    public Context getContext() {return context;}}
