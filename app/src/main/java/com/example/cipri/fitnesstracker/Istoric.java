package com.example.cipri.fitnesstracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cipri.fitnesstracker.classes.BarChart;


public class Istoric extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istoric);
    }

    protected void onStart() {
        super.onStart();

        BarChart chart = (BarChart) findViewById(R.id.barChart);
        for (int i = 0; i < ListaActivitatii.list.size(); i++) {

            chart.addValue(ListaActivitatii.list.get(i).getCalorii());


        }
    }

}
