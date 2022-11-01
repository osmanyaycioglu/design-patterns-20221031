package org.design.patterns.training.creational.builder.adapter;

import org.design.patterns.training.creational.builder.adapter.atm.Customer;

public class CustomerToEmployeeAdapter extends Employee {

    public CustomerToEmployeeAdapter(Customer customer) {
        setName(customer.getName());
        setSurname(customer.getSurname());
        setGender(null);
    }
}
