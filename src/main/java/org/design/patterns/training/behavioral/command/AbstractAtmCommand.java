package org.design.patterns.training.behavioral.command;

import org.design.patterns.training.atm.Account;
import org.design.patterns.training.atm.Customer;

import java.util.List;
import java.util.Scanner;

public abstract class AbstractAtmCommand implements IAtmCommand {

    protected String commandDesc;

    public AbstractAtmCommand(String commandDesc) {
        this.commandDesc = commandDesc;
    }

    public Account getAccountFromAccountList(Customer customer,
                                             Scanner scanner) {
        List<Account> accounts = customer.getAccounts();
        int index = 1;
        for (Account account :
                accounts) {
            System.out.println(index + "-" + account.getAccountType()
                                                    .getAccountDesc());
            index++;
        }
        System.out.println("seçiminiz");
        int i = scanner.nextInt();
        Account account = accounts.get(i - 1);
        return account;

    }

    @Override
    public String commandDesc() {
        return commandDesc;
    }


}
