package com.agrim.edulight;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by agrim on 26/12/17.
 */

public class adapter_countries extends RecyclerView.Adapter<adapter_countries.countriesvh>{
    public adapter_countries(contents3[] content21, Context context1){
        content1 = content21;
        context3 = context1;
        listener1 = null;}
    public interface OnItemClickListener{void onItemClick(contents1[] content1);}
    public contents3[] content1;
    private Context context3;
    private final adapter1.OnItemClickListener listener1;
    private String[] countries={"Afghanistan","Austria","Bangladesh","Brazil","Canada","China","Finland","France","Japan","Jordan"};
    private String[] countries1={("President: Ashraf Ghani (2014)\n"+ "Chief Executive: Abdullah Abdullah (2014)\n" + "Total area: 250,000 sq mi (647,500 sq km)\n" +
            "Population (2014 est.): 31,822,848 (growth rate: 2.3%); birth rate: 38.8/1000; infant mortality rate: 117.23/1000; life expectancy: 50.49; density per sq mi: 123.7\n" +
            "Capital and largest city (2011 est.): Kabul, 3,097,300\n" + "Other large cities: Kandahar, 349,300; Mazar-i-Sharif, 246,900; Charikar, 202,600; Herat, 171,500\n" +
            "Monetary unit: Afghani\n"),("President: Heinz Fischer (2004)\n" + "Chancellor: Werner Faymann (2008)\n" + "Land area: 31,942 sq mi (82,730 sq km); total area: 32,382 sq mi (83,870 sq km)\n" +
            "Population (2014 est.): 8,223,062 (growth rate: 0.01%); birth rate 8.76/1000; infant mortality rate: 4.16/1000; life expectancy: 80.17\n" + "Capital and largest city (2011 est.): Vienna, 1.72 million\n" +
            "Other large cities: Graz, 219,500; Linz, 185,300; Salzburg, 145,500; Innsbruck, 115,600\n" + "Monetary units: Euro (formerly schilling)\n" + "National name: Republik Österreich\n"),
            ("Sovereign: Queen Elizabeth II (1952)\n" + "Governor-General: Peter Cosgrove (2014)\n" + "Prime Minister: Malcolm Turnbull (2015)\n" + "Land area: 2,941,283 sq mi (7,617,931 sq km); total area: 2,967,893 sq mi (7,686,850 sq km)\n" +
                    "Population (2014 est.): 22,507,617 (growth rate: 1.09%); birth rate: 12.19/1000; infant mortality rate: 4.43/1000; life expectancy: 82.07\n" +
                    "Capital (2011 est.): Canberra, 399,000\n" + "Largest cities: Sydney 4.543 million; Melbourne 3.961 million; Brisbane 2.039 million; Perth 1.649 million; Adelaide 1.198 million; CANBERRA (capital) 399,000 (2011)\n" +
                    "Monetary unit: Australian dollar\n"),("President: Abdul Hamid (2013)\n" + "Prime Minister: Sheikh Hasina (2009)\n" + "Land area: 51,703 sq mi (133,911 sq km); total area: 55,598 sq mi (144,000 sq km)\n" +
            "Population (2014 est.): 166,280,712 (growth rate: 1.6%); birth rate: 21.61/1000; infant mortality rate: 45.67/1000; life expectancy: 70.65\n" + "Capital and largest city (2011 est.): Dhaka, 15.391 million\n" +
            "Other large cities: Chittagong, 5.239 million; Khulna, 1.781 million; Rajshahi 932,000\n" + "Monetary unit: Taka\n"),("President: Dilma Rousseff (2011)\n" + "Land area: 3,265,059 sq mi (8,456,511 sq km); " +
            "total area: 3,286,470 sq mi (8,511,965 sq km)\n" + "Population (2012 est.): 205,716,890 (growth rate: 1.1%); birth rate: 17.48/1000; infant mortality rate: 21.820.5/1000; life expectancy: 72.79; density per sq km: 22\n" +
            "Capital (2009 est.): Brasília, 3,789,000\n" + "Largest cities: São Paulo, 19,900,000; Rio de Janeiro, 11,836,000; Salvador, 2,590,400; Belo Horizonte, 5,736,000; Recife, 1,485,500; Porto Alegre, 4,034,000\n" + "Monetary unit: Real\n")
            ,("Sovereign: Queen Elizabeth II (1952)\n" + "Governor-General: Julie Payette (2017)\n" + "Prime Minister: Justin Trudeau (2015)\n" + "Land area: 3,511,003 sq mi (9,093,507 sq km); total area: 3,855,102 sq mi (9,984,670 sq km)\n" +
            "Population (2014 est.): 34,834,841 (growth rate: 0.76%); birth rate: 10.29/1000; infant mortality rate: 4.71/1000; life expectancy: 81.67\n" + "Capital (2011 est.): Ottawa, Ontario, 1.208 million\n" +
            "Largest cities (metropolitan areas) (2011 est.): Toronto 5.573 million; Montreal 3.856 million; Vancouver 2.267 million; Calgary 1.216 million; OTTAWA (capital) 1.208 million; Edmonton 1.142 million\n" +
            "Monetary unit: Canadian dollar\n"),("President: Xi Jinping (2013)\n" + "Prime Minister: Premier Li Keqiang (2013)\n" + "Land area: 3,600,927 sq mi (9,326,411 sq km); total area:3,705,407 sq mi (9,596,960 sq km)1\n" +
            "Population (2014 est.):1,355,692,576 (growth rate: 0.44%); birth rate: 12.17/1000; infant mortality rate: 14.79/1000; life expectancy: 75.15\n" + "Capital (2011 est.): Beijing, 15.594 million\n" +
            "Largest cities: Shanghai 20.208 million; Guangzhou 10.849 million; Shenzhen 10.63 million; Chongqing 9.977 million; Wuhan 9.158 million (2011)\n" + "Monetary unit: Yuan/Renminbi\n")
            ,("President: Sauli Niinisto (2012)\n" + "Prime Minister: Juha Sipilä (2015)\n" + "Land area: 117,942 sq mi (305,470 sq km); total area: 130,558 sq mi (338,145 sq km)\n" +
            "Population (2014 est.): 5,268,799 (growth rate: 0.56%); birth rate: 10.35/1000; infant mortality rate: 3.36/1000; life expectancy: 79.69\n" + "Capital and largest city (2014 est.): Helsinki, 1.17 million\n" +
            "Other large cities: Espoo, 229,500; Tampere, 201,200; Vantaa, 189,200; Turku, 178,100\n" + "Monetary unit: Euro (formerly markka)\n")
            ,("President: François Hollande (2012)\n" + "Prime Minister: Manuel Valls (2014)\n" + "Land area: 210,668 sq mi (545,630 sq km); total area: 211,209 sq mi (547,030 sq km)\n" +
            "Population (2014 est.): 66,259,012 (growth rate: 0.45%); birth rate: 12.49/1000; infant mortality rate: 3.31/1000; life expectancy: 81.66\n" + "Capital and largest city (2014 est.): Paris, 10.764 (metro. area)\n" +
            "Other large cities: Lyon 1.597 million; Marseille-Aix-en-Provence 1.595 million; Lille 1.025 million; Nice-Cannes 961,000; Toulouse 926,000 (2014)\n" + "Monetary unit: Euro (formerly French franc)\n")
            ,("Emperor: Akihito (1989)\n" + "Prime Minister: Shinzo Abe (2012)\n" + "Land area: 140,728 sq mi (364,485 sq km); total area: 145,913 sq mi (377,915 sq km)\n" +
            "Population (2014 est.): 127,103,388 (growth rate: -0.13%); birth rate: 8.07/1000; infant mortality rate: 2.13/1000; life expectancy: 84.46\n" + "Capital and largest city (2009 est.): Tokyo, 37.217 million\n" +
            "Other large cities: Osaka-Kobe 11.494 million; Nagoya 3.328 million; Fukuoka-Kitakyushu 2.868 million; Sapporo 2.742 million; Sendai 2.428 million (2011)\n" +
            "Monetary unit: Yen\n")
            ,("Ruler: King Abdullah II (1999)\n" + "Prime Minister: Abdullah Ensour (2012)\n" + "Land area: 34,286 sq mi (88,802 sq km); total area: 34,495 sq mi (89,342 sq km) excludes West Bank\n" +
            "Population (2012 est.): 6,508,887 (growth rate: -0.965%); birth rate: 26.52/1000; infant mortality rate: 15.83/1000; life expectancy: 80.18\n" + "Capital and largest city (2009 est.): Amman, 1.088 million\n" +
            "Monetary unit: Jordanian dinar\n")};

    @Override
    public adapter_countries.countriesvh onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater2=LayoutInflater.from(parent.getContext());
        View newView = layoutinflater2.inflate(R.layout.if_topten,parent,false);
        adapter_countries.countriesvh viewholder2=new adapter_countries.countriesvh(newView);
        return viewholder2;
    }
    @Override
    public void onBindViewHolder(adapter_countries.countriesvh holder, int position) {
        holder.tv8.setText(countries[position]);
        holder.tv9.setText(countries1[position]);
    }
    @Override
    public int getItemCount() {
        return content1.length;
    }
    class countriesvh extends RecyclerView.ViewHolder {
        public TextView tv8;
        public TextView tv9;
        public countriesvh(View itemView) {
            super(itemView);
            tv8=(TextView)itemView.findViewById(R.id.txt8);
            tv9=(TextView)itemView.findViewById(R.id.txt9);
        }
    }
}
