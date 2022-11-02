package org.design.patterns.training.structural.chainofresponsibility.atm;

import org.design.patterns.training.atm.Customer;
import org.design.patterns.training.structural.chainofresponsibility.ICheckNumber;

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
