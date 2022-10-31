package org.design.patterns.training.oo.intf;

import java.util.Scanner;

public class GreetingRun2 {
    public static final int GREETINGS_LANGUAGE_ENGLISH = 1;
    public static final int GREETINGS_LANGUAGE_TURKISH = 2;
    public static final int GREETINGS_LANGUAGE_SPANISH = 3;

    public static final int GREETINGS_NAME_LENGTH_MIN = 3;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GREETINGS_LANGUAGE_ENGLISH + "-İngilizce");
        System.out.println(GREETINGS_LANGUAGE_TURKISH + "-Türkçe");
        System.out.println(GREETINGS_LANGUAGE_SPANISH +"-İspanyolca");
        System.out.println("Seçiminiz : ");
        int index = scanner.nextInt();
        System.out.println("isminizi giriniz : ");
        String name = scanner.next();
        if (name.length() < GREETINGS_NAME_LENGTH_MIN) {
            System.out.println("Problem");
        }
        if (index == GREETINGS_LANGUAGE_ENGLISH) {
            System.out.println("Hello " + name);
            System.out.println("Goodbye " + name);
        } else if (index == GREETINGS_LANGUAGE_TURKISH) {
            System.out.println("Selam " + name);
            System.out.println("Gülegüle " + name);
        } else if (index == GREETINGS_LANGUAGE_SPANISH) {
            System.out.println("Ola " + name);
            System.out.println("Adios " + name);
        }
    }
}
