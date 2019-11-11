package com.doku.javafundamental.abstraction;

public class Main {
    public static void main(String[] args) {
        //Hewan hewan = new Hewan(); -> Hewan is abstract; cannot be instantiated;
        Macan macan = new Macan();
        macan.bersuara();
        macan.makan();
    }
}
