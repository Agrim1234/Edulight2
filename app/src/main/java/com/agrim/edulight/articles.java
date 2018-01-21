package com.agrim.edulight;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by agrim on 10/12/17.
 */

public class articles extends AppCompatActivity{
    RecyclerView r3;
    Toolbar toolbar6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articles);
        toolbar6 = (Toolbar)findViewById(R.id.toolbar);
        r3 = (RecyclerView)findViewById(R.id.rv2);
        contents3[] content1 =new contents3[27];
        toolbar6.setTitle("ARTICLES");
        toolbar6.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar6);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        for (int i=0;i<27;i++)
        {content1[i]=new contents3();}
        adapter_articles Adapter1= new adapter_articles(content1,this);
        r3.setAdapter(Adapter1);
        r3.setLayoutManager(new LinearLayoutManager(this));}}
