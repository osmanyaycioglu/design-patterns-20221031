package org.design.patterns.training.structural.bridge.car;

public class SportCar extends Car {

    public SportCar(FuelType fuelType,
                    CarType carType) {
        super(fuelType,carType);

    }

    public void fill(int lt) {
        super.fill(lt);
        range = (int) (range * 0.6F);
    }


    public int getRange() {
        return range;
    }
}
