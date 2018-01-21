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

public class funny extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("A dog wandered into our garden one day,\n" +
                "A friendly old mutt, didn't look like a stray.\n" +
                "We never discovered whence he had come,\n" +
                "But we brushed him and fed him and the kids called him Rum.\n" +
                "\n" +
                "Now as family members, even dogs must work hard,\n" +
                "So we put Rum on duty next door in our yard,\n" +
                "Bright eyed and watchful by night and by day,\n" +
                "But not much of a guard dog, I'm sorry to say.\n" +
                "\n" +
                "He barked at the cats and he'd bark at a toad,\n" +
                "He barked at the cattle outside on the road,\n" +
                "He barked at the horses - so where did he fail?\n" +
                "You see, Rum liked people, and he just wagged his tail.\n" +
                "\n" +
                "He liked the yard labour, an amiable bunch.\n" +
                "They fed our dog tidbits and scraps from their lunch.\n" +
                "Rum wolfed it all down, but to our dismay\n" +
                "He seemed to get fatter with each passing day.\n" +
                "\n" +
                "Then one night when Rum was laid at his ease,\n" +
                "A burglar crept in just as quiet as you please.\n" +
                "He saw no alarms, heard now siren howling,\n" +
                "No guard dog for sure, there'd be barking and growling.\n" +
                "\n" +
                "But Rum was awake and he'd seen him alright,\n" +
                "Delighted with company this time of the night,\n" +
                "He flew through the yard, his new friend to greet,\n" +
                "And his weight bowled the burglar right off of his feet.\n" +
                "\n" +
                "The intruder got up and ran off with a wail\n" +
                "And Rum right behind him still wagging his tail.\n" +
                "He departed the yard he'd come in to burgle\n" +
                "Like a champion athlete clearing a hurdle.\n" +
                "\n" +
                "But Rum couldn't jump gates, so sadly instead\n" +
                "He picked up the thief's wallet and went back to bed.\n" +
                "Next morning the evidence everyone viewed,\n" +
                "When Rum brought it to us, (just a little bit chewed).\n" +
                "\n" +
                "Once given the wallet, the police didn't fail\n" +
                "To capture the burglar and put him in jail.\n" +
                "His confession like wildfire spread through the town,\n" +
                "How a big vicious guard dog had knocked the thief down.\n" +
                "\n" +
                "We all howled with laughter when we heard the story,\n" +
                "And Rum was our hero, he was basking in glory.\n" +
                "There's been no attempts since to burgle our yard,\n" +
                "For everyone knows now that Rum is on guard.\n" );
        toolbar1.setTitle("FUNNY POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
