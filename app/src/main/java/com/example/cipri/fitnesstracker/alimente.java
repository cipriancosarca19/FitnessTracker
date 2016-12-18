package com.example.cipri.fitnesstracker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.cipri.fitnesstracker.classes.AducereInformatii_JSON;
import com.example.cipri.fitnesstracker.classes.Aliment;

import java.util.ArrayList;
import java.util.List;

public class Alimente extends AppCompatActivity {

    public static List<Aliment> alimente;
    ListView lv;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimente);

        Button btnAlimenteExistente=(Button)findViewById(R.id.btn_alimenteleTale);
        Button btnAlimenteNoi=(Button)findViewById(R.id.btn_alimenteNoi);

        final LinearLayout layoutAlimenteExistente=(LinearLayout)findViewById(R.id.linearLayout_alimenteleTale);
        final LinearLayout layoutAlimenteNoi=(LinearLayout)findViewById(R.id.linnearLayout_alimenteNoi);


        btnAlimenteExistente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutAlimenteExistente.setVisibility(View.VISIBLE);
                layoutAlimenteNoi.setVisibility(View.GONE);
            }
        });

        btnAlimenteNoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutAlimenteExistente.setVisibility(View.GONE);
                layoutAlimenteNoi.setVisibility(View.VISIBLE);
            }
        });


        AducereInformatii_JSON aducereInformatii_json=new AducereInformatii_JSON() {
            @Override
            protected void onPostExecute(List<Aliment> list) {
                ListView lv = (ListView) findViewById(R.id.lv_alimente);

                AdapterAlimente adapterAlimente=new AdapterAlimente(getApplicationContext(),list);
                lv.setAdapter(adapterAlimente);



            }
        };
   //  ArrayList<Aliment> alimente=new ArrayList<Aliment>();
//        alimente.add(new Aliment("banana",12,12));
//        alimente.add(new Aliment("mar",12,12));
//        alimente.add(new Aliment("capsuna",12,12));
//    AdapterAlimente adapterAlimente=new AdapterAlimente(this,alimente);
//
//        ListView listView=(ListView)findViewById(R.id.lv_alimente);
//        listView.setAdapter(adapterAlimente);

        aducereInformatii_json.execute("http://www.mocky.io/v2/58466fab1100005c28f3cb39");

    }
}
