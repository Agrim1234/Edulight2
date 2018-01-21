package com.agrim.edulight;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by agrim on 19/12/17.
 */

public class poem4 extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);

        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("A bucket list,\n" +
                "We all should record.\n" +
                "To give us goals,\n" +
                "To work towards.\n" +
                "\n" +
                "Make a list,\n" +
                "From one to twenty.\n" +
                "You can have more,\n" +
                "If you want to have plenty.\n" +
                "\n" +
                "You're bucket list,\n" +
                "Will hold your dreams.\n" +
                "That one day,\n" +
                "Won't be a dream.\n" +
                "\n" +
                "Setting goals\n" +
                "Is good to do,\n" +
                "To make your dreams\n" +
                "Come true for you.\n");
        toolbar1.setTitle("POEM 4");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
