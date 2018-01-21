package com.agrim.edulight;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by agrim on 27/12/17.
 */

public class your_profile extends AppCompatActivity{
    Toolbar toolbar1;
    ViewPager viewpager;
    TabLayout tablayout;
    viewpager_adapter view2=new viewpager_adapter(getSupportFragmentManager());
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_profile);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tablayout=(TabLayout)findViewById(R.id.tablayout);
        viewpager=(ViewPager)findViewById(R.id.viewpager);
        toolbar1.setTitle("YOUR PROFILE");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        view2.addFragments(new likedarticles(),"LIKED ARTICLES");
        view2.addFragments(new likedpoems(),"LIKED POEMS");
        viewpager.setAdapter(view2);
        tablayout.setupWithViewPager(viewpager);
    }
}
