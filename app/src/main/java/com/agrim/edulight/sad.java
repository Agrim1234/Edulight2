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

public class sad extends AppCompatActivity {

    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("I look in the mirror and the person I see\n" +
                "Is someone who used to be me.\n" +
                "That person was strong and healthy, rarely ill,\n" +
                "And her energy was endless; she never sat still.\n" +
                "\n" +
                "Then one day she disappeared behind my face,\n" +
                "And a stranger took her place.\n" +
                "I'm living in a body I no longer know,\n" +
                "And a pain from within me has begun to grow.\n" +
                "\n" +
                "At night, when others sleep, I lie awake,\n" +
                "Feeling my body tremble and shake.\n" +
                "My limbs feel stiff and my muscles ache.\n" +
                "I feel like a rag doll about to break.\n" +
                "\n" +
                "\"What's wrong with me?\" asks a voice from within.\n" +
                "\"And whose body is this, under my skin?\n" +
                "Surely this isn't going to be the new me?\"\n" +
                "Then a Higher Voice whispers, \"Just accept it...it's meant to be.\"\n" +
                "\n" +
                "I searched for answers...a diagnosis I needed.\n" +
                "A long 9 months later I found a doctor who heeded.\n" +
                "A condition was confirmed; I wasn't losing my mind.\n" +
                "Hypochondria it wasn't...Parkinson's was the find.\n" +
                "\n" +
                "I have to keep going; this isn't the end.\n" +
                "Just a rough, rocky road with a very big bend.\n" +
                "I know God will help me; He never lets me down.\n" +
                "With His hand in mine, there's no need to frown.\n" );
        toolbar1.setTitle("SAD POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
