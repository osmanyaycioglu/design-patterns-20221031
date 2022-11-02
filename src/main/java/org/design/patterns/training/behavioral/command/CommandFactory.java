package org.design.patterns.training.behavioral.command;

import org.design.patterns.training.structural.proxy.AtmCommandProxy;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {

    private List<IAtmCommand> atmCommands = new ArrayList<>();

    public CommandFactory() {
        this.atmCommands.add(new ShowAccountCommand());
        this.atmCommands.add(new DepositMoneyCommand());
        this.atmCommands.add(new WithDrawMoneyCommand());
        this.atmCommands.add(new PrintCustomerCommand());
    }

    public List<IAtmCommand> getAtmCommands(){
        List<IAtmCommand> commands = new ArrayList<>();
        for (int i = 0; i < atmCommands.size(); i++) {
            commands.add(getCommand(i));
        }
        return commands;
    }

    public IAtmCommand getCommand(int index){
        if (index > atmCommands.size()){
            return null;
        }
        return new AtmCommandProxy(atmCommands.get(index - 1).cloneMe());
    }
}
