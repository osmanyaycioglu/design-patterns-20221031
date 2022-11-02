package org.design.patterns.training.structural.bridge;

public class FullAutomaticCar extends Car {

    @Override
    public void fill(int lt) {
        super.fill(lt);
        range *= 0.9F;
    }
}
