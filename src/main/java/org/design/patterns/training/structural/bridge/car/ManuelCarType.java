package org.design.patterns.training.structural.bridge.car;

public class ManuelCarType extends CarType{

    public int getRange(int range){
        return (int) (1.1F * range);
    }
}
