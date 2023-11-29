package com.bank.customerservice.controller;

import com.bank.customerservice.entities.Customer;
import com.bank.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> customerList(){
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{customerId}")
    public Customer customerById(@PathVariable Long customerId){
        return customerRepository.findById(customerId).get();
    }
}
