package org.design.patterns.training.oo.intf;

public class GreetingImplEsp implements IGreeting {
    @Override
    public String sayHello(String name) {
        return "Ola " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        System.out.println("extra code");
        return "Adios " + name;
    }

    @Override
    public String sayGoodNight(String name) {
        return "İyi akşamlar " + name;
    }
    @Override
    public String getLanguage() {
        return "İspanyolca";
    }

}
