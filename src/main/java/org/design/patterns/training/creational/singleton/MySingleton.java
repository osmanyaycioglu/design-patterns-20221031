package org.design.patterns.training.creational.singleton;

public class MySingleton {

    private static MySingleton instance = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("some jobs");
    }
}
