package com.pluralsight.service;

import java.util.List;
import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
 class CustomerServiceImpl implements CustomerService {
	 

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
