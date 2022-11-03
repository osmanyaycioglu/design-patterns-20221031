package org.design.patterns.training.atm;

import org.design.patterns.training.behavioral.command.IAtmCommand;
import org.design.patterns.training.behavioral.strategy.atm.IAtmCommandObserver;

import java.util.Scanner;

public class AtmEx {

    private AtmController atmController;
    private IAtmCommandObserver atmCommandObserver;


    public AtmEx(AtmController atmController,
                 IAtmCommandObserver atmCommandObserver) {
        this.atmController = atmController;
        this.atmCommandObserver = atmCommandObserver;
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
                atmCommandObserver.commandRunSuccessFully(command);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
