package org.design.patterns.training.behavioral.command;

import org.design.patterns.training.atm.Customer;
import org.design.patterns.training.atm.EAccountType;

import java.util.Map;
import java.util.Scanner;

public interface IAtmCommand {

//    void execute(Customer customer,
//                 EAccountType accountType,
//                 Map<String, Object> parameters);

    void execute(Customer customer,
                 Scanner scanner);

    String commandDesc();
}
