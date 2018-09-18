package com.codecool.krk.springcrudrest.rest;

import com.codecool.krk.springcrudrest.entity.Customer;
import com.codecool.krk.springcrudrest.exception.NoCustomerException;
import com.codecool.krk.springcrudrest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer) {

        service.createCustomer(customer);

        return customer;
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable Long id) {

        return service.getCustomer(id).orElseThrow(() -> new NoCustomerException("Customer id not found - " + id));
    }

    @GetMapping("/customers")
    public Iterable<Customer> getAllCustomers() {
        return service.getAllCustomers();

    }

    @PutMapping("/customers")
    public void updateCustomer(@RequestBody Customer customer) {
        service.createCustomer(customer);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        service.deleteCustomer(id);
    }
}
