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

public class death extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("My dear sweet heavenly father I come to you today,\n" +
                "with faith and hope I ask, send an angel Mama's way.\n" +
                "I know her time is near and soon you'll take her home,\n" +
                "to stroll across the streets of gold where other angels roam.\n" +
                "It's hard to watch her suffer and slowly fade away,\n" +
                "help me God to understand, give me strength I pray.\n" +
                "She means so much to all of us, forgive me for my fears,\n" +
                "life will never be the same without her presence here.\n" +
                "My mother is my angel, she taught me how to love,\n" +
                "and told me about you lord and heaven up above.\n" +
                "When she crosses over and steps into the light,\n" +
                "tell her that I love her and when the time is right.\n" +
                "Meet me at the pearly gates where every thing's brand new,\n" +
                "we'll walk across God's meadow lands where skies are always blue.\n" +
                "Somewhere beyond the sunset every now and then,\n" +
                "I pray she watches over me until we meet again.\n" );
        toolbar1.setTitle("DEATH POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
