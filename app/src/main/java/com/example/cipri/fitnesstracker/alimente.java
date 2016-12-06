package com.example.cipri.fitnesstracker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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


        alimente=new ArrayList<Aliment>();
        alimente.add(new Aliment("Banana",200,200));
        alimente.add(new Aliment("Apple",200,200));
        alimente.add(new Aliment("Berry",200,200));

        lv=(ListView)findViewById(R.id.listaAlimente);
        List<String> denumiri=new ArrayList<String>();
        List<Integer> calorii=new ArrayList<Integer>();
        for (Aliment a:alimente)
        {
            denumiri.add(a.getDenumire().toString());
            calorii.add(a.getCalorii());
        }
        context=this;
        lv.setAdapter(new AdapterAlimente(this,denumiri,calorii));




    }
}
