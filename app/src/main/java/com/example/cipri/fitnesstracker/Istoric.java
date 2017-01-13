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
ListaActivitatii.list.get(1).getCalorii();
        BarChart chart = (BarChart)findViewById(R.id.barChart);
        chart.addValue(ListaActivitatii.list.get(1).getCalorii());
        chart.addValue(2);
        chart.addValue(6);
        chart.addValue(8);
        chart.addValue(4);
        chart.addValue(9);
        chart.invalidate();
    }

}
