package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customRepository;
	
	public CustomerServiceImpl() {}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constrctor injection");
		this.customRepository = customerRepository;
	}
	

	public void setCustomRepository(CustomerRepository customRepository) {
		System.out.println("We are using setter injection");
		this.customRepository = customRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customRepository.findAll();
	}

}
