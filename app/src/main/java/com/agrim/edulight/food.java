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

public class food extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changefood=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("FOOD OF INDIA");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.k%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.k%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(13,"food");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.k++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(13);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.k++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.spices).fit().centerInside().into(im4);
        final String[] str2= {"Indian cuisine comprises a wide variety of regional and traditional cuisines native to the " +
                "Indian subcontinent. Given the range of diversity in soil type, climate, culture, ethnic groups, and " +
                "occupations, these cuisines vary substantially from each other and use locally available spices, herbs, " +
                "vegetables, and fruits. Indian food is also heavily influenced by religious, in particular Hindu, and " +
                "cultural choices and traditions. Also, Middle Eastern and Central Asian influences have occurred on " +
                "North Indian cuisine from the years of Mughal rule. Indian cuisine is still evolving, as a result of " +
                "the nation's cultural interactions with other societies.\n"+"\n"+
                "Historical incidents such as foreign invasions, trade relations, and colonialism have played a role in " +
                "introducing certain foods to the country. For instance, potato, a staple of the diet in some regions of " +
                "India, was brought to India by the Portuguese, who also introduced chillies and breadfruit. Indian " +
                "cuisine has shaped the history of international relations; the spice trade between India and Europe was " +
                "the primary catalyst for Europe's Age of Discovery. Spices were bought from India and traded around " +
                "Europe and Asia. Indian cuisine has influenced other cuisines across the world, especially those from " +
                "Europe, the Middle East, North Africa, sub-Saharan Africa, Southeast Asia, the British Isles, Fiji, and " +
                "the Caribbean." +
                "Staple foods of Indian cuisine include pearl millet (bājra), rice, whole-wheat flour (aṭṭa), and a " +
                "variety of lentils, such as masoor (most often red lentils), toor (pigeon peas), urad (black gram), and " +
                "moong (mung beans). Lentils may be used whole, dehusked—for example, dhuli moong or dhuli urad—or split. " +
                "Split lentils, or dal, are used extensively. Some pulses, such as channa or cholae (chickpeas), " +
                "rajma (kidney beans), and lobiya (black-eyed peas) are very common, especially in the northern regions. " +
                "Channa and moong are also processed into flour (besan).\n" +"\n"+
                "Many Indian dishes are cooked in vegetable oil, but peanut oil is popular in northern and western India," +
                " mustard oil in eastern India, and coconut oil along the western coast, especially in Kerala. " +
                "Gingelly (sesame) oil is common in the south since it imparts a fragrant, nutty aroma. In recent" +
                " decades, sunflower, safflower, cottonseed, and soybean oils have become popular across India. " +
                "Hydrogenated vegetable oil, known as Vanaspati ghee, is another popular cooking medium. Butter-" +
                "based ghee, or deshi ghee, is used frequently, though less than in the past. Many types of meat are used " +
                "for Indian cooking, but chicken and mutton tend to be the most commonly consumed meats. Fish and beef " +
                "consumption are prevalent in some parts of India, but they are not widely consumed except for coastal " +
                "areas, as well as the north east."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(food.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }

    public Context getContext() {
        return context;
    }
}
