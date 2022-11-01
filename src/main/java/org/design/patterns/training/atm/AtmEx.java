package org.design.patterns.training.atm;

import org.design.patterns.training.behavioral.command.CommandFactory;
import org.design.patterns.training.behavioral.command.IAtmCommand;

import java.math.BigDecimal;
import java.util.Scanner;

public class AtmEx {

    public void run() {
        Customer customer = Customer.builder()
                                    .withName("osman")
                                    .withSurname("yaycıoğlu")
                                    .withUsername("osmany")
                                    .withPassword("123456")
                                    .addAccount(Account.builder()
                                                       .withAccountName("Osman TL")
                                                       .withAccountType(EAccountType.TL)
                                                       .withAmount(new BigDecimal(1_000))
                                                       .build())
                                    .addAccount(Account.builder()
                                                       .withAccountName("Osman DOLAR")
                                                       .withAccountType(EAccountType.USD)
                                                       .withAmount(new BigDecimal(20_000))
                                                       .build())
                                    .build();
        CommandFactory commandFactory = new CommandFactory();
        try (Scanner scanner = new Scanner(System.in)) {
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
