package org.design.patterns.training.behavioral.memento;

import java.util.UUID;

public class MementoRun {
    public static void main(String[] args) {

        MySession mySession = new MySession();
        mySession.setName("session1");
        mySession.setSessionId(UUID.randomUUID().toString());
        mySession.setData("initial data");
        mySession.doSomething();
        CareTaker careTaker = new CareTaker(mySession);
        System.out.println("Current : " + mySession);
        careTaker.save();

        mySession.doSomething();
        System.out.println("Current : " + mySession);
        careTaker.save();

        mySession.doSomething();
        System.out.println("Current : " + mySession);
        careTaker.save();

        System.out.println("-----------------");
        careTaker.undo();
        System.out.println("Backup : " + mySession);
        careTaker.undo();
        System.out.println("Backup : " + mySession);
        careTaker.undo();
        System.out.println("Backup : " + mySession);

    }
}
