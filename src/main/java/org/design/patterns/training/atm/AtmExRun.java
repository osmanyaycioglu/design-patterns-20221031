package org.design.patterns.training.atm;

public class AtmExRun {
    public static void main(String[] args) {
        AtmController atmController = new AtmController();
        AtmEx atmEx = new AtmEx(atmController);

        atmEx.run();
    }
}
