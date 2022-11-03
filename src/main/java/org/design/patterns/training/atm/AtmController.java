package org.design.patterns.training.atm;

import org.design.patterns.training.behavioral.command.CommandFactory;
import org.design.patterns.training.behavioral.command.IAtmCommand;
import org.design.patterns.training.behavioral.chainofresponsibility.atm.AccountRule;
import org.design.patterns.training.behavioral.chainofresponsibility.atm.ICustomerRule;
import org.design.patterns.training.behavioral.chainofresponsibility.atm.NameRule;
import org.design.patterns.training.behavioral.chainofresponsibility.atm.NameStartRule;
import org.design.patterns.training.structural.facade.atm.CustomerManagementFacade;

import java.util.List;
import java.util.Scanner;

public class AtmController {

    private CommandFactory commandFactory = new CommandFactory();
    private List<IAtmCommand> atmCommands;
    private ICustomerRule customerRule;
    private CustomerManagementFacade customerManagementFacade = new CustomerManagementFacade();

    public AtmController() {
        atmCommands = commandFactory.getAtmCommands();
        customerRule = new AccountRule(new NameRule(new NameStartRule(null)));
    }

    public Customer login(Scanner scanner) {
        System.out.println("username:");
        String username = scanner.nextLine();
        System.out.println("password:");
        String password = scanner.nextLine();

        Customer customer = CustomerCache.getInstance()
                                         .getCustomer(username);
        if (customer != null){
            customerRule.execute(customer);
        }
        return customer;

    }

    public void addCustomer(Customer customer){
        customerManagementFacade.provisionCustomer(customer);
    }

    public void showMenu() {
        int index = 1;
        for (IAtmCommand ac : atmCommands) {
            System.out.println((index++) + "-" + ac.commandDesc());
        }
    }

    public IAtmCommand getCommand(int i) {
        return atmCommands.get(i);
    }

    public CustomerManagementFacade getCustomerManagementFacade() {
        return customerManagementFacade;
    }
}
