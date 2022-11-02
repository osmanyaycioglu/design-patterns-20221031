package org.design.patterns.training.structural.bridge.car;

public class AutomaticCarType extends CarType{

    public int getRange(int range){
        return (int) (0.8F * range);
    }
}
