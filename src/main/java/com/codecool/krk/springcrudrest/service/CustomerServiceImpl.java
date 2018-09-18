package com.codecool.krk.springcrudrest.service;

import com.codecool.krk.springcrudrest.entity.Customer;
import com.codecool.krk.springcrudrest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public void createCustomer(Customer customer) {
        repository.save(customer);
    }

    @Override
    public Optional<Customer> getCustomer(Long id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }
}
