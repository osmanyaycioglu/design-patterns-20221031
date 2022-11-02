package org.design.patterns.training.structural.bridge.car;

public class Car {
    protected int      range;
    protected   FuelType fuelType;
    protected   CarType  carType;

    public Car(FuelType fuelType,
               CarType carType) {
        this.fuelType = fuelType;
        this.carType = carType;
    }

    public void fill(int lt) {
        range += fuelType.getRange(lt);
        range = carType.getRange(range);
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
