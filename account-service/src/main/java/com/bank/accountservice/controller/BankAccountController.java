package com.bank.accountservice.controller;

import com.bank.accountservice.clients.CustomerClient;
import com.bank.accountservice.entity.BankAccount;
import com.bank.accountservice.model.Customer;
import com.bank.accountservice.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankAccountController {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private CustomerClient customerClient;

    @GetMapping("/accounts")
    public List<BankAccount> accountList(){
         List<BankAccount> accountList = bankAccountRepository.findAll();
         accountList.forEach(acc -> {
             acc.setCustomer(customerClient.findCustomerById(acc.getCustomerId()));
         });
         return accountList;
    }

    @GetMapping("/accounts/{id}")
    public BankAccount bankAccountById(@PathVariable String id){
        BankAccount bankAccount = bankAccountRepository.findById(id).get();
        Customer customer = customerClient.findCustomerById(bankAccount.getCustomerId());
        bankAccount.setCustomer(customer);
        return bankAccount;
    }
}