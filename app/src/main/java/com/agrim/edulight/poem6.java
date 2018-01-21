package com.agrim.edulight;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.AbsSavedState;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by agrim on 19/12/17.
 */

public class poem6 extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);

        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("It is not so much WHERE you live,\n" +
                "As HOW, and WHY, and WHEN you live,\n" +
                "That answers in the affirmative,\n" +
                "Or maybe in the negative,\n" +
                "The question Are you fit to live?\n" +
                "\n" +
                "It is not so much WHERE you live,\n" +
                "As HOW you live, and whether good\n" +
                "Flows from you through your neighborhood\n" +
                ". And WHY you live, and whether you\n" +
                "Aim high and noblest ends pursue,\n" +
                "And keep Life brimming full and true.\n" +
                "\n" +
                "And WHEN you live, and whether Time\n" +
                "Is at its nadir or its prime,\n" +
                "And whether you descend or climb.\n" +
                "It is not so much WHERE you live,\n" +
                "As whether while you live you live\n" +
                "And to the world your highest give,\n" +
                "And so make answer positive\n" +
                "That you are truly fit to live.\n");
        toolbar1.setTitle("POEM 6");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
