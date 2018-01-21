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

public class short1 extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("I come with no wrapping or pretty pink bows.\n" +
                "I am who I am, from my head to my toes.\n" +
                "I tend to get loud when speaking my mind.\n" +
                "Even a little crazy some of the time.\n" +
                "I'm not a size 5 and don't care to be.\n" +
                "You can be you and I can be me.\n" +
                "I try to stay strong when pain knocks me down.\n" +
                "And the times that I cry are when no one's around.\n" +
                "To error is human or so that's what they say.\n" +
                "Well, tell me who's perfect anyway.\n");
        toolbar1.setTitle("SHORT POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
