package com.example.cipri.fitnesstracker;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.cipri.fitnesstracker.classes.Activitate;
import com.example.cipri.fitnesstracker.classes.ActivitateAdaptor;

import java.util.ArrayList;
import java.util.List;

public class ListaActivitatii extends AppCompatActivity {
   static   List<Activitate> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_activitatii);

        Activitate activitate1 = new Activitate("Alergare", 200, 1);
        Activitate activitate2 = new Activitate("Sala", 400, 2);
        Activitate activitate3 = new Activitate("Scrima", 340, 3);
        Activitate activitate4 = new Activitate("Banda", 340, 3);


        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(!prefs.getBoolean("firstTime", false)) {

            list.add(activitate1);
            list.add(activitate2);
            list.add(activitate3);
            list.add(activitate4);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstTime", true);
            editor.commit();
        }


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
