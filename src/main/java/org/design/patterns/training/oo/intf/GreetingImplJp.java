package org.design.patterns.training.oo.intf;

public class GreetingImplJp implements IGreeting {
    @Override
    public String sayHello(String name) {
        return "HA " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        System.out.println("extra code");
        return "HO " + name;
    }

    @Override
    public String sayGoodNight(String name) {
        return "İyi akşamlar " + name;
    }
    @Override
    public String getLanguage() {
        return "Japonca";
    }

}
