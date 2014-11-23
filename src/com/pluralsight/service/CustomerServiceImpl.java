package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customRepository = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return customRepository.findAll();
	}

}
