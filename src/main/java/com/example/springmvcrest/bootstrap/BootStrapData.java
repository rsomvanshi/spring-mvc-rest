package com.example.springmvcrest.bootstrap;

import com.example.springmvcrest.domain.Customer;
import com.example.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Customer c1 = new Customer();
        c1.setFirstName("Rohan");
        c1.setLastName("Somvanshi");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Rahul");
        c2.setLastName("Somvanshi");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Neha");
        c3.setLastName("Somvanshi");
        customerRepository.save(c3);

        System.out.println("Customers saved "+ customerRepository.count());
    }
}
