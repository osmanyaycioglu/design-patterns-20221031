package org.design.patterns.training.atm;

import org.design.patterns.training.behavioral.command.CommandFactory;
import org.design.patterns.training.behavioral.command.IAtmCommand;

import java.util.Scanner;

public class AtmEx {

    private AtmController atmController;

    public AtmEx(AtmController atmController) {
        this.atmController = atmController;
        CustomerCache customerCache = CustomerCache.getInstance();
        customerCache.setCustomerManagerFacade(atmController.getCustomerManagementFacade());
        customerCache.init();
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            Customer customer = atmController.login(scanner);
            if (customer == null) {
                System.err.println("Login problemi");
                return;
            }
            while (true) {
                atmController.showMenu();
                System.out.println("seçiminiz");
                int i = scanner.nextInt();
                IAtmCommand command = atmController.getCommand(i);
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
