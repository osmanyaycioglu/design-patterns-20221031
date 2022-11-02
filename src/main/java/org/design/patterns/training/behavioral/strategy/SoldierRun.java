package org.design.patterns.training.behavioral.strategy;

public class SoldierRun {
    public static void main(String[] args) {
        Soldier soldier = new Soldier(new BadShooter(),
                                      new AgileDuck());
        soldier.shoot();
        soldier.duck();
    }
}
