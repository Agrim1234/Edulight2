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

public class teen extends AppCompatActivity {
    Toolbar toolbar1;
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poem_layout);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        tv1=(TextView)findViewById(R.id.txt9);
        tv1.setText("Do we stay silent\n" +
                "Or raise our voices?\n" +
                "Do we give in\n" +
                "Or make our choices?\n" +
                "\n" +
                "This is our chance.\n" +
                "This is our threat.\n" +
                "This is our choice.\n" +
                "And we're not finished yet.\n" +
                "\n" +
                "We stand together\n" +
                "And await the light\n" +
                "This is our chance,\n" +
                "This is our fight.\n" +
                "\n" +
                "Here we're standing,\n" +
                "United and strong.\n" +
                "We're not giving this up.\n" +
                "We're not moving on.\n" +
                "\n" +
                "This is our voice;\n" +
                "This is what we came to show.\n" +
                "This is our choice,\n" +
                "And we're not letting go\n" +
                "\n" +
                "This is our word.\n" +
                "You give what you get.\n" +
                "This is our world,\n" +
                "And we're not finished yet.\n" +
                "\n" +
                "We stand beside you,\n" +
                "Ready to pay our debt\n" +
                "We stand united\n" +
                "Because we're not finished yet.\n" +
                "\n" +
                "Children are born every day,\n" +
                "Waiting for someone to trust.\n" +
                "Dreams are dreamed every day\n" +
                "But left alone to rust.\n" +
                "\n" +
                "Raise your voices; stand up tall.\n" +
                "You know this is unjust.\n" +
                "Make your choices; stand from the fall,\n" +
                "Because dreams are counting on us.\n" +
                "\n" +
                "I know that you are scared to be strong.\n" +
                "You have every right to be.\n" +
                "Show the dreamers that you care.\n" +
                "Come and stand with me.\n" +
                "\n" +
                "Think of our future; think of the truth.\n" +
                "Think of the lives we share.\n" +
                "Think of our beginnings; think of our youth.\n" +
                "We're all just a kid from somewhere.\n" +
                "\n" +
                "Standing together, holding hands,\n" +
                "We all came from the same place.\n" +
                "Joined we are forever;\n" +
                "We are running the same race.\n" +
                "\n" +
                "Stand with me; we're not through yet.\n" +
                "We are getting what we gave.\n" +
                "Hand in hand with me, strongest together.\n" +
                "This can all be saved.\n" +
                "\n" +
                "This is like our lifetimes;\n" +
                "This is more than just a game.\n" +
                "This is more than just the money,\n" +
                "More than ourselves, more than fame.\n" +
                "\n" +
                "Speak up for what matters,\n" +
                "Because now it does; this love is caving.\n" +
                "Speak up before we shatter.\n" +
                "Think of all the dreams we're saving.\n" +
                "\n" +
                "There are kids like us in Texas,\n" +
                "Out in Utah, up in Maine.\n" +
                "There are kids that are the future Crosby,\n" +
                "Skinner, Matthews, Kane.\n" +
                "\n" +
                "From the mountains, valleys, cities,\n" +
                "Suburbs, hamlets and countryside,\n" +
                "There are the children of this future.\n" +
                "All around us they reside.\n" +
                "\n" +
                "On the Pittsburgh Penguins, Boston Bruins,\n" +
                "The Canes and Minnesota Wild.\n" +
                "We often forget that before they were champions,\n" +
                "Each one was just a child\n" +
                "\n" +
                "They once stood watching,\n" +
                "Dreaming with this light inside their eyes.\n" +
                "Together we can save that light,\n" +
                "And return it to more lives.\n" +
                "\n" +
                "Here we're standing, grasping hands;\n" +
                "Here we're standing strong.\n" +
                "This time we're not giving in,\n" +
                "And we're not moving on.\n" +
                "\n" +
                "THIS is our voice;\n" +
                "This is what we came to show.\n" +
                "This is our choice,\n" +
                "And we're not letting go.\n" +
                "\n" +
                "This is the world we live in.\n" +
                "You must give what you get.\n" +
                "This is our word we're giving.\n" +
                "We're not finished yet.\n" +
                "\n" +
                "We stand together, united.\n" +
                "This is our chance to repay this debt.\n" +
                "We stand beside you all, united.\n" +
                "We're not finished yet.\n" );
        toolbar1.setTitle("TEEN POEM");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
