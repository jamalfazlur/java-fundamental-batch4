package com.doku.javafundamental.abstraction;

import com.doku.javafundamental.interfaces.Tumbuhan;

public abstract class Hewan implements Tumbuhan {
    public Hewan(){
        System.out.println("[abtract] - construct Hewan");
    }
    abstract void bersuara();
    abstract void makan();

    void berjalan(){
        System.out.println("saya berlari...");
    }
}
