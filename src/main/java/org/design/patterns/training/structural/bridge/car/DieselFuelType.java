package org.design.patterns.training.structural.bridge.car;

public class DieselFuelType extends FuelType{

    public int getRange(int lt){
        return lt * 15;
    }

}
