package com.agrim.edulight;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
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

public class agriculture extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this);
    public static Boolean changeagri=false;
    public static int y=0;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.a%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("AGRICULTURE SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.a%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(2,"agri");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.a++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(2);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.a++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.agriculture).fit().centerInside().into(im4);

        final String[] str2={" Today, India ranks second worldwide in farm output. Agriculture and allied sectors like forestry and fisheries accounted for 13.7% of " +
                "the GDP (gross domestic product) in 2013, about 50% of the workforce. The economic contribution of agriculture to India's GDP is steadily" +
                " declining with the country's broad-based economic growth. Still, agriculture is demographically the broadest economic sector and plays a significant" +
                " role in the overall socio-economic fabric of India. India exported $38 billion worth of agricultural products in 2013, making it the seventh largest" +
                " agricultural exporter worldwide and the sixth largest net exporter. Most of its agriculture exports serve developing and least developed nations.\n"+"\n"+
                "As per the 2010 FAO world agriculture statistics, India is the world's largest producer of many fresh fruits and vegetables, milk, major spices, " +
                "select fibrous crops such as jute, staples such as millets and castor oil seed. India is the second largest producer of wheat and rice, the " +
                "world's major food staples.\n" +"\n"+
                "India is the world's second or third largest producer of several dry fruits, agriculture-based textile raw materials, roots and tuber crops, pulses," +
                " farmed fish, eggs, coconut, sugarcane and numerous vegetables. India ranked in the world's five largest producers of over 80% of " +
                "agricultural produce items, including many cash crops such as coffee and cotton, in 2010. India is one of the world's five largest producers of " +
                "livestock and poultry meat, with one of the fastest growth rates, as of 2011."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(agriculture.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }
    public Context getContext() {
        return context;
    }}
