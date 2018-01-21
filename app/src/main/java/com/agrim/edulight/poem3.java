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

public class poem3 extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);

        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("People are unreasonable, illogical, and self-centered.\n" +
                "Love them anyway!\n" +
                "\n" +
                "If you do good, people will accuse you of selfish ulterior motives.\n" +
                "Do good anyway!\n" +
                "\n" +
                "If you are successful, you will win false friends and true enemies.\n" +
                "Succeed anyway!\n" +
                "\n" +
                "The good you do today, will be forgotten tomorrow.\n" +
                "Do good anyway!\n" +
                "\n" +
                "Honesty and frankness make you vulnerable.\n" +
                "Be honest and frank anyway!\n" +
                "\n" +
                "The biggest person with the biggest ideas can be shot down by the smallest people with the smallest minds;\n" +
                "Think big anyway!\n" +
                "\n" +
                "People favor underdogs, but follow only top dogs.\n" +
                "Fight for underdogs anyway!\n" +
                "\n" +
                "What you spend years building up may be destroyed overnight.\n" +
                "Build anyway!\n" +
                "\n" +
                "People really need help, but will attack you if you help them.\n" +
                "Help them anyway!\n" +
                "\n" +
                "Give the world the best you have and it may kick you in the teeth.\n" +
                "Give the world the best you've got anyway!\n");
        toolbar1.setTitle("POEM 3");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
