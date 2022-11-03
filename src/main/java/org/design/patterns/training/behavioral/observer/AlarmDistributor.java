package org.design.patterns.training.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AlarmDistributor implements IAlarmObserver {
    private List<IAlarmObserver> alarmObservers = new ArrayList<>();

    public void register(IAlarmObserver alarmObserver){
        alarmObservers.add(alarmObserver);
    }


    @Override
    public void alarm(Alarm alarm) {
        for (IAlarmObserver alarmObserver:
             alarmObservers) {
            alarmObserver.alarm(alarm);
        }
    }

    @Override
    public void alarmOff() {
        for (IAlarmObserver alarmObserver:
                alarmObservers) {
            alarmObserver.alarmOff();
        }

    }
}
