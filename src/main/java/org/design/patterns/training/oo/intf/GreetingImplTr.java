package org.design.patterns.training.oo.intf;

public class GreetingImplTr implements IGreeting {
    @Override
    public String sayHello(String name) {
        return "Selam " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        System.out.println("extra code");
        return "Güle güle " + name;
    }

    @Override
    public String sayGoodNight(String name) {
        return "İyi akşamlar " + name;
    }

    @Override
    public String getLanguage() {
        return "Turkish";
    }
}
