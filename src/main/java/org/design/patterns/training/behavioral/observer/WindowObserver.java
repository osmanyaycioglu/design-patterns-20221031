package org.design.patterns.training.behavioral.observer;

public class WindowObserver implements IAlarmObserver{

    private String name;

    public WindowObserver(String name) {

        this.name = name;
    }

    @Override
    public void alarm(Alarm alarm) {
        if (alarm.getAlarmType() == EAlarmType.FIRE){
            System.out.println(name + " Pencereyi açtım");
        } else {
            System.out.println(name + " Pencereyi kitledim");
        }
    }

    @Override
    public void alarmOff() {
        System.out.println("Pencereler kitlendi");
    }
}
