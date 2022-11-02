package org.design.patterns.training.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class GoodDuck implements DuckType{
    @Override
    public void duck() {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        if (i > 40) {
            System.out.println("vurulmadım");
        } else {
            System.out.println("vuruldum");
        }

    }
}
