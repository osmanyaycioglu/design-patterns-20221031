package org.design.patterns.training.atm;

import org.design.patterns.training.creational.factory.GreetingsFactory;
import org.design.patterns.training.oo.intf.IGreeting;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Scanner;

public class Atm {

    public void showMenu() {
        System.out.println("1-Para çekme");
        System.out.println("2-Para yatırma");
        System.out.println("3-Hesap görüntüleme");
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            showMenu();
            System.out.println("seçiminiz");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Account tipi:");
                    scanner.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAccount(Customer customer,
                            EAccountType accountType) {
        Account account = getAccount(customer,
                                     accountType);
        System.out.println("account : " + account);
    }

    public boolean withdrawMoney(Customer customer,
                                 EAccountType accountType,
                                 BigDecimal drawMoney) {
        Account account = getAccount(customer,
                                     accountType);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            account.setAmount(amount.subtract(drawMoney));
            return true;
        }
        return false;
    }

    private static Account getAccount(Customer customer,
                                      EAccountType accountType) {
        Account account = customer.getAccounts()
                                  .stream()
                                  .filter(a -> a.getAccountType() == accountType)
                                  .findAny()
                                  .orElse(null);
        return account;
    }

    public boolean depositMoney(Customer customer,
                                EAccountType accountType,
                                BigDecimal drawMoney) {
        Account account = getAccount(customer,
                                     accountType);
        if (account != null) {
            BigDecimal amount = account.getAmount();
            account.setAmount(amount.add(drawMoney));
            return true;
        }
        return false;
    }

}
