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

public class parties extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changeparty=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("POLITICAL PARTIES IN INDIA");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.q%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.q%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(19,"party");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.q++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(19);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.q++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.parties).fit().centerInside().into(im4);
        final String[] str2={"India has a multi-party system with recognition accorded to national and state and District level parties. The status is reviewed " +
                "periodically by the Election Commission of India.an Other political parties that wish to contest local, state or national elections are required to " +
                "be registered by the Election Commission of India (ECI). Registered parties are upgraded as recognized national or state level parties based upon " +
                "objective criteria. A recognized party enjoys privileges like reserved party symbol, free broadcast time on state run television and radio, " +
                "consultation in setting of election dates and giving inputs in setting electoral rules and regulations. \n" +
                "\n" +
                "This listing is according to the Indian general election, 2014 and Legislative Assembly elections and any party aspiring to State or National party" +
                " status must fulfil at least one of the concerned criteria. In addition, national and state parties have to fulfill these conditions for all " +
                "subsequent Lok Sabha or State elections, or else they lose their status. As per latest publication from Election Commission(13th Dec 2016 and 5 " +
                "May 2017), the total number of parties registered was 1841, with 7 national, 49 state and 1785 unrecognised parties.\n" +
                "\n" +
                "All registered parties contesting elections need to choose a symbol from a list of available symbols offered by the EC. All 29 states of the country" +
                " along with the union territories of Puducherry and the National Capital Territory of Delhi have elected governments unless President's rule is " +
                "imposed under certain conditions"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(parties.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);}
    public Context getContext() {
        return context;
    }
}
