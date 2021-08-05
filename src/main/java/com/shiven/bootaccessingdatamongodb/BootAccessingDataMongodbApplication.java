package com.shiven.bootaccessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shiven.bootaccessingdatamongodb.model.Customer;
import com.shiven.bootaccessingdatamongodb.repository.CustomerRepository;

@SpringBootApplication
//public class BootAccessingDataMongodbApplication implements CommandLineRunner {
public class BootAccessingDataMongodbApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootAccessingDataMongodbApplication.class, args);
		System.out.println("This is mongo db project");
	}

	@Autowired
	private CustomerRepository repository;

//	@Override
//	public void run(String... args) throws Exception {
//		repository.deleteAll();
//
//		// save a couple of customers
//		repository.save(new Customer("Alice", "Smith"));
//		repository.save(new Customer("Bob", "Smith"));
//
//		// fetch all customers
//		System.out.println("Customers found with findAll():");
//		System.out.println("-------------------------------");
//		for (Customer customer : repository.findAll()) {
//			System.out.println(customer);
//		}
//		System.out.println();
//
//		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findByFirstName("Alice"));
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (Customer customer : repository.findByLastName("Smith")) {
//			System.out.println(customer);
//		}
//	}
}
