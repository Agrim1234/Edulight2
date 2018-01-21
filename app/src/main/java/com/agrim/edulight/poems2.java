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

public class poems2 extends AppCompatActivity {

    Toolbar toolbar4;
    TextView tv8;
    EditText ed5,ed6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poems2);
        toolbar4=(Toolbar)findViewById(R.id.toolbar);
        tv8=(TextView) findViewById(R.id.tv7);
        ed5=(EditText)findViewById(R.id.ed3);
        ed6=(EditText)findViewById(R.id.ed4);
        toolbar4.setTitle("SIMPLY WANDERING");
        toolbar4.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
