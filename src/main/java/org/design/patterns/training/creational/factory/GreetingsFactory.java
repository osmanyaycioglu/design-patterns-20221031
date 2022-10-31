package org.design.patterns.training.creational.factory;

import org.design.patterns.training.oo.intf.*;

import java.util.ArrayList;
import java.util.List;

public class GreetingsFactory {

    private static List<IGreeting> greetings = new ArrayList<>();

    static {
        greetings.add(new GreetingImpl());
        greetings.add(new GreetingImplTr());
        greetings.add(new GreetingImplEsp());
        greetings.add(new GreetingImplJp());
    }

    public static IGreeting createGreetings(int index) {
        if (index > greetings.size()) {
            return greetings.get(0);
        }
        return greetings.get(index - 1);
    }

    public static void showMenu() {
        int index = 1;
        for (IGreeting greeting : greetings) {
            System.out.println(index + "-" + greeting.getLanguage());
        }
        System.out.println("Seçiminiz : ");

    }
}
