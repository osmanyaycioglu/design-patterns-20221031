package org.design.patterns.training.structural.bridge;

public class ManuelCar extends Car {

    @Override
    public void fill(int lt) {
        super.fill(lt);
        range *= 1.1F;
    }
}
