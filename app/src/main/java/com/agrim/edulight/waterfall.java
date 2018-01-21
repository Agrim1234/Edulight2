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

public class waterfall extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    int j=0;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changewaterfall=false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("WATERFALLS IN  INDIA");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.z%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.z%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(28,"waterfall");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.z++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(28);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.z++;}
        }});
        Picasso.with(getContext()).load(R.drawable.waterfall).fit().centerInside().into(im4);
        final String[] str2={"This is a list of notable waterfalls in India \n"+"\n"+"Kailasakona Falls" +
                "Rampachodavaram" +
                "Nemaligundla falls" +
                "Ethipothala Falls" +
                "Kapila Theertham" +
                "Talakona" +
                "Ubbalamdugu Falls"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(waterfall.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);}
    public Context getContext() {
        return context;
    }
}
