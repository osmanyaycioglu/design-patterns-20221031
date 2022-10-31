package org.design.patterns.training.oo;

public class ArabaImmutable {

    private final int    speed;
    private final double yakit;
    private final String ismi;
    private       String model;


    public ArabaImmutable(int speed,
                          double yakit,
                          String ismi) {
        this.speed = speed;
        this.yakit = yakit;
        this.ismi = ismi;
    }

    public ArabaImmutable(int speed,
                          double yakit,
                          String ismi,
                          String model) {
        this.speed = speed;
        this.yakit = yakit;
        this.ismi = ismi;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public double getYakit() {
        return yakit;
    }

    public String getIsmi() {
        return ismi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
