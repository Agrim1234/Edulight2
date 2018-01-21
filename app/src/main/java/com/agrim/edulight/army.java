package com.agrim.edulight;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by agrim on 14/12/17.
 */

public class army extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(army.this);
    public static Boolean changearmy=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("INDIAN ARMED FORCES");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.b%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.b%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(3,"army");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.b++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(3);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.b++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.army).fit().centerInside().into(im4);
        final String[] str2={"The Indian Armed Forces are the military forces of the Republic of India." +
                " It consists of three professional uniformed services: the Indian Army, Indian" +
                " Navy, and Indian Air Force. Additionally, the Indian Armed Forces are supported by " +
                "the Indian Coast Guard and paramilitary organisations (Assam Rifles, and Special " +
                "Frontier Force) and various inter-service commands and institutions such as the " +
                "Strategic Forces Command, the Andaman and Nicobar Command and the Integrated Defence " +
                "Staff. The President of India is the Supreme Commander of the Indian Armed Forces. The" +
                " Indian Armed Forces are under the management of the Ministry of Defence (MoD) of the" +
                " Government of India. With strength of over 1.4 million active personnel, it is the" +
                " world's 2nd largest military force and has the world's largest volunteer army.\n"+"\n"+
                "The Indian armed forces have been engaged in a number of major military operations," +
                " including: the Indo-Pakistani wars of 1947, 1965 and 1971, the Portuguese-Indian" +
                " War, the Sino-Indian War, the 1967 Chola incident, the 1987 Sino-Indian skirmish," +
                " the Kargil War, and the Siachen conflict among others. India honours its armed " +
                "forces and military personnel annually on Armed Forces Flag Day, 7 December. Since" +
                " 1962, the IAF has maintained close military relations with Russia, including " +
                "cooperative development of programmes such as the Fifth Generation Fighter " +
                "Aircraft (FGFA) and the Multirole Transport Aircraft (MTA). Armed with the nuclear" +
                " triad, the Indian armed forces are steadily undergoing modernisation, with" +
                " investments in areas such as futuristic soldier systems and missile defence systems.\n"+
                 "\n"+
                "The Department of Defence Production of the Ministry of Defence is responsible for the" +
                " indigenous production of equipment used by the Indian Armed Forces. It comprises the" +
                " 41 Indian Ordnance Factories under the control of the Ordnance Factories Board, and" +
                " eight Defence PSUs namely: HAL, BEL, BEML, BDL, MDL, GSL, GRSE and Midhani. India" +
                " was the largest importer of defence equipment in 2014 with Russia, Israel, France and" +
                " the United States being the top foreign suppliers of military equipment." +
                " The Government of India has launched a Make in India initiative to indigenise " +
                "manufacturing and reduce dependence on imports, including defence imports and procurement."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(army.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);}
    public Context getContext() {return context;}
}
