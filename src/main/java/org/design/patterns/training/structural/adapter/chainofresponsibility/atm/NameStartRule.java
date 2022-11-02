package org.design.patterns.training.structural.adapter.chainofresponsibility.atm;

import org.design.patterns.training.atm.Customer;

public class NameStartRule extends AbstractCustomerRule {

    public NameStartRule(ICustomerRule next) {
        super(next);
    }

    @Override
    void internalExecute(Customer customer) {
        String name = customer.getName();
        if (name != null && name.startsWith(":")) {
            throw new IllegalArgumentException("name : ile başlayamaz");
        }
    }
}
