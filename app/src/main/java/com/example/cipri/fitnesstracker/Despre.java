package com.example.cipri.fitnesstracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Despre extends AppCompatActivity {

    List<String> dezvoltatori=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despre);



        dezvoltatori.add("Cosarca Ciprian");
        dezvoltatori.add("Deac Petruta");
        dezvoltatori.add("Dancu Diana");

        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dezvoltatori);
        //ListView listView=(ListView)findViewById(R.id.listDezvoltatori);
      //  listView.setAdapter(arrayAdapter);


    }
}
