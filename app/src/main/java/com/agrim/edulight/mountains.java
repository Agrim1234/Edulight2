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

public class mountains extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changemountain=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("MOUNTAINS IN INDIA");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.p%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.p%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(18,"mountain");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.p++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(18);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.p++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.mountains).fit().centerInside().into(im4);
        final String[] str2={"India is home to some of the tallest and gallant mountain ranges in the world. These ranges come with some of the most attractive sceneries" +
                " and ecosystems in the world. The diversified altitudes and ranges feature a wide range of flora and fauna. You will get to see tropical and subtropical" +
                " forests at the foothills of the Himalayan Mountain Ranges. The views of the snowy mountains in Himachal Pradesh and Kashmir will simply leave you " +
                "spellbound.\n"
                +"\n"+"Mountain ranges such as Western Ghats, Himalaya, Aravalli, Eastern Ghats, Nilgiri, Shivalik, Vindhya, and Satpura mountain ranges make a " +
                "significant contribution towards maintaining the beauty of geographical features, landscape, and balanced environment. Covered with dense and big " +
                "forests, accommodating a wide variety of plants and animals, the mountains of India are prominent tourist attractions in the country."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(mountains.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }

    public Context getContext() {
        return context;
    }
}
