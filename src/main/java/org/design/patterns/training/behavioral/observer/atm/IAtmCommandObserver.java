package org.design.patterns.training.behavioral.observer.atm;

import org.design.patterns.training.behavioral.command.IAtmCommand;

public interface IAtmCommandObserver {
    void commandRunSuccessFully(IAtmCommand atmCommand);
}
