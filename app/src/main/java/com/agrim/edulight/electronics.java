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

public class electronics extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changeelectronic=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);

        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("ELECTRONICS SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.j%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.j%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(11,"electronics");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.j++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(11);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.j++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.electronics).fit().centerInside().into(im4);
        final String[] str2={"The Indian electronics industry is poised for significant growth thanks to enormous demand in" +
                " the domestic market and an ongoing shift to building an end-to-end manufacturing ecosystem. This growth " +
                "is being encouraged both by government policies, incentives and by international investment. Its key and " +
                "most resource-intensive segment, the semiconductor industry has substantial potential for growth since " +
                "demand is growing briskly. Semiconductors are required by a large number of industries, including " +
                "telecommunications, information technology (IT), IT enabled Services (ITeS), Office Automation (OA), " +
                "industrial machinery and automation, medical electronics, automobile, engineering, power and solar " +
                "photovoltaic, defense and aerospace, consumer electronics, and appliances. According to a NOVONOUS report," +
                " a steady and significant spurt in the semiconductor industry will increase the domestic market size " +
                "fivefold during 2013-2020.\n"+"\n"+
                "India's electronics market, one of the largest in the world in terms of consumption, is predicted to grow " +
                "to approximately US$400 billion by 2020 from $69.6 billion in 2012, largely led by up-surge in demand, " +
                "growing at a projected compound annual growth rate of close to 25% over the period." +
                "In 2013-14, 65℅ of demand for electronic products was met through importing. According to a Frost & " +
                "Sullivan-IESA data analysis, five high priority product categories together account for 60% of the overall" +
                " electronic consumption. In descending order, these are mobile phones (38.85%), flat panel display " +
                "television (7.91%), notebooks (5.54%) and desktops (4.39℅). India’s appliance and consumer electronics" +
                " market, which was worth US$9.7 billion in 2014, is predicted to grow at a compound annual rate of 13.4%," +
                " and reach $20.6 billion by 2020. Within consumer electronics segment, set top boxes are seen as the " +
                "fastest growing category, with Y-o-Y growth predicted to be 28.8℅ between 2014-2020, followed by the " +
                "television category at 20%, refrigerators at 10%, washing machines at 8-9% and air-conditioners at " +
                "around 6-7%.\n"+"\n"+
                "The total domestic productions of electronic goods during 2012-13, 2013–14 and 2014–15 were INR 1,64,172 " +
                "crore, INR 1,80,454 crore and INR 1,90,366 crore, respectively. The electronics hardware manufacturing " +
                "industry in India is projected to produce electronic goods worth $104 billion by 2020 from US$32.462 " +
                "billion in 2013–14. In FY13, India's share in global electronics hardware production was 1.6%. The " +
                "communication and broadcasting equipment segment constituted 31℅, thereby having a dominant share in the" +
                " total production of electronic goods in India in FY13, followed by consumer electronics at 23℅. Of " +
                "the smartphones shipped in the country in the April–June quarter of 2015, 24.8% were either manufactured " +
                "or assembled in India, up from 19.9% in the previous quarter. Of the 220 million mobile sets " +
                "shipped in India in 2015-16,around 110 million mobile phones have been either made or assembled in India " +
                "in the last year, compared to 60 million earlier. Mobile handset manufacturing in 2015-16 grew by 185℅ " +
                "in value terms to ₹54,000 crore from ₹19,000 crore in the previous year. According to an ASSOCHAM-EY" +
                " study titled Turning the Make in India dream into a reality for electronics and hardware industry , " +
                "the Indian electronics and hardware industry was expected to grow at a CAGR of 13%–16% in 2013–18 to " +
                "reach" +
                " $112–130 billion by 2018 from a 2016 level of $75 billion."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(electronics.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);}
    public Context getContext() {return context;}}

