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

public class telecom extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changetelecom=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("TELECOM SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.w%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.w%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(26,"telecom");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.w++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(26);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.w++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.telecom).fit().centerInside().into(im4);
        final String[] str2={"India's telecommunication network is the second largest in the world by number of telephone" +
                " users (both fixed and mobile phone) with 1.206 billion subscribers as on 30 September 2017. It has " +
                "one of the lowest call tariffs in the world enabled by mega telecom operators and hyper-competition among" +
                " them. India has the world's second-largest Internet user-base. As on 30 September 2017, there were " +
                "324.89 million internet subscribers in the country.\n" +
                "\n" +
                "Major sectors of the Indian telecommunication industry are telephone, internet and television broadcast " +
                "Industry in the country which is in an ongoing process of transforming into next generation network, " +
                "employs an extensive system of modern network elements such as digital telephone exchanges, mobile " +
                "switching centres, media gateways and signalling gateways at the core, interconnected by a wide variety " +
                "of transmission systems using fibre-optics or Microwave radio relay networks. The access network, which " +
                "connects the subscriber to the core, is highly diversified with different copper-pair, optic-fibre and " +
                "wireless technologies. DTH, a relatively new broadcasting technology has attained significant popularity" +
                " in the Television segment. The introduction of private FM has given a fillip to the radio broadcasting" +
                " in India. Telecommunication in India has greatly been supported by the INSAT system of the country, " +
                "one of the largest domestic satellite systems in the world. India possesses a diversified communications" +
                " system, which links all parts of the country by telephone, Internet, radio, television and satellite.\n" +
                "\n" +
                "Indian telecom industry underwent a high pace of market liberalisation and growth since the 1990s and now" +
                " has become the world's most competitive and one of the fastest growing telecom markets. The " +
                "Industry has grown over twenty times in just ten years, from under 37 million subscribers in the year " +
                "2001 to over 846 million subscribers in the year 2011. India has the world's second-largest mobile " +
                "phone user base with over 1183.04 million users as of September 2017. It has the world's second-" +
                "largest Internet user-base with over 324 million as of September 2017."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(telecom.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }

    public Context getContext() {
        return context;
    }
}
