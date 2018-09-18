package com.codecool.krk.springcrudrest.service;

import com.codecool.krk.springcrudrest.entity.Customer;

import java.util.Optional;

public interface CustomerService {

    void createCustomer(Customer customer);
    Optional<Customer> getCustomer(Long id);
    Iterable<Customer> getAllCustomers();
    void deleteCustomer(Long id);
}
