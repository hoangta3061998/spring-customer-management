package com.codegym.repository;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository implements GeneralRepository<Customer> {
    private static Map<Integer, Customer> customerList;

    static {
        customerList = new HashMap<>();
        customerList.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customerList.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customerList.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customerList.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customerList.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customerList.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public ArrayList<Customer> findAll() {
        return new ArrayList<>(customerList.values());
    }

    @Override
    public void save(Customer customer) {
        customerList.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerList.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerList.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customerList.remove(id);
    }
}
