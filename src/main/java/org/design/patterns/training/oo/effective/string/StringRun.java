package org.design.patterns.training.oo.effective.string;

import org.design.patterns.training.oo.Araba;

public class StringRun {

    public static void main(String[] args) {
        String str = "osman";
        int intVal = 100;

        Araba araba = new Araba();


        String s = str + " " + intVal + " " + (araba == null ? "null" : araba.toString());
        s += s + " xyz";

        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            s += " " + i;
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));
        StringBuilder stringBuilder = new StringBuilder();
        delta = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            stringBuilder.append(" ")
                         .append(i);
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            test(str + " " + intVal,
                 10);
        }
        System.out.println("DeltaX : " + (System.currentTimeMillis() - delta));
        int level = 10;
        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            if (level > 20) {
                test(str + " " + intVal,
                     level);
            }
        }
        System.out.println("DeltaX2 : " + (System.currentTimeMillis() - delta));
        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            String.format("%s %d",str,intVal);
        }
        System.out.println("DeltaX4 : " + (System.currentTimeMillis() - delta));
    }

    public static void test(String str,
                            int level) {
        if (level > 20) {
            System.out.println(str);
        }
    }

}
