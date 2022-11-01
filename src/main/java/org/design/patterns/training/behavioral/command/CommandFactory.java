package org.design.patterns.training.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {

    private List<IAtmCommand> atmCommands = new ArrayList<>();

    public CommandFactory() {
        this.atmCommands.add(new ShowAccountCommand());
        this.atmCommands.add(new DepositMoneyCommand());
        this.atmCommands.add(new WithDrawMoneyCommand());
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
        return atmCommands.get(index - 1);
    }
}
