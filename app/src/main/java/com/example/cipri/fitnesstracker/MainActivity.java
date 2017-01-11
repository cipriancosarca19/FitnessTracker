package com.example.cipri.fitnesstracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cipri.fitnesstracker.classes.Utilizator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

public static List<Utilizator> utilizatori=new ArrayList<>();


    Button inregistrare;
    Button logare;

    public boolean validareUtilizator(String utilizator,String parola)
    {
        boolean validare=false;
       for (Utilizator u:utilizatori)
       {
           if (u.getNumeUtilizator().equals(utilizator)&&u.getParola().equals(parola))
               validare=true;
       }
        return validare;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_login);
        Utilizator petruta=new Utilizator();
        petruta.setNumeUtilizator("user");
        petruta.setParola("parola");
        utilizatori.add(petruta);

        inregistrare=(Button)findViewById(R.id.btnContNou);
        inregistrare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),ContNou.class);
                startActivity(intent);
            }
        });

        logare=(Button)findViewById(R.id.btnLogare);
        logare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText user=(EditText)findViewById(R.id.et_nume);
                EditText parola=(EditText)findViewById(R.id.et_parola);
                if (validareUtilizator(user.getText().toString(),parola.getText().toString()))
                {
                    Intent intent=new Intent(v.getContext(),Meniu.class);
                    startActivity(intent);
                }

            }
        });
    }
}
