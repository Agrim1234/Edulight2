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

public class life extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("Who are you to refer to us,\n" +
                "As \"Only\" a CNA?\n" +
                "\n" +
                "We're the ones who wash and dress,\n" +
                "Our patients for the day.\n" +
                "\n" +
                "We're the ones who take the time,\n" +
                "To listen to them speak.\n" +
                "\n" +
                "We listen about their lifetime,\n" +
                "In a forty hour week.\n" +
                "\n" +
                "We also give our hands to hold,\n" +
                "When someone's feeling scared.\n" +
                "\n" +
                "It's not easy being a patient,\n" +
                "You're never quite prepared.\n" +
                "\n" +
                "We take the time to listen,\n" +
                "By lending both our ears.\n" +
                "\n" +
                "We listen to their worries,\n" +
                "Or how they've spent their years.\n" +
                "\n" +
                "Our arms were made to reach,\n" +
                "And even wrap around.\n" +
                "\n" +
                "To give our patients hugs,\n" +
                "When their feeling a little down.\n" +
                "\n" +
                "We help our patients do the things,\n" +
                "They used to do on their own.\n" +
                "\n" +
                "Everybody needs some help,\n" +
                "Even when we're grown.\n" +
                "\n" +
                "So who are you to refer to us,\n" +
                "As \"only\" a CNA?\n" +
                "\n" +
                "We do our best to meet their needs,\n" +
                "Within our working day.\n" +
                "\n" +
                "We chose to do this job,\n" +
                "The job did not choose us.\n" +
                "\n" +
                "We sympathize and empathize,\n" +
                "Compassion is a must.\n" +
                "\n" +
                "We try to keep them comfortable,\n" +
                "And free of any fear.\n" +
                "\n" +
                "We sit along beside them,\n" +
                "When that time is near.\n" +
                "\n" +
                "We hold their hand, stroke their hair,\n" +
                "Just making sure they know.\n" +
                "\n" +
                "Their not alone, an aide is there,\n" +
                "It's ok for them to go.\n" +
                "\n" +
                "To all the CNA's keep your head held high,\n" +
                "\n" +
                "We're not \"only\" CNA's.\n" +
                "\n" +
                "WE'RE ANGEL'S IN DISGUISE!!\n");
        toolbar1.setTitle("LIFE POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
