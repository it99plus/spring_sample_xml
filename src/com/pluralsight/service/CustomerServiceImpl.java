package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customRepository;

	public void setCustomRepository(CustomerRepository customRepository) {
		this.customRepository = customRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customRepository.findAll();
	}

}
