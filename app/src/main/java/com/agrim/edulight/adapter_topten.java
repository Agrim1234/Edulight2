package com.agrim.edulight;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by agrim on 22/12/17.
 */

public class adapter_topten extends RecyclerView.Adapter<adapter_topten.toptenvh> {
    public adapter_topten(contents3[] content21, Context context1){
        content1 = content21;
        context3 = context1;
        listener1 = null;}
    public interface OnItemClickListener{void onItemClick(contents1[] content1);}
    public contents3[] content1;
    private Context context3;
    private final adapter1.OnItemClickListener listener1;
    private String[] topten={"Best countries to live in","Most powerful countries"," Most famous countries","Greatest cities in the world","Coolest languages",
            "Worst languages","Best movies of all time","Best film directors of all time","Worst world leaders","Greatest men"};
    private String[] topten1={"1. Australia \n 2. Switzerland \n 4. Germany \n 5. Denmark \n 6. Singapore \n 7. Netherands \n 8. Ireland \n 9.Iceland \n 10.Canada",
    "1. USA\n2. Russia\n3. China\n4. India\n5. UK\n6. France\n7. Germany\n8. Turkey\n9. South Korea\n10. Japan",
    "1. France\n2. USA\n3. Spain\n4. China\n5. Italy\n6. Turkey\n7. Germany\n8. UK\n9. Russia\n10. Mexico",
    "1. New York\n2. London\n3. Paris\n4. Berlin\n5. Barcelona\n6. Chicago\n7. Tokyo\n8. Istanbul\n9. Rome\n10. Sydney",
            "1. Mandarin\n2. Arabic\n3. Spanish\n4. German\n5. Portugese\n6. Russian\n7. French\n8. German\n9. Hindi\n10. Bemgali",
            "1. American English\n2. Chinese\n3. Hindi\n4. German\n5. French\n6. Italian\n7. Arabic\n8. Korean\n9. Old English\n10. Tamil",
            "1. Tootsie\n2. The Godfather\n3. A women under the influence\n4. Cinema Paradiso\n5. To kill a mockingbird\n6. Annie hall\n7. Boggie nights\n8. The godfather(part 2)\n9. The red shoes\n10. Taxi driver",
            "1. Steven Spielberg\n2. Martin Scorsese\n3.  Alfred Hitchcock\n4. Stanley Kubrick\n5. Francis Ford Coppola\n6. Woody Allen\n7. Billy Wilder\n8. John Huston \n9. Peter Jackson\n10. Milos Forman",
            "1. George W Bush\n2. Hun Sen\n3. Adolf Hitler\n4. Kim Jong 2\n5. Kim Jong Un\n6. Saddam Hussein\n7. Pol Pot\n8. Joseph Stalin\n9. Yingluck Shinawatra\n10. Thaksin Shinawatra",
            "1. Jesus Christ\n2. Albert Einstein\n3. Issac Newton\n4. Leonardo Da Vinci\n5. Aristotle\n6. Muhammad\n7. Galileo Galilei\n8. Plato\n9. Alexander The Great\n10. Charles Darwin"};
    @Override
    public toptenvh onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater2=LayoutInflater.from(parent.getContext());
        View newView = layoutinflater2.inflate(R.layout.if_topten,parent,false);
        toptenvh viewholder2=new toptenvh(newView);
        return viewholder2;
    }
    @Override
    public void onBindViewHolder(toptenvh holder, int position) {
        holder.tv8.setText(topten[position]);
        holder.tv9.setText(topten1[position]);

    }
    @Override
    public int getItemCount() {
        return content1.length;
    }
    class toptenvh extends RecyclerView.ViewHolder {
        public TextView tv8;
        public TextView tv9;
        public toptenvh(View itemView) {
            super(itemView);
            tv8=(TextView)itemView.findViewById(R.id.txt8);
            tv9=(TextView)itemView.findViewById(R.id.txt9);
        }
    }
}
