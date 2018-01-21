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

/**
 * Created by agrim on 22/12/17.
 */

public class sign_up extends AppCompatActivity {
    DatabaseHelper helper=new DatabaseHelper(sign_up.this);
    Toolbar toolbar1;
    Button bt1;
    TextView tv6,tv7,tv8,tv9,tv10;
    EditText name,email,uname,pass1,pass2;
    String name1,email1,uname1,pass11,pass21;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        toolbar1=(Toolbar)findViewById(R.id.toolbar);
        toolbar1.setTitle("SIGN UP");
        toolbar1.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        name=(EditText)findViewById(R.id.txt10);
        email=(EditText)findViewById(R.id.txt11);
        uname=(EditText)findViewById(R.id.txt12);
        pass2=(EditText)findViewById(R.id.txt13);
        pass1=(EditText)findViewById(R.id.txt14);
        tv6=(TextView)findViewById(R.id.tv6);
        tv7=(TextView)findViewById(R.id.tv7);
        tv8=(TextView)findViewById(R.id.tv8);
        tv9=(TextView)findViewById(R.id.tv9);
        tv10=(TextView)findViewById(R.id.tv10);
        bt1=(Button) findViewById(R.id.btn6);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name1=name.getText().toString();
                email1=email.getText().toString();
                uname1=uname.getText().toString();
                pass11=pass1.getText().toString();
                pass21=pass2.getText().toString();
                if(!pass11.equals(pass21))
                {Toast.makeText(sign_up.this, "password does not match", Toast.LENGTH_SHORT).show();}
                else
                {contact c=new contact();
                    c.setName(name1);
                    c.setEmail(email1);
                    c.setUname(uname1);
                    c.setPass(pass11);
                helper.insertContact(c);
                startActivity(new Intent(sign_up.this,MainActivity.class));}}});
    }
}
