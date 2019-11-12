package com.doku.javafundamental.abstraction;

public class Macan extends Hewan {
    public Macan(){
        System.out.println("[abtract] - construct Macan");
    }
    @Override
    void bersuara() {
        System.out.println("Roooaaaarrrrr...");
    }

    @Override
    void makan() {
        System.out.println("Nyaamm.. nyaamm.. nyaaamm...");
    }

    @Override
    void berjalan() {
        //super.berjalan();
        System.out.println("Macan berlari kaliii..");
    }

    @Override
    public void bernafas() {

    }
}
