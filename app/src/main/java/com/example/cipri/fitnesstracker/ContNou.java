package com.example.cipri.fitnesstracker;

import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cipri.fitnesstracker.classes.DatabaseHelper;
import com.example.cipri.fitnesstracker.classes.Gen;
import com.example.cipri.fitnesstracker.classes.Utilizator;

public class ContNou extends AppCompatActivity {
    DatabaseHelper helper=new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cont_nou);

        Button btnTrimite=(Button)findViewById(R.id.btnTrimite);
        btnTrimite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText etNume=(EditText)findViewById(R.id.et_nume);
                EditText etPrenume=(EditText)findViewById(R.id.et_prenume);
                EditText etEmail=(EditText)findViewById(R.id.et_email);
                EditText etInaltime=(EditText)findViewById(R.id.et_inaltime);
                EditText etGreutate=(EditText)findViewById(R.id.et_greutate);
                EditText etUtilizator=(EditText)findViewById(R.id.et_nickname);
                EditText etParola=(EditText)findViewById(R.id.etParola);


                Utilizator utilizatorNou=new Utilizator(etNume.getText().toString(),etPrenume.getText().toString(),etEmail.getText().toString(), etParola.getText().toString(), etGreutate.getText().toString(), Gen.FEMININ, etInaltime.getText().toString(),etUtilizator.getText().toString());
               helper.insertUser(utilizatorNou);
                System.out.println(etInaltime);


                    Toast.makeText(getApplicationContext(),"Utilizator inregistrat cu succes!",Toast.LENGTH_SHORT).show();



            }
        });
    }
}
