package org.design.patterns.training.behavioral.mediator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Message {
    private String msgText;
    private int msgType;
}
