package com.example.cipri.fitnesstracker.classes;

import java.sql.Time;
import java.util.List;

/**
 Created by Cipri on 02.12.2016.
 */

public class Activitate {
    private String denumire;
    private int calorii;
    private int durata;

    public Activitate(){}
    public Activitate(String denumire, int calorii, int durata){
        this.denumire=denumire;
        this.calorii=calorii;
        this.durata=durata;
    }

    public String getDenumire() {
        return this.denumire;
    }

    public int getCalorii() {
        return this.calorii;
    }

    public int getDurata() {
        return this.durata;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setCalorii(int calorii) {
        this.calorii = calorii;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }


}
