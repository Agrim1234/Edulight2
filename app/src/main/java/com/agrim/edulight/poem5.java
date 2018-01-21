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

public class poem5 extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);

        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("Allow yourself to dream,\n" +
                "And when you do dream big\n" +
                "Allow yourself to learn\n" +
                "And when you do learn all you can\n" +
                "\n" +
                "Allow yourself to laugh\n" +
                "And when you do share your laughter\n" +
                "Allow yourself to set goals\n" +
                "And when you do reward yourself as you move forward\n" +
                "\n" +
                "Allow yourself to be determined\n" +
                "And when you do you will find you will succeed\n" +
                "Allow yourself to believe in yourself\n" +
                "And when you do you will find self confidence\n" +
                "\n" +
                "Allow yourself to lend a helping hand\n" +
                "And when you do a hand will help you.\n" +
                "Allow yourself relaxation\n" +
                "And when you do you will find new ideas.\n" +
                "\n" +
                "Allow yourself love\n" +
                "And when you do you will find love in return\n" +
                "Allow yourself to be happy\n" +
                "And when you do you will influence others around you.\n" +
                "\n" +
                "Allow yourself to be positive\n" +
                "And when you do life will get easier.\n");
        toolbar1.setTitle("POEM 5");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
