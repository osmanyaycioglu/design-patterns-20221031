package org.design.patterns.training.creational.builder.adapter.atm;

import org.design.patterns.training.behavioral.command.CommandFactory;
import org.design.patterns.training.behavioral.command.IAtmCommand;

import java.util.Scanner;

public class AtmEx {

    public void run() {
        CommandFactory commandFactory = new CommandFactory();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("username:");
            String username = scanner.nextLine();
            System.out.println("password:");
            String password = scanner.nextLine();
            Customer customer = CustomerCache.getInstance()
                                             .getCustomer(username);
            if (customer == null){
                System.err.println("Login problemi");
                return;
            }
            while (true) {
                commandFactory.showMenu();
                System.out.println("seçiminiz");
                int i = scanner.nextInt();
                IAtmCommand command = commandFactory.getCommand(i);
                if (command == null) {
                    break;
                }
                command.execute(customer,
                                scanner);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
