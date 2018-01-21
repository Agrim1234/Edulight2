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

public class poem2 extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);

        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("Count your blessings instead of your crosses;\n" +
                "Count your gains instead of your losses.\n" +
                "Count your joys instead of your woes;\n" +
                "Count your friends instead of your foes.\n" +
                "\n" +
                "Count your smiles instead of your tears;\n" +
                "Count your courage instead of your fears.\n" +
                "Count your full years instead of your lean;\n" +
                "Count your kind deeds instead of your mean.\n" +
                "\n" +
                "Count your health instead of your wealth;\n" +
                "Love your neighbor as much as yourself.\n");
        toolbar1.setTitle("POEM 2");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
