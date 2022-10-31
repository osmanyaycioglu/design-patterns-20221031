package org.design.patterns.training.creational.builder;

public class ArabaInfo {
    private String  model;
    private ArabaIm arabaIm;

    public ArabaInfo(ArabaIm arabaIm) {
        this.arabaIm = arabaIm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArabaIm getArabaIm() {
        return arabaIm;
    }
}
