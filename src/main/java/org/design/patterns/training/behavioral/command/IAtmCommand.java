package org.design.patterns.training.behavioral.command;

import org.design.patterns.training.creational.builder.adapter.atm.Customer;

import java.util.Scanner;

public interface IAtmCommand {

//    void execute(Customer customer,
//                 EAccountType accountType,
//                 Map<String, Object> parameters);

    void execute(Customer customer,
                 Scanner scanner);

    String commandDesc();

    IAtmCommand clone();
}
