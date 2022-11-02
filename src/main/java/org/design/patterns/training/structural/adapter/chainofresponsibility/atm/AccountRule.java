package org.design.patterns.training.structural.adapter.chainofresponsibility.atm;

import org.design.patterns.training.atm.Customer;
import org.design.patterns.training.atm.EAccountType;

public class AccountRule extends AbstractCustomerRule {

    public AccountRule(ICustomerRule next) {
        super(next);
    }

    @Override
    void internalExecute(Customer customer) {
        if (customer.getAccounts() == null) {
            throw new IllegalArgumentException("accountlar yok");
        }
        if (customer.getAccounts()
                    .stream()
                    .noneMatch(account -> account.getAccountType() == EAccountType.TL)) {
            throw new IllegalArgumentException("TL hesabı yok");
        }
    }
}
