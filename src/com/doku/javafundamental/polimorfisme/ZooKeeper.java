package com.doku.javafundamental.polimorfisme;

public class ZooKeeper {
    Hewan hewan;

    void kasihMakan(){
        hewan.makan();
    }

    public void setHewan(Hewan hewan) {
        this.hewan = hewan;
    }
}
