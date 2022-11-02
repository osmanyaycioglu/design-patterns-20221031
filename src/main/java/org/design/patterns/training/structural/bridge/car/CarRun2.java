package org.design.patterns.training.structural.bridge.car;


public class CarRun2 {
    public static void main(String[] args) {
        Car car = new SportCar(new DieselFuelType(),
                               new FullAutomaticCarType());

        car.fill(20);
        System.out.println("range : " + car.getRange());

    }
}
