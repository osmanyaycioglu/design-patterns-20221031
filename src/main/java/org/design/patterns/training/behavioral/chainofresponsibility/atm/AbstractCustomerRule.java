package org.design.patterns.training.behavioral.chainofresponsibility.atm;

import org.design.patterns.training.atm.Customer;

public abstract class AbstractCustomerRule implements ICustomerRule {
    private ICustomerRule next;

    public AbstractCustomerRule(ICustomerRule next) {
        this.next = next;
    }

    abstract void internalExecute(Customer customer);

    @Override
    public void execute(Customer customer) {
        internalExecute(customer);
        if (next != null){
            next.execute(customer);
        }
    }
}
