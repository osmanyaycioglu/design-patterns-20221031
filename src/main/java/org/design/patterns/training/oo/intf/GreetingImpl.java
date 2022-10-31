package org.design.patterns.training.oo.intf;

public class GreetingImpl implements IGreeting {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        System.out.println("extra code");
        return "Goodbye " + name;
    }

    @Override
    public String sayGoodNight(String name) {
        return "Good night " + name;
    }
    @Override
    public String getLanguage() {
        return "İngilizce";
    }

}
