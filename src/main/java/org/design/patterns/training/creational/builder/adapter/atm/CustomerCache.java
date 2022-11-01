package org.design.patterns.training.creational.builder.adapter.atm;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomerCache {
    private static CustomerCache instance = new CustomerCache();
    private Map<String, Customer> customerMap = new ConcurrentHashMap<>();

    public static CustomerCache getInstance() {
        return instance;
    }

    private CustomerCache() {
        customerMap.put("osmany",
                        Customer.builder()
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
        customerMap.put("aliveli",
                        Customer.builder()
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

        customerMap.put("mehmetv",
                        Customer.builder()
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

    }

    public Customer getCustomer(String username){
        return customerMap.get(username);
    }
}
