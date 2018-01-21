package com.agrim.edulight;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

/**
 * Created by agrim on 13/12/17.
 */

public class facts2 extends AppCompatActivity {

    Toolbar toolbar5;
    EditText ed7;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facts2);
        toolbar5=(Toolbar)findViewById(R.id.toolbar);
        ed7=(EditText)findViewById(R.id.ed7);
        toolbar5.setTitle("SIMPLY ENJOYING");
        toolbar5.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
