package com.shariqparwez.repository;

import java.util.ArrayList;
import java.util.List;

import com.shariqparwez.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.shariqparwez.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Shariq");
		customer.setLastname("Parwez");
		customers.add(customer);
		
		return customers;
	}

}
