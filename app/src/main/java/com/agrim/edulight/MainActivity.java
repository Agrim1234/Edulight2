package com.agrim.edulight;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    FloatingActionButton fabplus,fabc,fabh;
    Animation fabopen,fabclose,fabclockwise,fabanticlockwise;
    Button bt1,bt2,bt3;
    TextView tv,tv2;
    ImageView im1;
    Toolbar toolbar1;
    Boolean isopen=false;
    Context context=this;
    int i=0;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    sign_in signin;
    DatabaseHelper helper1=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fabc=(FloatingActionButton)findViewById(R.id.fabc);
        fabh=(FloatingActionButton)findViewById(R.id.fabh);
        fabplus=(FloatingActionButton)findViewById(R.id.fabplus);
        fabopen= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        fabclose= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        fabclockwise= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_clockwise);
        fabanticlockwise= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_anticlockwise);
        Picasso.with(getcontext()).load(R.drawable.ic_action_plus).into(fabplus);
        if (i==0)
        {fabc.startAnimation(fabclose);
        fabh.startAnimation(fabclose);}
        fabplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isopen){
                    fabc.startAnimation(fabclose);
                    fabh.startAnimation(fabclose);
                    fabplus.startAnimation(fabanticlockwise);
                    fabc.setClickable(false);
                    fabh.setClickable(false);
                    isopen=false;
                    i=i+1;}
                else {
                    fabc.startAnimation(fabopen);
                    fabh.startAnimation(fabopen);
                    fabplus.startAnimation(fabclockwise);
                    fabc.setClickable(true);
                    fabh.setClickable(true);
                    isopen=true;
                    i=i+1;}}
        });
        fabh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openHangman=getPackageManager().getLaunchIntentForPackage("com.agrim.hangman");
                startActivity(openHangman);}
        });
        fabc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openCalculator=getPackageManager().getLaunchIntentForPackage("com.agrim.catchtheball");
                startActivity(openCalculator);}
        });
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        bt1 = (Button)findViewById(R.id.bt1);
        bt2= (Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        im1=(ImageView)findViewById(R.id.im1);
        tv=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.txt10);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/c.ttf");
        tv.setTypeface(custom_font);
        bt1.setTypeface(custom_font);
        bt2.setTypeface(custom_font);
        bt3.setTypeface(custom_font);
        toolbar1.setTitle("EDULIGHT");
        toolbar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutEdulight=new Intent(MainActivity.this,about_edulight.class);
                startActivity(aboutEdulight);}
        });
        toolbar1.setTitleTextColor(Color.WHITE);
        toolbar1.setSubtitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_head);
        navigationView.setNavigationItemSelectedListener(this);
        drawerLayout.closeDrawer(GravityCompat.START);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,intent1.class));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,intent2.class));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,have_fun.class));
            }
        });
        String str=helper1.searchName(sign_in.a);
        if (sign_in.change)
        {tv2.setText("Hi, "+str);}
        else
        {tv2.setText("Hi");}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_contents,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item))
        {return true;}
        switch (item.getItemId()){
            case R.id.signout:
                sign_in.change=false;
                if (sign_in.change)
                {tv2.setText("Hi, "+helper1.searchName(sign_in.a));}
                else
                {tv2.setText("Hi");}
                break;
            case R.id.about:
                Intent intent1=new Intent(MainActivity.this,about_us.class);
                startActivity(intent1);
                break;
            case R.id.settings:
                Intent intent2=new Intent(MainActivity.this,settings.class);
                startActivity(intent2);
                break;}
        return super.onOptionsItemSelected(item);}
    public Context getcontext() {return context;}

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.about:
                startActivity(new Intent(MainActivity.this,about_us.class));
                break;
            case R.id.yourprofile:
                startActivity(new Intent(MainActivity.this,your_profile.class));
                break;
            case R.id.aboutedulight:
                startActivity(new Intent(MainActivity.this,about_edulight.class));
                break;
            case R.id.settings:
                startActivity(new Intent(MainActivity.this,settings.class));
                break;
            case R.id.signin:
                startActivity(new Intent(MainActivity.this,sign_in.class));
                break;
            case R.id.signup:
                startActivity(new Intent(MainActivity.this,sign_up.class));
                break;
            case R.id.share:
                Intent myIntent=new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody="A place to incraese your knowledge";
                String shareTitle="EDULIGHT";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareTitle);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent,"Share using"));
        }
        return true;
    }
}

