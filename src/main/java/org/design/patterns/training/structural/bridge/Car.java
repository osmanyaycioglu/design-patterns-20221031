package org.design.patterns.training.structural.bridge;

public class Car {
    protected int range;

    public void fill(int lt){
        range += lt * 10;
    }

    public void forward(int km) {
        if (range > km) {
            System.out.println(km + " forward");
            range = range - km;
        } else {
            range = 0;
            System.out.println(range + " forward");
        }
    }

    public int getRange() {
        return range;
    }
}
