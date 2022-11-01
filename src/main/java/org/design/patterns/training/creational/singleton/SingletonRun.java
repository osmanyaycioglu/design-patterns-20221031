package org.design.patterns.training.creational.singleton;

public class SingletonRun {
    public static void main(String[] args) {
        MyLazySingleton.getInstance().doSomething();
        MySingleton.getInstance().doSomething();
        MyEnumSingleton.instance.doSomething();
    }
}
