package com.chandan.customerdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chandan.customerdata.model.Customer;
import com.chandan.customerdata.repos.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {
	
	@Autowired
	private CustomerRepository repo;

	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Kashi Lal");
		customer.setEmail("kashi@gmail.com");
		repo.save(customer);
	}
	
	@Test
	void testFindCustomerById() {
		Customer customer = repo.findById(1).get();
		System.out.println(customer);
	}
	
	@Test
	void testUpdateCustomer() {
		Customer customer = repo.findById(1).get();
		customer.setEmail("kashilal@gmail.com");
		repo.save(customer);
	}
	
	@Test
	void testDeleteCustomer() {
		Customer customer = repo.findById(1).get();
		repo.delete(customer);
	}

}
