package com.agrim.edulight;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by agrim on 18/12/17.
 */

public class have_fun extends AppCompatActivity{
    RecyclerView r3;
    Toolbar toolbar1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.have_fun);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        r3 = (RecyclerView)findViewById(R.id.rv2);
        contents3[] content2 = new contents3[2];
        toolbar1.setTitle("HAVE FUN");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        for (int i=0;i<2;i++)
        {content2[i]=new contents3();}
        havefun_adapter Adapter1= new havefun_adapter(content2,this);
        r3.setAdapter(Adapter1);
        r3.setLayoutManager(new LinearLayoutManager(this));
    }
}
