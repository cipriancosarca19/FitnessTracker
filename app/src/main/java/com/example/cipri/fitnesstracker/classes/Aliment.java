package com.example.cipri.fitnesstracker.classes;

/**
 * Created by Petruta Deac on 11/28/2016.
 */

public class Aliment {

    private String denumire;
    private int calorii;
    private double cantitate;

    public Aliment(String denumire, int calorii, double cantitate) {
        this.denumire = denumire;
        this.calorii = calorii;
        this.cantitate = cantitate;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getCalorii() {
        return calorii;
    }

    public double getCantitate() {
        return cantitate;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setCalorii(int calorii) {
        this.calorii = calorii;
    }

    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
    }
}
