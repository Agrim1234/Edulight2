package com.agrim.edulight;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by agrim on 18/12/17.
 */

public class nature extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("I picked up a brush\n" +
                "and 80 bucks worth of paint\n" +
                "after a few tries, I know\n" +
                "that kind of artist I ain't\n" +
                "\n" +
                "So I will paint a picture\n" +
                "in your head\n" +
                "with the words\n" +
                "that I write instead\n" +
                "\n" +
                "I'll start with the sky...\n" +
                "use your imagination\n" +
                "blue, blue like\n" +
                "the first day of summer vacation\n" +
                "\n" +
                "Next is the grass\n" +
                "tall and green\n" +
                "the breeze makes it wave\n" +
                "and the sun makes it sheen\n" +
                "\n" +
                "Just beyond the grass\n" +
                "are the sand dunes\n" +
                "and just above that\n" +
                "a seagull looms\n" +
                "\n" +
                "The air is sweet\n" +
                "with the scent of the ocean\n" +
                "and the coconut in my suntan lotion\n" +
                "\n" +
                "The sun is warn\n" +
                "and bright\n" +
                "I have to squint to see\n" +
                "that little boy's kite\n" +
                "\n" +
                "I crest the dune\n" +
                "and there is the sea\n" +
                "the waves crash and foam\n" +
                "and softly roar at me\n" +
                "\n" +
                "I wade in, it is quite cold\n" +
                "now let's sign this in the sand\n" +
                "where the waves hit the shore\n" +
                "and sea meets the air and the land\n" +
                "\n" +
                "Now step back and look\n" +
                "what a wonderful view\n" +
                "and the canvas can go wherever\n" +
                "because it is in you\n");
        toolbar1.setTitle("NATURE POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
