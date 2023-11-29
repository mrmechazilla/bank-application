package com.bank.accountservice.entity;

import com.bank.accountservice.enums.AccountTypeEnum;
import com.bank.accountservice.model.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BankAccount {
    @Id
    private String bankAccountId;
    private double balance;
    private LocalDate createdAt;
    private String currency;
    @Enumerated(value = EnumType.STRING)
    private AccountTypeEnum accountType;
    @Transient
    private Customer customer;
    private Long customerId;
}
