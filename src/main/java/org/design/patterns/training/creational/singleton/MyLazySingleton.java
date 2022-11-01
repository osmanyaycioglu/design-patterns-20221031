package org.design.patterns.training.creational.singleton;

public class MyLazySingleton {

    private static volatile MyLazySingleton instance;

    private MyLazySingleton() {
    }

    public static MyLazySingleton getInstance() {
        if (instance == null) {
            synchronized (MyLazySingleton.class) {
                if (instance == null) {
                    instance = new MyLazySingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("some jobs");
    }
}
