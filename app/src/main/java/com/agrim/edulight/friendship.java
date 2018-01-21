package com.agrim.edulight;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by agrim on 18/12/17.
 */

public class friendship extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("I have the greatest friend on earth\n" +
                "Sisters by God but not by birth\n" +
                "I owe her a lot for all she has done for me\n" +
                "Without her in my life I am not sure where I'd be\n" +
                "We will be best friends forever until we die\n" +
                "We have certain jokes that no one would understand but her and I\n" +
                "Together we share our life story\n" +
                "We look for good in others glory\n" +
                "She is amazing every single day\n" +
                "I admire and look up to her in every way\n" +
                "She understands me and I don't have to explain\n" +
                "She brings her sunshine to the rain\n" +
                "Someone sent by god to do great things\n" +
                "One of heaven's angels with no visible wings\n" +
                "If you ever meet Amanda then you will see\n" +
                "Why she is the definition of the greatest friend to me.\n" +
                "Amanda, thanks for always being there for me\n" +
                "You have shown me just how best friends should be!\n" );
        toolbar1.setTitle("FRIENDSHIP POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
