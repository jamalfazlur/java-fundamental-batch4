package com.doku.javafundamental.abstraction;

public abstract class Hewan {
    public Hewan(){
        System.out.println("[abtract] - construct Hewan");
    }
    abstract void bersuara();
    abstract void makan();
}
