package org.design.patterns.training.structural.bridge.car;

public class ElecFuelType extends FuelType{

    public int getRange(int lt){
        return lt * 5;
    }

}
