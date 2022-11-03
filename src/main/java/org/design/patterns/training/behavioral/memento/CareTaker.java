package org.design.patterns.training.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<SessionMemento> sessionMementos = new ArrayList<>();
    private MySession            mySession;

    public CareTaker(MySession mySession) {
        this.mySession = mySession;
    }

    public void save() {
        sessionMementos.add(mySession.save());
    }

    public void undo() {
        mySession.restore(sessionMementos.remove(sessionMementos.size() - 1));
    }

    public void restore(int index) {
        mySession.restore(sessionMementos.get(index));
    }

}
