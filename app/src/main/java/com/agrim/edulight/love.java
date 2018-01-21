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

public class love extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("One you should treasure, but not as a possession,\n" +
                "Who needs to be loved, not treated with aggression.\n" +
                "Her value is more than all the world's treasures,\n" +
                "Not just the sum of scale's unit measures.\n" +
                "She should always be built up, not torn down,\n" +
                "By all the words you speak, when she is around.\n" +
                "She needs to be hugged and not pushed away,\n" +
                "Especially when you are both having a really bad day.\n" +
                "Words spoken to her in haste and anger\n" +
                "Can place her fragile heart in danger.\n" +
                "She should be admired for her boundless love,\n" +
                "And looked upon as a true gift from Above.\n" +
                "Not used as a target for all your frustration,\n" +
                "But held close and kissed with loving admiration.\n" +
                "You should always appreciate her commitment to you,\n" +
                "And not take for granted what she's given up for you!\n" +
                "Kiss her and love her all that you possibly can,\n" +
                "And don't be embarrassed to be seen holding her hand.\n" +
                "Treasure each day as if it were the last,\n" +
                "And at the end of your life you won't be regretting your past.\n");
        toolbar1.setTitle("LOVE POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
