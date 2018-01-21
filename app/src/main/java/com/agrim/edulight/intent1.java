package com.agrim.edulight;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by agrim on 12/11/17.
 */

public class intent1 extends AppCompatActivity {
    RecyclerView r2;
    TextView tv4;
    Toolbar toolbar2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read);
        toolbar2 = (Toolbar)findViewById(R.id.toolbar);
        r2 = (RecyclerView)findViewById(R.id.rv2);
        tv4 =(TextView)findViewById(R.id.txt4);
        contents1[] content1 =new contents1[6];
        toolbar2.setTitle("READING");
        toolbar2.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/Comfortaa-Light.ttf");
        tv4.setTypeface(custom_font1);
        for (int i=0;i<6;i++)
        {content1[i] = new contents1();}
        adapter1 Adapter1= new adapter1(content1,this);
        r2.setAdapter(Adapter1);
        r2.setLayoutManager(new LinearLayoutManager(this));
    }
}
