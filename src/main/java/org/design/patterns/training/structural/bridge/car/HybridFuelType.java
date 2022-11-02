package org.design.patterns.training.structural.bridge.car;

public class HybridFuelType extends FuelType{

    public int getRange(int lt){
        return lt * 8;
    }

}
