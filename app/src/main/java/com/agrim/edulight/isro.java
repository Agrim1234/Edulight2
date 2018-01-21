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

public class isro extends AppCompatActivity{
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changeisro=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);

        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("SPACE SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.m%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.m%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(15,"isro");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.m++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(15);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.m++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.isro).fit().centerInside().into(im4);
        final String[] str2={"The Department of Space (DoS) is an Indian government department responsible for " +
                "administration of the Indian space program. It manages several agencies and institutes related to" +
                " space exploration and space technologies.\n" +
                "\n" +
                "The Indian space program under the DoS aims to promote the development and application of space science" +
                " and technology for the socio-economic benefit of the country. It includes two major satellite systems, " +
                "INSAT for communication, television broadcasting and meteorological services, and Indian Remote Sensing " +
                "Satellites (IRS) system for resources monitoring and management. It has also developed two satellite " +
                "launch vehicles, Polar Satellite Launch Vehicle (PSLV) and Geosynchronous Satellite Launch Vehicle (GSLV)," +
                " to place IRS and INSAT class satellites in orbit."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(isro.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }

    public Context getContext() {
        return context;
    }

    }

