package com.example.springmvcrest.services;

import com.example.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
