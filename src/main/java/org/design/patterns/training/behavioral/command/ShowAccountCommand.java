package org.design.patterns.training.behavioral.command;

import org.design.patterns.training.atm.Account;
import org.design.patterns.training.atm.Customer;
import org.design.patterns.training.atm.EAccountType;

import java.util.List;
import java.util.Scanner;

public class ShowAccountCommand extends AbstractAtmCommand {

    public ShowAccountCommand() {
        super("Hesap görüntüleme");
    }

    @Override
    public void execute(Customer customer,
                        Scanner scanner) {
        Account account = getAccountFromAccountList(customer,scanner);
        System.out.println("account : " + account);
    }

}
