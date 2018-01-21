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

public class religion extends AppCompatActivity {
    ListView list1;
    ImageView im4,im5;
    Context context=this;
    Toolbar toolbar7;
    Databasehelper1 helper1=new Databasehelper1(this.getContext());
    public static Boolean changereligion=false;
    int j=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_layout);
        list1= (ListView)findViewById(R.id.list);
        im4=(ImageView)findViewById(R.id.img4);
        toolbar7=(Toolbar)findViewById(R.id.toolbar);
        toolbar7.setTitle("RELIGIONS IN INDIA");
        toolbar7.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        im5=(ImageView)findViewById(R.id.img5);
        if (vari.s%2==0)
        {Picasso.with(getContext()).load(R.drawable.likewhite1).into(im5);}
        else
        {Picasso.with(getContext()).load(R.drawable.likeblack).into(im5);}
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((vari.s%2)==0)
                {Picasso.with(getContext()).load(R.drawable.likeblack).fit().centerInside().into(im5);
                    helper1.insertNumber(22,"religion");
                    (vari.y)++;
                    Toast.makeText(context, "Added to Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.s++;}
                else
                {Picasso.with(getContext()).load(R.drawable.likewhite1).fit().centerInside().into(im5);
                    helper1.removeNumber(22);
                    (vari.y)=vari.y-1;
                    Toast.makeText(context, "Removed from Liked Articles", Toast.LENGTH_SHORT).show();
                    vari.s++;}
            }
        });
        Picasso.with(getContext()).load(R.drawable.religions).fit().centerInside().into(im4);
        final String[] str2={"Religion in India is characterised by a diversity of religious beliefs and practices. The " +
                "Secularism in India means treatment of all religions equally by the state. India is a Secular State by " +
                "the 42nd amendment act of Constitution in 1976. The Indian subcontinent is the birthplace of four of the" +
                " world's major religions; namely Hinduism, Buddhism, Jainism and Sikhism. Throughout India's history, " +
                "religion has been an important part of the country's culture. Religious diversity and religious tolerance " +
                "are both established in the country by the law and custom; the Constitution of India has declared the " +
                "right to freedom of religion to be a fundamental right.\n" +
                "\n" +
                "Northwest India was home to one of the world's oldest civilizations, the Indus valley civilisation. Today," +
                " India is home to around 90% of the global population of Hindus. Most Hindu shrines and temples are located" +
                " in India, as are the birthplaces of most Hindu saints. Allahabad hosts the world's largest religious " +
                "pilgrimage, Kumbha Mela, where Hindus from across the world come together to bathe in the confluence of" +
                " three sacred rivers of India: the Ganga, the Yamuna, and the Saraswati. The Indian diaspora in the West" +
                " has popularised many aspects of Hindu philosophy such as yoga, meditation, Ayurvedic medicine, " +
                "divination, karma, and reincarnation. The influence of Indian religions has been significant all " +
                "over the world. Several Hindu-based organisations, such as the Hare Krishna movement, the Brahma" +
                " Kumaris, the Ananda Marga, and others have spread Indian spiritual beliefs and practices.\n" +
                "\n" +
                "According to the 2011 census, 79.8% of the population of India practices Hinduism and 14.2% adheres to " +
                "Islam, while the remaining 6% adheres to other religions (Christianity, Sikhism, Buddhism, Jainism and " +
                "various indigenous ethnically-bound faiths). Christianity is the 3rd largest religion in India." +
                " Zoroastrianism and Judaism also have an ancient history in India, and each has several thousands of " +
                "Indian adherents. India has the largest population of people adhering to Zoroastrianism (i.e. Parsis " +
                "and Iranis) and Bahá'í Faith in the world, even though these religions are not native to India. " +
                "Many other world religions also have a relationship with Indian spirituality, such as the Baha'i faith" +
                " which recognises Buddha and Krishna as manifestations of the God Almighty."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(religion.this,android.R.layout.simple_list_item_1,str2);
        list1.setAdapter(adapter);
    }

    public Context getContext() {
        return context;
    }
}
