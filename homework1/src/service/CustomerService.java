package service;

import model.Customer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jihun on 2018. 10. 21..
 */

public class CustomerService {
    private Map<String, Customer> customers;
    private static final CustomerService instance = new CustomerService();

    private CustomerService() {
        customers = new HashMap<String, Customer>();
    }

    public static CustomerService getInstance() {
        return instance;
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getId().toLowerCase(), customer);
    }

    public Customer login(String id, String password) {
        if (id != null && customers.containsKey(id)) {
            Customer customer = customers.get(id.toLowerCase());
            if (customer.getPassword().equals(password))
                return customer;
        }

        return null;
    }
}
