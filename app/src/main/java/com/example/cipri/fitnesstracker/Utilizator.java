package com.example.cipri.fitnesstracker;

/**
 * Created by Petruta Deac on 11/27/2016.
 */

public class Utilizator {

    private String nume;
    private String prenume;
    private String email;
    private String parola;
    private String greutate;
    private Gen gen;
    private String inaltime;
    private String numeUtilizator;
    public void setNumeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
    }


    public String getNumeUtilizator() {
        return numeUtilizator;
    }



    public Utilizator(String nume, String prenume, String email, String parola, String greutate, Gen gen, String inaltime,String numeUtilizator) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.parola = parola;
        this.greutate = greutate;
        this.gen = gen;
        this.inaltime = inaltime;
        this.numeUtilizator=numeUtilizator;
    }

    public Utilizator()
    {

    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setGreutate(String greutate) {
        this.greutate = greutate;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }

    public void setInaltime(String inaltime) {
        this.inaltime = inaltime;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getParola() {
        return parola;
    }

    public String getEmail() {
        return email;
    }

    public String getGreutate() {
        return greutate;
    }

    public Gen getGen() {
        return gen;
    }

    public String getInaltime() {
        return inaltime;
    }
}
