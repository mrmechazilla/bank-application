package com.bank.accountservice;

import com.bank.accountservice.clients.CustomerClient;
import com.bank.accountservice.enums.AccountTypeEnum;
import com.bank.accountservice.entity.BankAccount;
import com.bank.accountservice.repository.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class AccountServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(BankAccountRepository bankAccountRepository, CustomerClient customerClient){
		return args -> {
			customerClient.allCustomers().forEach(c -> {
				BankAccount bankAccount1 = BankAccount.builder()
						.bankAccountId(UUID.randomUUID().toString())
						.currency("MAD")
						.balance(Math.random()*80000)
						.createdAt(LocalDate.now())
						.accountType(AccountTypeEnum.CURRENT_ACCOUNT)
						.customerId(c.getCustomerId())
						.build();
				BankAccount bankAccount2 = BankAccount.builder()
						.bankAccountId(UUID.randomUUID().toString())
						.currency("MAD")
						.balance(Math.random()*65163)
						.createdAt(LocalDate.now())
						.accountType(AccountTypeEnum.CURRENT_ACCOUNT)
						.customerId(c.getCustomerId())
						.build();
				bankAccountRepository.save(bankAccount1);
				bankAccountRepository.save(bankAccount2);
			});

		};
	}

}
