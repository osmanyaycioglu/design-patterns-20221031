package org.design.patterns.training.creational.builder.adapter.atm;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String surname;
    private String username;
    private String password;
    private List<Account> accounts ;

    Customer(String name,
             String surname,
             String username,
             String password,
             List<Account> accounts) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.accounts = accounts;
    }

    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }

    public Customer addAccount(Account account){
        accounts.add(account);
        return this;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String toString() {
        return "Customer(name=" + this.getName() + ", surname=" + this.getSurname() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", accounts=" + this.getAccounts() + ")";
    }

    public static class CustomerBuilder {
        private String        name;
        private String        surname;
        private String        username;
        private String        password;
        private List<Account> accounts = new ArrayList<>();

        CustomerBuilder() {
        }

        public CustomerBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public CustomerBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public CustomerBuilder withPassword(String password) {
            this.password = password;
            return this;
        }


        public CustomerBuilder addAccount(Account account){
            accounts.add(account);
            return this;
        }

        public Customer build() {
            return new Customer(name,
                                surname,
                                username,
                                password,
                                accounts);
        }

        public String toString() {
            return "Customer.CustomerBuilder(name=" + this.name + ", surname=" + this.surname + ", username=" + this.username + ", password=" + this.password + ", accounts=" + this.accounts + ")";
        }
    }
}
