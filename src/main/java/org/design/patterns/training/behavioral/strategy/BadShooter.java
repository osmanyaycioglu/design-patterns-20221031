package org.design.patterns.training.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class BadShooter implements ShootingType{
    @Override
    public void shoot() {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        if (i > 70) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }
}
