package org.design.patterns.training.structural.adapter.chainofresponsibility.atm;

import org.design.patterns.training.atm.Customer;

public class NameRule extends AbstractCustomerRule {

    public NameRule(ICustomerRule next) {
        super(next);
    }

    @Override
    void internalExecute(Customer customer) {
        String name = customer.getName();
        if (name == null){
            throw new IllegalArgumentException("name null olamaz");
        }
    }
}
