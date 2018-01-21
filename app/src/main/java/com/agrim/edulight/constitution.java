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

public class constitution extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changeconstitution=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("CONSTITUTION OF INDIA");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.f%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.f%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(7,"constitution");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.f++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(7);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.f++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.constitution).fit().centerInside().into(im4);
        final String[] str2={"The Constitution of India is the supreme law of India. It lays down the framework" +
                " defining fundamental political principles, establishes the structure, procedures, powers and " +
                "duties of government institutions and sets out fundamental rights, directive principles and the" +
                " duties of citizens. It is the longest written constitution of any sovereign country in the " +
                "world. B. R. Ambedkar, the chairman of the Drafting Committee, is widely considered" +
                " to be its chief architect." +
                "It imparts constitutional supremacy and not parliamentary supremacy, as it is not created by the " +
                "Parliament but, by a constituent assembly, and adopted by its people, with a declaration in its " +
                "preamble. Parliament cannot override the constitution.\n"+"\n"+
                "It was adopted by the Constituent Assembly on 26 November 1949, and came into effect on 26 " +
                "January 1950. With its adoption, the Union of India became the modern and contemporary Republic" +
                " of India replacing the Government of India Act, 1935 as the country's fundamental governing " +
                "document. To ensure constitutional autochthony, the framers of the constitution repealed the" +
                " prior Acts of the British Parliament via Article 395 of the constitution. India celebrates" +
                " its coming into force on 26 January each year, as Republic Day.\n" +
                "\n" +
                "It declares India a sovereign, socialist, secular, democratic republic, assuring its citizens of " +
                "justice, equality, and liberty, and endeavours to promote fraternity among them." +
                "The Indian constitution is the world's longest. At its commencement, it had 395 articles" +
                " in 22 parts and 8 schedules. It is made up of approximately 145,000 words, making it the second" +
                " largest active constitution in the world. In its current form (September 2012), it has a" +
                " preamble, 25 parts with 448 articles, 12 schedules, 5 appendices" +
                " and 101 amendments, the latest of which came into force on 8 September 2016."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(constitution.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);

    }

    public Context getContext() {
        return context;
    }}
