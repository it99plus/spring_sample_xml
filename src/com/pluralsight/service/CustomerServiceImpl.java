package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
class CustomerServiceImpl implements CustomerService {

	// @Autowired
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}
 
	// @Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
