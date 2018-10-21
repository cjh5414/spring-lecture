package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        customers.put(customer.getId(), customer);
    }

    public Customer login(String id, String password) {
        if (customers.containsKey(id)) {
            Customer customer = customers.get(id);
            if (customer.getPassword().equals(password))
                return customer;
        }

        return null;
    }

    public Customer findCustomer(String id) {
        if(id != null)
            return (customers.get(id.toLowerCase()));
        else
            return null;
    }
}
