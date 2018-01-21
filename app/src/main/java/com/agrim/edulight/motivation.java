package com.agrim.edulight;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

/**
 * Created by agrim on 18/12/17.
 */

public class motivation extends AppCompatActivity {
    RecyclerView r3;
    Toolbar toolbar6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motivation);
        toolbar6 = (Toolbar) findViewById(R.id.toolbar);
        r3 = (RecyclerView) findViewById(R.id.rv2);
        contents4[] content2 = new contents4[6];
        toolbar6.setTitle("MOTIVATIONAL POEMS");
        toolbar6.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar6);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        content2[0] = new contents4();
        content2[0].head = "POEM 1";
        content2[1] = new contents4();
        content2[1].head = "POEM 2";
        content2[2] = new contents4();
        content2[2].head = "POEM 3";
        content2[3] = new contents4();
        content2[3].head = "POEM 4";
        content2[4] = new contents4();
        content2[4].head = "POEM 5";
        content2[5] = new contents4();
        content2[5].head = "POEM 6";
        motivation_adapter Adapter1 = new motivation_adapter(content2, this);
        r3.setAdapter(Adapter1);
        r3.setLayoutManager(new GridLayoutManager(this,2));
    }
}
