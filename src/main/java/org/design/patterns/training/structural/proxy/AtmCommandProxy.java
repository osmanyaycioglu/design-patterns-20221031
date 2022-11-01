package org.design.patterns.training.structural.proxy;

import org.design.patterns.training.creational.builder.adapter.atm.Customer;
import org.design.patterns.training.behavioral.command.IAtmCommand;

import java.util.Scanner;

public class AtmCommandProxy implements IAtmCommand {
    private IAtmCommand iAtmCommand;

    public AtmCommandProxy(IAtmCommand iAtmCommand) {
        this.iAtmCommand = iAtmCommand;
    }


    @Override
    public void execute(Customer customer,
                        Scanner scanner) {
        System.out.println("****" + iAtmCommand.commandDesc() + " komutu " + customer + " için çalıştırılıyor");
        iAtmCommand.execute(customer,scanner);
    }

    @Override
    public String commandDesc() {
        return iAtmCommand.commandDesc();
    }
}
