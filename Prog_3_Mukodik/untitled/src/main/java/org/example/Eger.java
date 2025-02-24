package org.example;

public class Eger implements Cloneable
{

    private double suly;
    private boolean fiue;

    @Override
    public Eger clone() {
        Eger my_clone = new Eger(suly, fiue);
        my_clone.suly = this.suly;
        my_clone.fiue = this.fiue;
        return my_clone;
    }

    public Eger() {}

    public Eger(double suly, boolean fiue) {
        this.suly = suly;
        this.fiue = fiue;
    }


    public Double getSuly() {
        return suly;
    }


    public boolean isFiue() {
        return fiue;
    }

}
