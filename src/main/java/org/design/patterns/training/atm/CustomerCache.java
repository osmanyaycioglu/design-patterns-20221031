package org.design.patterns.training.atm;

import org.design.patterns.training.structural.facade.atm.CustomerManagementFacade;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomerCache {
    private static CustomerCache            instance    = new CustomerCache();
    private        Map<String, Customer>    customerMap = new ConcurrentHashMap<>();
    private        CustomerManagementFacade customerManagementFacade;

    public static CustomerCache getInstance() {
        return instance;
    }

    private CustomerCache() {
    }

    public Customer getCustomer(String username) {
        return customerMap.get(username);
    }

    public void setCustomerManagerFacade(CustomerManagementFacade customerManagementFacade) {

        this.customerManagementFacade = customerManagementFacade;
    }

    public void init() {
        List<Customer> activeCustomers = this.customerManagementFacade.getActiveCustomers();
        activeCustomers.forEach(c -> customerMap.put(c.getUsername(),
                                                     c));
    }
}
