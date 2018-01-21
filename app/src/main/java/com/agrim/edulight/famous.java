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

public class famous extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("Somebody said that it couldn’t be done\n" +
                "But he with a chuckle replied\n" +
                "That \"maybe it couldn't,\" but he would be one\n" +
                "Who wouldn't say so till he'd tried.\n" +
                "So he buckled right in with the trace of a grin\n" +
                "On his face. If he worried he hid it.\n" +
                "He started to sing as he tackled the thing\n" +
                "That couldn’t be done, and he did it!\n" +
                "\n" +
                "Somebody scoffed: \"Oh, you’ll never do that;\n" +
                "At least no one ever has done it;\"\n" +
                "But he took off his coat and he took off his hat\n" +
                "And the first thing we knew he'd begun it.\n" +
                "With a lift of his chin and a bit of a grin,\n" +
                "Without any doubting or quiddit,\n" +
                "He started to sing as he tackled the thing\n" +
                "That couldn't be done, and he did it.\n" +
                "\n" +
                "There are thousands to tell you it cannot be done,\n" +
                "There are thousands to prophesy failure,\n" +
                "There are thousands to point out to you one by one,\n" +
                "The dangers that wait to assail you.\n" +
                "But just buckle in with a bit of a grin,\n" +
                "Just take off your coat and go to it;\n" +
                "Just start in to sing as you tackle the thing\n" +
                "That \"cannot be done,\" and you'll do it.\n");
        toolbar1.setTitle("FAMOUS POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
