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

public class banks extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changebank=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("BANKING SECTOR");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.e%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.e%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(6,"banks");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.e++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(6);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.e++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.banks).fit().centerInside().into(im4);
        final String[] str2={"Banking in India, in the modern sense, originated in the last decades of the 18th century. Among the first banks were the Bank of" +
                " Hindustan, which was established in 1770 and liquidated in 1829–32; and the General Bank of India, established in 1786 but failed in 1791." +
                "The largest bank, and the oldest still in existence, is the State Bank of India (S.B.I). It originated as the Bank of Calcutta in June 1806. In " +
                "1809, it was renamed as the Bank of Bengal. This was one of the three banks funded by a presidency government, the other two were the Bank of Bombay" +
                " in 1840 and the Bank of Madras in 1843. The three banks were merged in 1921 to form the Imperial Bank of India, which upon India's independence, " +
                "became the State Bank of India in 1955. For many years the presidency banks had acted as quasi-central banks, as did their successors, until the Reserve" +
                " Bank of India was established in 1935, under the Reserve Bank of India Act, 1934.\n" +"\n"+
                "In 1960, the State Banks of India was given control of eight state-associated banks under the State Bank of India (Subsidiary Banks) Act, 1959. These are" +
                " now called its associate banks. In 1969 the Indian government nationalised 14 major private banks, one of the big bank was Bank of India. In 1980, 6" +
                " more private banks were nationalised. These nationalised banks are the majority of lenders in the Indian economy. They dominate the banking sector" +
                " because of their large size and widespread networks.\n" +"\n"+
                "The Indian banking sector is broadly classified into scheduled and non-scheduled banks. The scheduled banks are those included under the 2nd Schedule" +
                " of the Reserve Bank of India Act, 1934. The scheduled banks are further classified into: nationalised banks; State Bank of India and its associates;" +
                " Regional Rural Banks (RRBs); foreign banks; and other Indian private sector banks. The term commercial banks refers to both scheduled and non-scheduled" +
                " commercial banks regulated under the Banking Regulation Act, 1949."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(banks.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);}
    public Context getContext() {
        return context;}}
