package com.doku.javafundamental.interfaces;

public class Kambing implements Hewan, Tumbuhan {

    @Override
    public void makan() {
        System.out.println("Kambing makan rumput dan daun..");
    }

    @Override
    public void bernafas() {
        System.out.println("huuuuffff...");
    }
}
