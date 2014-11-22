package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerReopositoryImpl implements CustomerRepository {

	
	
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		
		customer.setFirstname("John");
		customer.setLastname("Doe");
		customers.add(customer);
		
		
		return customers;
	}
	 
}
