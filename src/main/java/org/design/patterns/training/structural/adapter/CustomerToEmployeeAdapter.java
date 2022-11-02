package org.design.patterns.training.structural.adapter;

import org.design.patterns.training.atm.Customer;

public class CustomerToEmployeeAdapter extends Employee {

    public CustomerToEmployeeAdapter(Customer customer) {
        setName(customer.getName());
        setSurname(customer.getSurname());
        setGender(null);
    }
}
