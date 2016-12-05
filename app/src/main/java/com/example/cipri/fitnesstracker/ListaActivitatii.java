package com.example.cipri.fitnesstracker;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.cipri.fitnesstracker.classes.Activitate;
import com.example.cipri.fitnesstracker.classes.ActivitateAdaptor;

import java.util.ArrayList;
import java.util.List;

public class ListaActivitatii extends AppCompatActivity {
    List<Activitate> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_activitatii);

        Activitate activitate1 = new Activitate("Alergare", 200, 1);
        Activitate activitate2 = new Activitate("Sala", 400, 2);
        Activitate activitate3 = new Activitate("Scrima", 340, 3);


        list.add(activitate1);
        list.add(activitate2);
        list.add(activitate3);

        ActivitateAdaptor adapter = new ActivitateAdaptor(
                getApplicationContext(),
                R.layout.template_activitate,
                list
        );

        ListView listView =
                (ListView)findViewById(R.id.activity_lista_activitatii);
        listView.setAdapter(adapter);
    }
}
