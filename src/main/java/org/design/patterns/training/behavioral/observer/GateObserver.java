package org.design.patterns.training.behavioral.observer;

public class GateObserver implements IAlarmObserver{

    public GateObserver() {

    }

    @Override
    public void alarm(Alarm alarm) {
        if (alarm.getAlarmType() == EAlarmType.FIRE){
            System.out.println("Dış kapıyı açtım");
        } else {
            System.out.println("Dış kapıyı kitledim");
        }
    }

    @Override
    public void alarmOff() {
        System.out.println("Dış kapı kitlendi");
    }
}
