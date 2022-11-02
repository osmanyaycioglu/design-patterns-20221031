package org.design.patterns.training.behavioral.command;

import org.design.patterns.training.atm.Account;
import org.design.patterns.training.atm.Customer;

import java.math.BigDecimal;
import java.util.Scanner;

public class DepositMoneyCommand extends AbstractAtmCommand{
    public DepositMoneyCommand() {
        super("Para yatırma");
    }

    @Override
    public void execute(Customer customer,
                        Scanner scanner) {
        Account account = getAccountFromAccountList(customer, scanner);
        System.out.println("Yatıracağınız para miktarı : ");
        BigDecimal drawMoney = scanner.nextBigDecimal();
        BigDecimal amount = account.getAmount();
        account.setAmount(amount.add(drawMoney));
    }

    @Override
    public IAtmCommand cloneMe() {
        return new DepositMoneyCommand();
    }
}
