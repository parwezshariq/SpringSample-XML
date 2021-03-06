package com.shariqparwez.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.shariqparwez.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername;
	
	/*public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}*/

	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Shariq");
		customer.setLastname("Parwez");
		customers.add(customer);
		
		return customers;
	}

}
