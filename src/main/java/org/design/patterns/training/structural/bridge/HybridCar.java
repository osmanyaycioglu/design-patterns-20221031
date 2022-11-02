package org.design.patterns.training.structural.bridge;

public class HybridCar extends Car {

    @Override
    public void fill(int lt) {
        range += lt * 8;
    }
}
