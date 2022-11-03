package org.design.patterns.training.behavioral.memento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Setter
@Getter
@ToString
public class MySession {
    private String sessionId;
    private String name;

    private String data;
    private int counter;

    public void doSomething(){
        data = new Random().nextInt() + " data";
        counter++;
    }

    public SessionMemento save() {
        SessionMemento sessionMemento = new SessionMemento();
        sessionMemento.setData(data);
        sessionMemento.setCounter(counter);
        return sessionMemento;
    }

    public void restore(SessionMemento sessionMemento) {
        data = sessionMemento.getData();
        counter = sessionMemento.getCounter();
    }

}

