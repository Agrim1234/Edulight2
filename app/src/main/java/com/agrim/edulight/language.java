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

public class language extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changelanguage=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("LANGUAGES IN INDIA");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.o%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.o%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(17,"language");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.o++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(17);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.o++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.langauge).fit().centerInside().into(im4);
        final String[] str2={"Languages spoken in India belong to several language families, the major ones being the " +
                "Indo-Aryan languages spoken by 75% of Indians and the Dravidian languages spoken by 20% of Indians." +
                " Other languages belong to the Austroasiatic, Sino-Tibetan, Tai-Kadai, and a few other minor language " +
                "families and isolates. India (780) has the world's second highest number of languages, after " +
                "Papua New Guinea (839).\n" +
                "\n" +
                "Article 343 of the Indian constitution states that the official language of the Union government " +
                "shall become Hindi in Devanagari script instead of the extant English, but is superseded by English " +
                "subsequently too as mentioned in section 3 of the same constitutional article that is put to effect " +
                "by The Official Languages Act, 1963. The form of numerals to be used for the official purposes of " +
                "the Union were supposed to become international form of Indian numerals consequently apart from numerals " +
                "in English language. Despite the misconceptions, Hindi is not the national language of India. The " +
                "Constitution of India does not give any language the status of national language.\n" +
                "\n" +
                "English was legislated to be reduced to the status of a subsidiary official language after fifteen " +
                "years. But this provision of the constitution was negated by a provision in Section 3, of the same Article " +
                "343 that gave primacy to The Official Languages Act, 1963. The Eighth Schedule of the Indian " +
                "Constitution lists 22 languages, which have been referred to as scheduled languages and given " +
                "recognition, status and official encouragement. In addition, the Government of India has awarded the " +
                "distinction of classical language to Tamil, Sanskrit, Kannada, Telugu, Malayalam and Odia."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(language.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }

    public Context getContext() {
        return context;
    }
}
