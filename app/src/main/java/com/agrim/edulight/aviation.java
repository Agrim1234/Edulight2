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

public class aviation extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(aviation.this);
    public static int y;
    public static Boolean changeaviation=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("AVIATION SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.d%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.d%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(5,"aviation");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.d++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(5);
                    vari.y=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.d++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.aviation).fit().centerInside().into(im4);
        final  String[] str2={"Aviation in India can broadly be divided into military and civil aviation. According to the International Air Transport Association (IATA), India" +
                " is the fastest-growing aviation market. Bangalore is the aviation manufacturing hub in India and constitutes of about 65% of the share of manufacturing." +
                "The Government of India announced its draft National Civil Aviation Policy on 30" + " October 2015.\n" +"\n"+
                "Civil aviation in India traces its origin back to 1911, when the first commercial civil aviation flight took off from Allahabad for Naini."+
                "Air India is India's national flag carrier after merging with Indian (airline) in 2011" + "and plays a major role in connecting India with the rest " +
                "of the world." + " IndiGo, Jet Airways, Air India, Spicejet and GoAir are the major " + "carriers in order of their market share." +
                "These airlines connect more than 80 cities across India and also operate overseas routes after the liberalisation of Indian aviation." +
                " Several other foreign airlines connect Indian cities with other major cities across the globe.\n" + " \n" +
                "The Indian Air Force, Indian Naval Air Arm and Army Aviation Corps are the air arms of the Indian armed forces. The Indian Air Force is the" +
                " world's 4th largest air force with primary responsibility for securing Indian airspace and to conduct aerial warfare during a conflict. It" +
                " was officially established on 8 October 1932 as an auxiliary air force of the British Empire, and the prefix Royal was added in 1945 in recognition" +
                " of its services during World War II. Following the Indian Independence Act 1947, the new states of India and Pakistan became independent from the United Kingdom, " +
                "the Royal Indian Air Force served the Dominion of India, with the prefix being dropped when India became a republic in 1950. Since independence, the IAF has" +
                " been involved in four wars with neighbouring Pakistan and one with the People's Republic of China. Other major operations undertaken by the IAF" +
                " include Operation Vijay, Operation Meghdoot, Operation Cactus and Operation Poomalai. Apart from conflicts in the subcontinent, the IAF has been an active" +
                " participant in United Nations peacekeeping missions."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(aviation.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);}
    public Context getContext() {
        return context;}}
