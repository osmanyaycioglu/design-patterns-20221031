package org.design.patterns.training.behavioral.command;

import org.design.patterns.training.creational.builder.adapter.atm.Account;
import org.design.patterns.training.creational.builder.adapter.atm.Customer;

import java.math.BigDecimal;
import java.util.Scanner;

public class WithDrawMoneyCommand extends AbstractAtmCommand{
    public WithDrawMoneyCommand() {
        super("Para çekme");
    }

    @Override
    public void execute(Customer customer,
                        Scanner scanner) {
        Account account = getAccountFromAccountList(customer, scanner);
        System.out.println("Çekeceğiniz para miktarı : ");
        BigDecimal drawMoney = scanner.nextBigDecimal();
        BigDecimal amount = account.getAmount();
        account.setAmount(amount.subtract(drawMoney));
    }

    @Override
    public IAtmCommand clone() {
        return new WithDrawMoneyCommand();
    }

}
