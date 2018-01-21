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

public class sonnet extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("Bright star, would I were steadfast as thou art! -\n" +
                "Not in lone splendour hung aloft the night,\n" +
                "And watching, with eternal lids apart,\n" +
                "Like Nature's patient sleepless Eremite,\n" +
                "The moving waters at their priestlike task\n" +
                "Of pure ablution round earth's human shores,\n" +
                "Or gazing on the new soft fallen mask\n" +
                "Of snow upon the mountains and the moors -\n" +
                "No -yet still steadfast, still unchangeable,\n" +
                "Pillowed upon my fair love's ripening breast,\n" +
                "To feel for ever its soft fall and swell,\n" +
                "Awake for ever in a sweet unrest,\n" +
                "Still, still to hear her tender-taken breath,\n" +
                "And so live ever -or else swoon to death. ");
        toolbar1.setTitle("SONNET POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
