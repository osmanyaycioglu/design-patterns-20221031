package org.design.patterns.training.behavioral.observer;

public class DoorObserver implements IAlarmObserver{
    private Door door;

    public DoorObserver(Door door) {
        this.door = door;
    }

    @Override
    public void alarm(Alarm alarm) {
        if (alarm.getAlarmType() == EAlarmType.FIRE){
            System.out.println("Kapıları açtım");
            door.open();
        } else {
            System.out.println("Kapıları kitledim");
            door.lock();
        }
    }

    @Override
    public void alarmOff() {
        System.out.println("kapılar kitlendi");
    }
}
