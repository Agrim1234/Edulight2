package com.agrim.edulight;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by agrim on 22/12/17.
 */

public class sign_in extends AppCompatActivity {
    Toolbar toolbar1;
    Button bt1;
    EditText ed1,ed2;
    TextView tv6,tv7;
    DatabaseHelper helper=new DatabaseHelper(sign_in.this);
    public static Boolean change=false;
    public static String name2,a;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        toolbar1.setTitle("SIGN IN");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tv6=(TextView)findViewById(R.id.tv6);
        tv7=(TextView)findViewById(R.id.tv7);
        ed1=(EditText)findViewById(R.id.txt10);
        ed2=(EditText)findViewById(R.id.txt11);
        bt1=(Button) findViewById(R.id.btn6);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=ed1.getText().toString();
                String b=ed2.getText().toString();
                String password=helper.searchPass(a);
                name2=helper.searchName(a);
                if (password.equals(b))
                {startActivity(new Intent(sign_in.this,MainActivity.class));
                change=true;}
                else
                {Toast.makeText(sign_in.this, "Username or password do not match", Toast.LENGTH_SHORT).show();}
            }
        });
    }
}
