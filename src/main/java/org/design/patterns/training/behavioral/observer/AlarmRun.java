package org.design.patterns.training.behavioral.observer;

public class AlarmRun {

    public static void main(String[] args) {
        AlarmDistributor alarmObserver = new AlarmDistributor();
        alarmObserver.register(new DoorObserver(new Door()));
        alarmObserver.register(new DoorObserver(new Door()));
        alarmObserver.register(new WindowObserver("salon 1. pençere"));
        alarmObserver.register(new WindowObserver("salon 2. pençere"));
        alarmObserver.register(new WindowObserver("koridor 1. pençere"));
        alarmObserver.register(new WindowObserver("koridor 2. pençere"));
        alarmObserver.register(new GateObserver());
        AlarmSystem alarmSystem = new AlarmSystem(alarmObserver);
        alarmSystem.run();
    }
}
