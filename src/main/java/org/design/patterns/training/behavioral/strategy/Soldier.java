package org.design.patterns.training.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class Soldier {
    private ShootingType shootingType;
    private DuckType duckType;

    public Soldier(ShootingType shootingType,
                   DuckType duckType) {
        this.shootingType = shootingType;
        this.duckType = duckType;
    }

    public void shoot(){
        shootingType.shoot();
    }

    public void duck(){
        duckType.duck();
    }


}
