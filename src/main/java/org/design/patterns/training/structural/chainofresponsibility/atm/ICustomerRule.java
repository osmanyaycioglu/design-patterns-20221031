package org.design.patterns.training.structural.chainofresponsibility.atm;

import org.design.patterns.training.atm.Customer;

public interface ICustomerRule {

    void execute(Customer customer);

}
