package org.design.patterns.training.creational.builder;

public class ArabaIm {
    private final int    speed;
    private final double yakit;
    private final String ismi;


    private ArabaIm(int speed,
                    double yakit,
                    String ismi) {
        this.speed = speed;
        this.yakit = yakit;
        this.ismi = ismi;
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

    public static ArabaImBuilder getBuilder(){
        return new ArabaImBuilder();
    }

    public static class ArabaImBuilder {
        private int    speed;
        private double yakit;
        private String ismi;
        private String model;

        private ArabaImBuilder() {
        }

        public int getSpeed() {
            return speed;
        }

        public ArabaImBuilder withSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public double getYakit() {
            return yakit;
        }

        public ArabaImBuilder withYakit(double yakit) {
            this.yakit = yakit;
            return this;
        }

        public String getIsmi() {
            return ismi;
        }

        public ArabaImBuilder withIsmi(String ismi) {
            this.ismi = ismi;
            return this;
        }

        public String getModel() {
            return model;
        }

        public ArabaImBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public ArabaIm build() {
            ArabaIm arabaIm = new ArabaIm(speed,
                                          yakit,
                                          ismi);
            return arabaIm;
        }
        public ArabaIm buildV1() {
            // validation
            ArabaIm arabaIm = new ArabaIm(speed,
                                          yakit,
                                          ismi);
            return arabaIm;
        }

    }
}
