package com.agrim.edulight;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by agrim on 13/12/17.
 */

public class articles2 extends AppCompatActivity {

    Toolbar toolbar3;
    TextView tv7;
    EditText ed3,ed4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articles2);
        toolbar3=(Toolbar)findViewById(R.id.toolbar);
        tv7=(TextView) findViewById(R.id.tv7);
        ed3=(EditText)findViewById(R.id.ed3);
        ed4=(EditText)findViewById(R.id.ed4);
        toolbar3.setTitle("SIMPLY EXPLORING");
        toolbar3.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
