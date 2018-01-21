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

public class poem1 extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("Somehow, \n" +
                "Forward, and headlong\n" +
                "I knew it was day again\n" +
                "\n" +
                "There was a shift in the dark mutterings of the Devil,\n" +
                "Who now refused to sleep as I refused to sing,\n" +
                "Almost an anticipation in his voice,\n" +
                "As if he needed this newfound attention,\n" +
                "And as he waited I wondered how quickly\n" +
                "He sought to leap into my dreams\n" +
                "The nights I recalled of late were billowed in sick reservoirs of resentment,\n" +
                "Hatred, cruel agony and, as always,\n" +
                "Plot overlapping plot\n" +
                "\n" +
                "Yet, there was, \n" +
                "In every vagrant heart, a beat,\n" +
                "A thrumming of movement, \n" +
                "A strum of bass, and a shrill of strings, stings, screams\n" +
                "Voices moaning in strange harmonic rhythms\n" +
                "It was very much alive—\n" +
                "A hell much exultant in the night’s hour\n" +
                "And as day broke, it seemed as if hell,\n" +
                "And all of its inhabitants therein, \n" +
                "Mourned\n" +
                "\n" +
                "The Prison of Plot silenced at my awakening,\n" +
                "And even the Devil ceased his mutterings to gaze at me\n" +
                "I lifted my body out of the pool of warm water, \n" +
                "Studying his fixed gaze\n" +
                "\n" +
                "“Why do you immerse yourself in such holy waters,” He began,\n" +
                "His voice gravelly and gruff,\n" +
                "“When you could easily, like I, \n" +
                "Rise above it?”\n" +
                "\n" +
                "I stepped onto the mucky shore, \n" +
                "My eyes locked into his own\n" +
                "I stretched the exhaustion away,\n" +
                "Brushed aside the fear, the anxiety and the dry tears\n" +
                "And I listened to his heart—\n" +
                "A thumping, begrudging, trudging beat\n" +
                "\n" +
                "“There is no existence warmer,” I sang,\n" +
                "“Than the co-existence of man and truth,\n" +
                "And in this truth, the Spirit resides,\n" +
                "Rising above foolish prides,\n" +
                "Boiling over lies,\n" +
                "Overflowing in grace\n" +
                "Leaving evil with nothing to trace,\n" +
                "And in these whispers,\n" +
                "Do I know my place,\n" +
                "And where it falls silent,\n" +
                "Do I see your face…”\n" +
                "\n" +
                "For a heavy moment he only stared,\n" +
                "Then he tore his eyes from me,\n" +
                "His expression, crude, impoverished \n" +
                "He leaned against the walls,\n" +
                "His claws scratching the cracked stones\n" +
                "His palms pressed upon them tightly\n" +
                "He was stuck in some personal inferno,\n" +
                "And with ravenous reverie, he turned his head toward the pool\n" +
                "A thick envy pouring into his eyes \n" +
                "He watched the flowing waters tickle the shores\n" +
                "He knew as much as any if he were to intrude,\n" +
                "Like oil, he would be merely an exclusion\n" +
                "Once again,\n" +
                "Wholly black against the mocking transparency,\n" +
                "And hence wholly separated\n" +
                " \n" +
                "So instead he turned again and watched me, sourly,\n" +
                "As I cupped water into my hands, \n" +
                "The moisture of its touch giving me life,\n" +
                "I splashed it upon my face, my eyes opening,\n" +
                "I took my time near the pool, \n" +
                "Caring for my frame, caring for every part of me,\n" +
                "Remembering the peace that the light has given\n" +
                "Till, cleansed, my garments dried\n" +
                "In the still airs of what prison callously offered");
        toolbar1.setTitle("POEM 1");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
