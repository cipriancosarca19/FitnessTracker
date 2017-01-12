package com.example.cipri.fitnesstracker;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cipri.fitnesstracker.classes.DatabaseHelper;
import com.example.cipri.fitnesstracker.classes.Utilizator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper helper=new DatabaseHelper(this);


    Button inregistrare;
    Button logare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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


                String parolaUser=helper.searchPassword(user.getText().toString());
                System.out.println("parola e"+parolaUser);

                if (parolaUser.equals(parola.getText().toString()))
                {
                    Intent intent=new Intent(v.getContext(),Meniu.class);
                    startActivity(intent);
                }
                else
                {

                    Toast.makeText(getApplicationContext(),"Parola incorecta"+parolaUser+parola.toString(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
