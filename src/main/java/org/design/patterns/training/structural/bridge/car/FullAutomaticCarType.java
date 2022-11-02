package org.design.patterns.training.structural.bridge.car;

public class FullAutomaticCarType extends CarType{

    public int getRange(int range){
        return (int) (0.9F * range);
    }
}
