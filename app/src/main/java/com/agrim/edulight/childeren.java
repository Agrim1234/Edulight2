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

public class childeren extends AppCompatActivity {

    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("“I cannot go to school today,\"\n" +
                "Said little Peggy Ann McKay.\n" +
                "“I have the measles and the mumps,\n" +
                "A gash, a rash and purple bumps.\n" +
                "My mouth is wet, my throat is dry,\n" +
                "I’m going blind in my right eye.\n" +
                "My tonsils are as big as rocks,\n" +
                "I’ve counted sixteen chicken pox\n" +
                "And there’s one more--that’s seventeen,\n" +
                "And don’t you think my face looks green?\n" +
                "My leg is cut--my eyes are blue--\n" +
                "It might be instamatic flu.\n" +
                "I cough and sneeze and gasp and choke,\n" +
                "I’m sure that my left leg is broke--\n" +
                "My hip hurts when I move my chin,\n" +
                "My belly button’s caving in,\n" +
                "My back is wrenched, my ankle’s sprained,\n" +
                "My ‘pendix pains each time it rains.\n" +
                "My nose is cold, my toes are numb.\n" +
                "I have a sliver in my thumb.\n" +
                "My neck is stiff, my voice is weak,\n" +
                "I hardly whisper when I speak.\n" +
                "My tongue is filling up my mouth,\n" +
                "I think my hair is falling out.\n" +
                "My elbow’s bent, my spine ain’t straight,\n" +
                "My temperature is one-o-eight.\n" +
                "My brain is shrunk, I cannot hear,\n" +
                "There is a hole inside my ear.\n" +
                "I have a hangnail, and my heart is--what?\n" +
                "What’s that? What’s that you say?\n" +
                "You say today is. . .Saturday?\n" +
                "G’bye, I’m going out to play!”\n");
        toolbar1.setTitle("CHILDEREN POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
