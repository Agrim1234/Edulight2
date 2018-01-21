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

public class culture extends AppCompatActivity{
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changeculture=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("CULTURES OF INDIA");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.g%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.g%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(8,"culture");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.g++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(8);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.g++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.culture).fit().centerInside().into(im4);
        final String[] str2={"The culture of India refers collectively to the thousands of distinct and unique cultures" +
                " of all religions and communities present in India. India's languages, religions, dance, music, " +
                "architecture, food, and customs differs from place to place within the country. The Indian culture," +
                " often labeled as an amalgamation of several cultures, spans across the Indian subcontinent and " +
                "has been influenced by a history that is several millenniums old. Many elements of India's " +
                "diverse cultures, such as Indian religions, Indian philosophy and Indian cuisine, have a profound" +
                " impact across the world.\n"+"\n"+
                "India has 29 states with different culture and civilizations and one of the most populated countries in" +
                " the world. The Indian culture, often labeled as an amalgamation of several various cultures, spans " +
                "across the Indian subcontinent and has been influenced and shaped by a history that is several thousand" +
                " years old. Throughout the history of India, Indian culture has been heavily influenced by Dharmic" +
                " religions. They have been credited with shaping much of Indian philosophy, literature, architecture," +
                " art and music. Greater India was the historical extent of Indian culture beyond the Indian subcontinent." +
                " This particularly concerns the spread of Hinduism, Buddhism, architecture, administration and writing " +
                "system from India to other parts of Asia through the Silk Road by the travellers and maritime traders " +
                "during the early centuries of the Common Era.\n"+"\n"+
                "India is the birthplace of Hinduism, Buddhism, Jainism, Sikhism, and other religions. Collectively known" +
                " as Indian religions. Indian religions are a major form of world religions along with Abrahamic ones." +
                " Today, Hinduism and Buddhism are the world's third and fourth-largest religions respectively, with over" +
                " 2 billion followers altogether, and possibly as many as 2.5 or 2.6 billion followers." +
                " Followers of Indian religions – Hindus, Sikhs, Jains and Buddhists make up around 80–82% " +
                "population of India."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(culture.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }

    public Context getContext() {
        return context;
    }
}
