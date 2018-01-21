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
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by agrim on 14/12/17.
 */

public class auto extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changeauto=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("AUTOMOBILE SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.c%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.c%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(4,"auto");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.c++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(4);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.c++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.auto).fit().centerInside().into(im4);
        final String[] str2={"The automotive industry in India is one of the largest in the world with an annual production" +
                " of 23.96 million vehicles in FY (fiscal year) 2015–16, following a growth of 2.57 per cent over the last" +
                " year. The automobile industry accounts for 7.1 per cent of the country's gross domestic product (GDP). " +
                "The Two Wheelers segment, with 81 per cent market share, is the leader of the Indian Automobile market, " +
                "owing to a growing middle class and a young population. Moreover, the growing interest of companies in " +
                "exploring the rural markets further aided the growth of the sector. The overall Passenger Vehicle (PV) " +
                "segment has 13 per cent market share.\n" +
                "\n" +
                "India is also a prominent auto exporter and has strong export growth expectations for the near future. In " +
                "FY 2014–15, automobile exports grew by 15 per cent over the last year. In addition, several initiatives by " +
                "the Government of India and the major automobile players in the Indian market are expected to make India a" +
                " leader in the Two Wheeler (2W) and Four Wheeler (4W) market in the world by 2020." +
                "The industry produced a total 14.25 million vehicles—including passenger vehicles (PV), " +
                "commercial vehicles (CV), and three- and two wheelers (3W and 2W)—in April–October 2015, as against 13.83 " +
                "in April–October 2014, registering a marginal growth of 3.07 per cent, year-to-year." +
                "The sales of PVs grew by 8.51 per cent in April–October 2015 over the same period in the previous year. The" +
                " overall CVs segment registered a growth of 8.02 per cent in April–October 2015 as compared to same period " +
                "last year. Medium- and heavy commercial vehicles (MCV and HCV) registered very strong growth of 32.3 per cent," +
                " while sales of light commercial vehicles (LCV) declined by 5.24 per cent during April–October 2015, year-to-year.\n" +
                "\n" +
                "In April–October 2015, overall automobile exports grew by 5.78 per cent. PVs, CVs, 3Ws, and 2Ws registered" +
                " growth of 6.34 per cent, 17.95 per cent, 18.59 per cent, and 3.22 per cent, respectively, in April–October" +
                " 2015, over April–October 2014." +
                "In order to keep up with the growing demand, several auto makers have started investing heavily in various " +
                "segments of the industry during the last few months. The industry has attracted foreign direct investment " +
                "(FDI) worth US$17.4 billion during the period April 2000 to June 2017, according to data released by " +
                "Department of Industrial Policy and Promotion (DIPP)." +
                "The Government of India encourages foreign investment in the automobile sector and allows 100 per cent FDI " +
                "under the automatic route."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(auto.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);}
    public Context getContext() {
        return context;}
}
