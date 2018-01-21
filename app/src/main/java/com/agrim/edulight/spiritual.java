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

public class spiritual extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("The Lord whispered to me, \"I love you so,\"\n" +
                "\"Come follow me, my child, high places we will go.\"\n" +
                "The Lord knelt beside me at an altar in prayer,\n" +
                "He wiped my tears and took away my despair.\n" +
                "\"Come follow me, my child,\" the Lord whispered to me,\n" +
                "\"There will be no more pain, but oh so much to gain.\"\n" +
                "He said, \"I forgive you now for all you've done,\"\n" +
                "Now it's time to receive the love of God's only son.\"\n" +
                "His love was so warm, so bright and so true,\n" +
                "I could not believe my soul he had renewed,\n" +
                "He repaired my soul from the inside out.\n" +
                "It was then and only then I knew what love was about.\n" +
                "The cleansing power that fell over me,\n" +
                "Was the love of the Lord as he carried me.\n" +
                "\"Come follow me, my child,\" the Lord whispered to me,\n" +
                "\"In that sweet holy land someday you will be.\n" +
                "You will see the Lord's face at those big pearly gates,\n" +
                "Where loved ones embrace and angels await.\n" +
                "Come follow me, my child,\" the Lord whispered to me,\n" +
                "\"I will love you always, your protector I'll be.\"\n" );
        toolbar1.setTitle("SPIRITUAL POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
