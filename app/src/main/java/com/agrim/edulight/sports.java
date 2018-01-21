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

public class sports extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changesport=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("SPORTS IN INDIA");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.u%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.u%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(24,"sport");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                vari.u++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(24);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.u++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.sports).fit().centerInside().into(im4);
        final String[] str2={"India is home to a diverse population playing many different sports across the country. Football is a popular sport in some of the Indian states. India has won all the Kabaddi World Cups to date. The country has won eight Olympic gold medals in field hockey. However, cricket is the most popular sport in India. Kabaddi, an indigenous sport is popular in rural India. Several games originated in India including chess, snooker and other regional games. India has won medals in badminton, kabaddi, hockey and many other sports and disciplines.\n" +
                "\n" +
                "Recently, different forms of martial arts have also gained a lot of prominence in India. Mixed Martial Arts (MMA) and Boxing were the two sports to look out for in the year 2017, with both the sports being introduced in a league format for the first time in the country.\n" +
                "\n" +
                "On 19th January 2017, the first season of the Super Fight League (SFL) was launched in India and the league made the country witness one of most intense and engaging fights in the history of MMA.The league was spread across a period of 37 days and was highly appreciated by all the stakeholders of the league. The promoter of the league Bill Dosanjh is working towards creating a global sports phenomenon with the first mixed martial arts world cup." +
                "On 7th July 2017, Bill Dosanjh created history by becoming the only sports promoter to launch 2 leagues within a span of 1 year, Super Boxing League (SBL) was launched and made India witness its first boxing based sports league. The league delivered one of the highest performance indicators and was one of the most successful leagues in India within the first year of its launch. Bill Dosanjh hopes to create the first global boxing brand with Super Boxing League (SBL)."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(sports.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }

    public Context getContext() {
        return context;
    }
}
