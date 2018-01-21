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

public class sadlove extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("He wrote her a song, but it never got finished\n" +
                "They both fell in love, but it was soon diminished\n" +
                "She sits on his bed and cries in his lap\n" +
                "He cries back at her, knowing they can't go back.\n" +
                "\n" +
                "Hours go by and neither one can accept\n" +
                "That by letting go they are doing what's best\n" +
                "At the end of the day, comes the part which he fears\n" +
                "To let her go without shedding a tear\n" +
                "\n" +
                "Never again will he kiss her goodbye\n" +
                "And just that thought makes him start to cry\n" +
                "Now he'll finish that song, and he'll write it today\n" +
                "This is the start and here's what it says\n" +
                "\n" +
                "\"You are my siren, you drew me in\n" +
                "With a voice like an angel and the softest skin\n" +
                "Your eyes shine like diamonds and your smile melts my heart\n" +
                "I know that nothing could tear us apart\"\n" +
                "\n" +
                "That's what he wrote and let me just say\n" +
                "That he'd never do anything to throw that away\n" +
                "But that's not how it works; this world's bitter and harsh\n" +
                "And then something happened, which drew them apart\n" +
                "\n" +
                "An old boyfriend showed up and that's when he knew\n" +
                "That her feelings for him were not shiny and new\n" +
                "This person left her and crushed her heart\n" +
                "But she had loved him since the very start.\n" +
                "\n" +
                "When our boy came along she saw a way\n" +
                "To end her pain and make it all go away\n" +
                "But by loving this person through thick and through thin\n" +
                "She looked at our boy and wished it was him\n" +
                "\n" +
                "Now this is where the second verse starts\n" +
                "It's about how she seemed to break his heart\n" +
                "He found out her feelings, it went straight to his head\n" +
                "So he carried on writing and here's what he said\n" +
                "\n" +
                "You make me smile when no one else can\n" +
                "It just makes me happy to be your man\n" +
                "But it hurts me deeply that you long for his heart\n" +
                "I thought we would last, but this breaks us apart\n" +
                "\n" +
                "He sat in his room and just wished he\n" +
                "Could be just like her ex so that they could be\n" +
                "But as long as he was there they could never be true\n" +
                "So he'd sit in his room feeling sad and blue\n" +
                "\n" +
                "Now comes the part where she's crying in his lap\n" +
                "They both just decided to never go back\n" +
                "The pain is immense but it's saving his heart\n" +
                "Because staying with her would rip him apart\n" +
                "\n" +
                "Here's where he decides to finish the song\n" +
                "The story of how it all went wrong\n" +
                "He starts the last verse with tears dripping off his nose\n" +
                "The papers all wet but here's how it goes.\n" +
                "\n" +
                "You were my siren, you drew me in\n" +
                "You taught me to love and you taught me to sin\n" +
                "I never thought you could break my heart\n" +
                "But I guess we were wrong right from the start\n" +
                "\n" +
                "You were my siren, now I'm dead at sea\n" +
                "You drew me in, but you didn't want me\n" +
                "I just wish I knew where it all went wrong\n" +
                "But now another lost sailor can hear your song\n");
        toolbar1.setTitle("SAD LOVE POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
