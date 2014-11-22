package com.plurasight.repository;

import java.util.ArrayList;
import java.util.List;

import com.plurasight.model.Customer;

public class HibernateCustomerReopositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.plurasight.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		
		customer.setFirstname("John");
		customer.setLastname("Doe");
		customers.add(customer);
		
		
		return customers;
	}
	 
}
