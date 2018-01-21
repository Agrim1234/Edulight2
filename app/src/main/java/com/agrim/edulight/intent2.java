package com.agrim.edulight;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.File;

/**
 * Created by agrim on 13/11/17.
 */

public class intent2 extends AppCompatActivity {
    TextView tv3;
    RecyclerView r1;
    Toolbar toolbar3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write);

        toolbar3= (Toolbar)findViewById(R.id.toolbar);
        r1 = (RecyclerView) findViewById(R.id.rv1);
        tv3 = (TextView) findViewById(R.id.txt3);
        toolbar3.setTitle("WRITING");
        toolbar3.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Comfortaa-Light.ttf");
        tv3.setTypeface(custom_font);
        contents2[] content2 = new contents2[3];
        content2[0] = new contents2();
        content2[0].head = "ARTICLE";
        content2[0].desc = "The love of writing";
        content2[1] = new contents2();
        content2[1].head = "POEM";
        content2[1].desc = "The joy of expressing";
        content2[2] = new contents2();
        content2[2].head = "FACTS";
        content2[2].desc = "Sharing Knowledge";

        adapter2 Adapter2 = new adapter2(content2,this);
        r1.setAdapter(Adapter2);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
