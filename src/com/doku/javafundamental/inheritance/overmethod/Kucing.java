package com.doku.javafundamental.inheritance.overmethod;

public class Kucing extends Hewan {
    public Kucing(){
        System.out.println("[inheritance] - construct Kucing");
    }

    @Override
    public void makan() { // overriding
        System.out.println("Kucing sedang makan");
    }

    public void makan(String makanan){ // overloading
        System.out.println("Kucing makan " + makanan);
    }
}
