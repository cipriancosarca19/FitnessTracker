package com.example.cipri.fitnesstracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cipri.fitnesstracker.classes.Activitate;

public class AdaugaActivitate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adauga_activitate);

Button adauga;
        adauga=(Button)findViewById(R.id.buttonadauga);
        adauga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u;
                int c;
                int du;
                EditText Denumire   = (EditText)findViewById(R.id.editText1a);

                EditText Calorii   = (EditText)findViewById(R.id.editText3a);

                EditText Durata   = (EditText)findViewById(R.id.editText2a);




                    u = Denumire.getText().toString();
                if(TextUtils.isDigitsOnly(Calorii.getText())) {
                    c = Integer.parseInt(Calorii.getText().toString());}else{ Toast.makeText(getApplicationContext(), "Introducere numerica!", Toast.LENGTH_SHORT).show();
                c=0;}

                if(TextUtils.isDigitsOnly(Durata.getText())) {
                    du = Integer.parseInt(Durata.getText().toString());}else{ Toast.makeText(getApplicationContext(), "Introducere numerica!", Toast.LENGTH_SHORT).show();
                du=0;}

                if(u.equals("") || c==0 || du==0) {
                    Toast.makeText(getApplicationContext(), "Completati toate campurile!", Toast.LENGTH_SHORT).show();

                } else {Activitate a = new Activitate(u, c, du);

                    ListaActivitatii.list.add(a);

                    Toast.makeText(getApplicationContext(), "Activitate adaugata!", Toast.LENGTH_SHORT).show();}


            }
        });
Button cancel;
        cancel=(Button)findViewById(R.id.buttoncancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),Meniu.class);
                startActivity(intent);
            }
        });


    }
}
