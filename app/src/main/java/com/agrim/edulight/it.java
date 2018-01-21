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

public class it extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changeit=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("IT SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.n%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.n%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(16,"it");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.n++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(16);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.n++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.it).fit().centerInside().into(im4);
        final String[] str2={"Information technology in India is an industry consisting of two major components:" +
                "IT services and business process outsourcing (BPO). The sector has increased its contribution" +
                " to India's GDP from 1.2% in 1998 to 7.5% in 2012. According to NASSCOM, the sector aggregated" +
                " revenues of US$160 billion in 2017, with export revenue standing at US$99 billion and " +
                "domestic revenue at US$48 billion, growing by over 13%. USA accounts for more than 60 per cent of" +
                " Indian IT exports.\n" +"\n"+
                "In the contemporary world economy India is the second-largest exporter of IT. Exports dominate the" +
                " Indian IT industry and constitute about 77% of the industry's total revenue. However, the domestic" +
                " market is also significant, with robust revenue growth. The industry’s share of total Indian" +
                " exports (merchandise plus services) increased from less than 4% in FY1998 to about 25% in FY2012." +
                " The technologically-inclined services sector in India accounts for 40% of the country's GDP and" +
                " 30% of export earnings as of 2006, while employing only 25% of its workforce, according to " +
                "Sharma (2006). According to Gartner, the Top Five Indian IT Services Providers are Tata " +
                "Consultancy Services, Infosys, Cognizant, Wipro, and HCL Technologies.\n" +"\n"+
                "The Indian IT market currently focuses on providing low-cost solutions in the services business" +
                " of global IT. The presence of Indian companies in the product development business of global" +
                " IT is very meager, however, this number is slowly on the rise. The other prominent trend is " +
                "that IT jobs, once confined to Bangalore, are slowly starting to experience a geographical " +
                "diffusion into other cities like Chennai, Hyderabad and Pune. According to Google estimates," +
                " the Indian community of developers will be the largest in the world by 2018."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(it.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }
    public Context getContext() {
        return context;
    }
    }

