package com.shiven.bootaccessingdatamongodb.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiven.bootaccessingdatamongodb.model.Customer;
import com.shiven.bootaccessingdatamongodb.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping("/customers")
	public List<Customer> getCustomer() {
		System.out.println("This is getCustomer method");
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}

	@GetMapping("/customerById/{id}")
	public Optional<Customer> getCustomerbyId(@PathVariable String id) {
		System.out.println("This is getCustomerbyFirstName by name method");
		return customerRepository.findById(id);

	}

	@GetMapping("/customerByName/{firstName}")
	public Customer getCustomerbyFirstName(@PathVariable String firstName) {
		System.out.println("This is getCustomerbyFirstName by name method");
		Customer cust = customerRepository.findByFirstName(firstName);
		return cust;
	}

	@GetMapping("/cutomerByLast/{lastName}")
	public Customer getCustomerbyLastName(@PathVariable String lastName) {
		System.out.println("This is getCustomerbyLastName by name method");
		Customer cust = customerRepository.findByFirstName(lastName);
		return cust;
	}

	@PostMapping("/addCustomers")
	public void setCustomerbyFirstName(@RequestBody Customer customer) {
		System.out.println("This is setCustomerbyFirstName by name method and fist name is :");
		customerRepository.save(customer);
		System.out.println("one customer added :" + customer);
	}

	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable String id) {
		System.out.println("method customer deleted :");
		customerRepository.deleteById(id);
		System.out.println("one customer deleted :");
	}

}
