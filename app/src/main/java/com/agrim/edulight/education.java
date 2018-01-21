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

public class education extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changeeducation=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("EDUCATION SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.i%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.i%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(10,"eeducation");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.i++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(10);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.i++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.education).fit().centerInside().into(im4);
        final String[] str2={"Education in India is provided by the public sector as well as the private sector, with " +
                "control and funding coming from three levels: central, state and local. Under various articles of the " +
                "Indian Constitution, free and compulsory education is provided as a fundamental right to children between" +
                " the ages of 6 and 14. The ratio of public schools to private schools in India is 7:5." +
                "India has made progress in terms of increasing the primary education attendance rate and expanding literacy" +
                " to approximately three-quarters of the population in the 7–10 age group, by 2011. India's improved " +
                "education system is often cited as one of the main contributors to its economic development.\n"+"\n"+
                "At the primary and secondary level, India has a large private school system complementing the government" +
                " run schools, with 29% of students receiving private education in the 6 to 14 age group. Certain post" +
                "-secondary technical schools are also private. The private education market in India had a revenue of " +
                "US$450 million in 2008, but is projected to be a US$40 billion market." +
                "As per the Annual Status of Education Report (ASER) 2012, 96.5% of all rural children between the ages of" +
                " 6-14 were enrolled in school. This is the fourth annual survey to report enrollment above 96%. Another " +
                "report from 2013 stated that there were 22.9 crore students enrolled in different accredited urban and " +
                "rural schools of India, from Class I to XII, representing an increase of 23 lakh students over 2002 total " +
                "enrollment, and a 19% increase in girl's enrollment\n"+"\n"+
                "In India's higher education system, a significant number of seats are reserved under affirmative action " +
                "policies for the historically disadvantaged Scheduled Castes and Scheduled Tribes and Other Backward " +
                "Classes. In universities, colleges, and similar institutions affiliated to the federal government, " +
                "there is a maximum 50% of reservations applicable to these disadvantaged groups, at the state level " +
                "it can vary. Maharashtra had 73% reservation in 2014, which is the highest percentage of reservations in " +
                "India."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(education.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);}
    public Context getContext() {return context;}}
