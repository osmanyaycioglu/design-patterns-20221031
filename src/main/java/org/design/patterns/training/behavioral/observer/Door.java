package org.design.patterns.training.behavioral.observer;

public class Door {
    public void lock(){
        System.out.println("Kapı kitlendi");
    }
    public void open() {
        System.out.println("Kapı açıldı");
    }
}
