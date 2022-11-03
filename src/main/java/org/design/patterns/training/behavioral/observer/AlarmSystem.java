package org.design.patterns.training.behavioral.observer;

public class AlarmSystem {
    private IAlarmObserver alarmObserver;

    public AlarmSystem(IAlarmObserver alarmObserver) {
        this.alarmObserver = alarmObserver;
    }

    public void run(){
        while (true){
            try {
                Thread.sleep(5_000);
            } catch (InterruptedException e) {
            }
            Alarm alarm = new Alarm();
            alarm.setAlarmType(EAlarmType.FIRE);
            alarm.setLocation(10);
            alarm.setDesc("Yangın");
            alarmObserver.alarm(alarm);
        }
    }
}
