package org.design.patterns.training.behavioral.observer.atm;

import org.design.patterns.training.behavioral.command.IAtmCommand;

public class AtmCommandLogObserver implements IAtmCommandObserver {
    @Override
    public void commandRunSuccessFully(IAtmCommand atmCommand) {
        System.out.println("ATM Command : " + atmCommand.commandDesc() + " başarılı şekilde tamamlandı.");
    }
}
