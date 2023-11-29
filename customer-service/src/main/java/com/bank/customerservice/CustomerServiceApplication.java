package com.bank.customerservice;

import com.bank.customerservice.config.GlobalConfig;
import com.bank.customerservice.entities.Customer;
import com.bank.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(GlobalConfig.class)
public class CustomerServiceApplication {
	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			List<Customer> customerList = List.of(
			Customer.builder()
					.firstName("youssef")
					.lastName("ben youssef")
					.email("youssef@gmail.com")
					.build(),
			Customer.builder()
					.firstName("hassan")
					.lastName("aquarim")
					.email("hassan@gmail.com")
					.build()
			);
			customerRepository.saveAll(customerList);
		};
	}

}
