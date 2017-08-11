package com.realdolmen.ood020.factorymethod;

public class Bike extends Vehicle {

    boolean sidecar;

    public Bike(int p, String r, boolean sidecar) {
        super(p, r);
        this.sidecar = sidecar;
    }


}
