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

public class textile extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    int j=0;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changetextile=false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("TEXTILE SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.x%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.x%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(27,"textile");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.x++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(27);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                     vari.x++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.textile).fit().centerInside().into(im4);
        final String[] str2={"The textile industry in India traditionally, after agriculture, is the only industry that has" +
                " generated huge employment for both skilled and unskilled labour in textiles. The textile industry" +
                " continues to be the second-largest employment generating sector in India. It offers direct employment" +
                " to over 35 million in the country. The share of textiles in total exports was 11.04% during " +
                "April–July 2010, as per the Ministry of Textiles. During 2009–2010, the Indian textile industry was " +
                "pegged at US$55 billion, 64% of which services domestic demand. In 2010, there were 2,500 textile" +
                " weaving factories and 4,135 textile finishing factories in all of India. According to AT Kearney’s" +
                " ‘Retail Apparel Index’, India was ranked as the fourth most promising market for apparel retailers in " +
                "2009.\n" +
                "\n" +
                "India is first in global jute production and shares 63% of the global textile and garment market. India" +
                " is second in global textile manufacturing and also second in silk and cotton production. 100% FDI is" +
                " allowed via automatic route in textile sector. Rieter, Trutzschler, Soktas, Zambiati, Bilsar, Monti, " +
                "CMT, E-land, Nisshinbo, Marks & Spencer, Zara, Promod, Benetton, and Levi’s are some of the foreign" +
                " textile companies invested or working in India."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(textile.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }

    public Context getContext() {
        return context;
    }
}
