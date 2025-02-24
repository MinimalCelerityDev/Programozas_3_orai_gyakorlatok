package org.example;

public class Macska implements Cloneable {

    private String nev;
    private int labakSzama;
    private String szin;
    private double ehsegSzint;

    //klonozasbol kettő darab fajta van, a sekély klonozoas == shallow copy = a ref-kat is sim =-gel másolom
    // a mély klonozás = deep copy = a ref-kat klónozást másolom

    @Override
    public Macska clone()  {

        Macska my_clone = new Macska(nev, labakSzama);
        my_clone.nev = this.nev;
        my_clone.labakSzama = this.labakSzama;
        my_clone.szin = this.szin;
        my_clone.ehsegSzint = this.ehsegSzint;
        return my_clone;

    }

    public Macska() {}

    public Macska(String nev, int labakSzama) {
        this.nev = nev;
        this.labakSzama = labakSzama;


    }
    public String getNev() {

        return nev;

    }
    public int getLabakSzama() {

        return labakSzama;

    }


    public void setNev(String nev) {
        this.nev = nev;

    }

}
