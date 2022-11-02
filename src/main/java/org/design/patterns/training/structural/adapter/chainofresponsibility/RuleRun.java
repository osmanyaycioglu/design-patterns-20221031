package org.design.patterns.training.structural.adapter.chainofresponsibility;

import java.util.Scanner;

public class RuleRun {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("sayı:");
            int value = scanner.nextInt();
//            if (value < 0) {
//                System.out.println("0 dan küçük");
//            } else if (value >= 0 && value < 20) {
//                System.out.println("0 ile 20 arasında");
//            } else if (value >= 20 && value < 100) {
//                System.out.println("20 ile 100 arasında");
//            } else {
//                System.out.println("100 den büyük");
//            }
//            List<ICheckNumber> checkNumbers = Arrays.asList(new CheckNumber(null,
//                                                                            0),
//                                                            new CheckNumber(0,
//                                                                            20),
//                                                            new CheckNumber(20,
//                                                                            100),
//                                                            new CheckNumber(100,
//                                                                            null)
//            );
//            for (ICheckNumber checkNumber : checkNumbers) {
//                if (checkNumber.check(value)) {
//                    break;
//                }
//            }

            ICheckNumber checkNumber = new CheckNumberChain(
                    new CheckNumberChain(
                            new CheckNumberChain(
                                    new CheckNumberChain(null,
                                                         null,
                                                         0),
                                    0,
                                    20),
                            20,
                            100),
                    100,
                    null);
            checkNumber.check(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        if (value < 10) {
//            System.out.println("10 dan küçük");
//        } else if (value >= 10 && value < 23) {
//            System.out.println("10 ile 23 arasında");
//        } else if (value >= 23 && value < 100) {
//            System.out.println("23 ile 100 arasında");
//        } else {
//            System.out.println("100 den büyük");
//        }

    }
}
