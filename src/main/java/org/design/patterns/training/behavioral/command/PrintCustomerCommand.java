package org.design.patterns.training.behavioral.command;

import org.design.patterns.training.creational.builder.adapter.atm.AtmManager;
import org.design.patterns.training.creational.builder.adapter.atm.Customer;
import org.design.patterns.training.creational.builder.adapter.CustomerToEmployeeAdapter;

import java.util.Scanner;

public class PrintCustomerCommand extends AbstractAtmCommand {

    public PrintCustomerCommand() {
        super("Kredi Kartı basımı");
    }

    @Override
    public void execute(Customer customer,
                        Scanner scanner) {
        AtmManager.getInstance().print(new CustomerToEmployeeAdapter(customer));
    }
    @Override
    public IAtmCommand clone() {
        return new PrintCustomerCommand();
    }


}
