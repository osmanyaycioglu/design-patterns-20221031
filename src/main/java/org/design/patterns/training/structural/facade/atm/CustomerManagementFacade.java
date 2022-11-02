package org.design.patterns.training.structural.facade.atm;

import org.design.patterns.training.atm.Account;
import org.design.patterns.training.atm.Customer;
import org.design.patterns.training.atm.EAccountType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomerManagementFacade {

    public void provisionCustomer(Customer customer) {
        // db ye git
        // başka bir sistem
        // db ye git yazım
        // fraud sistemi
        System.out.println("Customer eklendi");
    }

    public List<Customer> getActiveCustomers() {
        // db ye git
        // başka sisteme git
        // fraud
        List<Customer> customerList = new ArrayList<>();
        customerList.add(Customer.builder()
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
                                 .build());
        customerList.add(Customer.builder()
                                 .withName("ali")
                                 .withSurname("veli")
                                 .withUsername("aliveli")
                                 .withPassword("345678")
                                 .addAccount(Account.builder()
                                                    .withAccountName("Ali TL")
                                                    .withAccountType(EAccountType.TL)
                                                    .withAmount(new BigDecimal(10_000))
                                                    .build())
                                 .addAccount(Account.builder()
                                                    .withAccountName("Ali DOLAR")
                                                    .withAccountType(EAccountType.USD)
                                                    .withAmount(new BigDecimal(10_000))
                                                    .build())
                                 .addAccount(Account.builder()
                                                    .withAccountName("Ali EURO")
                                                    .withAccountType(EAccountType.EURO)
                                                    .withAmount(new BigDecimal(70_000))
                                                    .build())
                                 .build());

        customerList.add(Customer.builder()
                                 .withName("mehmet")
                                 .withSurname("veflayet")
                                 .withUsername("mehmetv")
                                 .withPassword("098765")
                                 .addAccount(Account.builder()
                                                    .withAccountName("Mehmet TL")
                                                    .withAccountType(EAccountType.TL)
                                                    .withAmount(new BigDecimal(1_000))
                                                    .build())
                                 .addAccount(Account.builder()
                                                    .withAccountName("Mehmet DOLAR")
                                                    .withAccountType(EAccountType.USD)
                                                    .withAmount(new BigDecimal(1_000))
                                                    .build())
                                 .addAccount(Account.builder()
                                                    .withAccountName("Mehmet EURO")
                                                    .withAccountType(EAccountType.EURO)
                                                    .withAmount(new BigDecimal(1_000))
                                                    .build())
                                 .build());

        return customerList;
    }
}
