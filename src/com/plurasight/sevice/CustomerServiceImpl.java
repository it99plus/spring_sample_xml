package com.plurasight.sevice;

import java.util.List;

import com.plurasight.model.Customer;
import com.plurasight.repository.CustomerRepository;
import com.plurasight.repository.HibernateCustomerReopositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerReopositoryImpl();
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
}
