package org.design.patterns.training.behavioral.strategy.atm;

import org.design.patterns.training.behavioral.command.IAtmCommand;

public class AtmCommandAuditObserver implements IAtmCommandObserver {
    @Override
    public void commandRunSuccessFully(IAtmCommand atmCommand) {
        System.out.println("Audit ATM Command : " + atmCommand.commandDesc() + " başarılı şekilde tamamlandı.");
    }
}
