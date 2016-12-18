package com.example.cipri.fitnesstracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Meniu extends AppCompatActivity {

    Button despre;
    Button masa;
    Button site;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meniu);

        despre=(Button)findViewById(R.id.btnDespre);
        despre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),Despre.class);
                startActivity(intent);
            }
        });
        masa=(Button)findViewById(R.id.btnMasa);
        masa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),Masa.class);
                startActivity(intent);
            }
        });

        site=(Button)findViewById(R.id.btnFitnessTrackerSite);
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),FitnessTrackerSite.class);
                startActivity(intent);
            }
        });
    }
}

