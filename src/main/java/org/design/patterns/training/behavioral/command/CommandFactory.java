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

    public void showMenu() {
        int index = 1;
        for (IAtmCommand ac : atmCommands) {
            System.out.println((index++) + "-" + ac.commandDesc());
        }
    }

    public IAtmCommand getCommand(int index){
        if (index > atmCommands.size()){
            return null;
        }
        return new AtmCommandProxy(atmCommands.get(index - 1).clone());
    }
}
