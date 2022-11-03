package org.design.patterns.training.behavioral.observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alarm {
    private EAlarmType alarmType;
    private int location;
    private String desc;
}
