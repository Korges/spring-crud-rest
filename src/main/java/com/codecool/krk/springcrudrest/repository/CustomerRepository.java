package com.codecool.krk.springcrudrest.repository;

import com.codecool.krk.springcrudrest.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

//    public void createCustomer();
//    public Customer getCustomer();
//    public List<Customer> getCustomers();
//    public void deleteCustomer();
}
