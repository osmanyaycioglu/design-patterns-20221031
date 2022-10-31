package org.design.patterns.training.oo.intf;

import org.design.patterns.training.creational.factory.GreetingsFactory;

import java.util.Scanner;

public class GreetingRun {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        IGreeting greeting = GreetingsFactory.createGreetings(index);

        System.out.println("isminizi giriniz : ");
        String name = scanner.nextLine();
        String sayHello = greeting.sayHello(name);
        String sayGoodbye = greeting.sayGoodbye(name);
        System.out.println(sayHello);
        System.out.println(sayGoodbye);


    }
}
