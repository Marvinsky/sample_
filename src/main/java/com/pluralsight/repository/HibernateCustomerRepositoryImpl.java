package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer c = new Customer();
		c.setFirstName("Bryan");
		c.setLastName("Hansen");
		
		customers.add(c);
		return customers;
				
	}
}
