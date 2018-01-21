package com.agrim.edulight;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
/**
 * A simple {@link Fragment} subclass.
 */
public class likedarticles extends Fragment {
    ListView list1;
    public likedarticles() {
        // Required empty public construcor
        }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_likedarticles, container, false);
        Databasehelper1 databasehelper1=new Databasehelper1(this.getContext());
        list1=(ListView)view.findViewById(R.id.list);
        final Context context=this.getContext();
        if (vari.y!=0)
        {String[] str3 = new String[vari.y];
            for (int i=0;i<vari.y;i++)
            {str3[i]="Liked Article "+String.valueOf(i+1);}
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,str3);
            list1.setAdapter(adapter);
            final int[] a=new int[vari.y];
            for (int d=0;d<vari.y;d++)
            {a[d]=databasehelper1.searchNumber(d);}
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               int k;
                for (k=0;k<vari.y;k++)
                {if (i==k)
                {if (a[k]==2)
                {context.startActivity(new Intent(getContext(),agriculture.class));}
                else{if (a[k]==3)
                {context.startActivity(new Intent(getContext(),army.class));}
                else{if (a[k]==4)
                {context.startActivity(new Intent(getContext(),auto.class));}
                else{if (a[k]==5)
                {context.startActivity(new Intent(getContext(),aviation.class));}
                else{if (a[k]==6)
                {context.startActivity(new Intent(getContext(),banks.class));}
                else{if (a[k]==7)
                {context.startActivity(new Intent(getContext(),constitution.class));}
                else{if (a[k]==8)
                {context.startActivity(new Intent(getContext(),culture.class));}
                else{if (a[k]==9)
                {context.startActivity(new Intent(getContext(),defense.class));}
                else{if (a[k]==10)
                {context.startActivity(new Intent(getContext(),education.class));}
                else{if (a[k]==11)
                {context.startActivity(new Intent(getContext(),electronics.class));}
                else{if (a[k]==12)
                {context.startActivity(new Intent(getContext(),fmcg.class));}
                else{if (a[k]==13)
                {context.startActivity(new Intent(getContext(),food.class));}
                else{if (a[k]==14)
                {context.startActivity(new Intent(getContext(),industry.class));}
                else{if (a[k]==15)
                {context.startActivity(new Intent(getContext(),isro.class));}
                else{if (a[k]==16)
                {context.startActivity(new Intent(getContext(),it.class));}
                else{if (a[k]==17)
                {context.startActivity(new Intent(getContext(),language.class));}
                else{if (a[k]==18)
                {context.startActivity(new Intent(getContext(),mountains.class));}
                else{if (a[k]==19)
                {context.startActivity(new Intent(getContext(),parties.class));}
                else{if (a[k]==20)
                {context.startActivity(new Intent(getContext(),power.class));}
                else{if (a[k]==21)
                {context.startActivity(new Intent(getContext(),rail.class));}
                else{if (a[k]==22)
                {context.startActivity(new Intent(getContext(),religion.class));}
                else{if (a[k]==23)
                {context.startActivity(new Intent(getContext(),rivers.class));}
                else{if (a[k]==24)
                {context.startActivity(new Intent(getContext(),sports.class));}
                else {if(a[k]==25)
                {context.startActivity(new Intent(getContext(),startup.class));}
                else{if (a[k]==26)
                {context.startActivity(new Intent(getContext(),telecom.class));}
                else{if (a[k]==27)
                {context.startActivity(new Intent(getContext(),textile.class));}
                else{if (a[k]==28)
                {context.startActivity(new Intent(getContext(),waterfall.class));}
                }}}}}}}}}}}}}}}}}}}}}}}}}}}}}
        });}
        else
            {String[] str4={"No Liked Articles"};
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,str4);
            list1.setAdapter(adapter);}
        return view;}
}
