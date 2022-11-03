package org.design.patterns.training.behavioral.observer.atm;

import org.design.patterns.training.behavioral.command.IAtmCommand;

import java.util.ArrayList;
import java.util.List;

public class AtmCommandObserverDist implements IAtmCommandObserver {
    private List<IAtmCommandObserver> observers = new ArrayList<>();

    @Override
    public void commandRunSuccessFully(IAtmCommand atmCommand) {
        observers.forEach(o -> o.commandRunSuccessFully(atmCommand));
    }

    public void register(IAtmCommandObserver atmCommandObserver){
        observers.add(atmCommandObserver);
    }
}
