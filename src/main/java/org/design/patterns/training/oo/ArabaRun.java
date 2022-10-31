package org.design.patterns.training.oo;

import java.util.function.Supplier;

public class ArabaRun {

    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.setSpeed(10);

        Harita harita = new Harita();
        System.out.println("focus dağıt");
        harita.setName("akdeniz");
        int y = 10;
        harita.setOlcek(10000);

        Harita harita1 = Harita.createHarita()
                               .setName("akdeniz")
                               .setOlcek(10_000);

        Supplier<Harita> supplier = () -> {
            Harita harita2 = new Harita();
            harita2.setName("akdeniz");
            harita2.setOlcek(10000);
            return harita2;
        };

        Supplier<Harita> supplier2 = () -> Harita.createHarita()
                                                 .setName("akdeniz")
                                                 .setOlcek(10_000);

        ArabaImmutable arabaImmutable = new ArabaImmutable(180,
                                                           10,
                                                           "araba1");
    }

}
