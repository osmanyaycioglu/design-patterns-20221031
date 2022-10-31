package org.design.patterns.training.creational.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArabaImRun {
    public static void main(String[] args) {
        ArabaIm arabaIm = ArabaIm.getBuilder()
                                 .withIsmi("araba1")
                                 .withYakit(10)
                                 .withSpeed(180)
                                 .withModel("BMW")
                                 .build();

        Araba2 araba1 = Araba2.builder()
                              .withYakit(10)
                              .withIsmi("araba1")
                              .withSpeed(180)
                              .build();

        String str = "osman";
        str += " deneme";
        LocalDate localDate = LocalDate.now().plusDays(3);
        LocalDateTime localDateTime = LocalDateTime.now();


    }
}
