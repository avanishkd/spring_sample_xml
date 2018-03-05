package com.mindtree.service;

import java.util.List;

import com.mindtree.model.Customer;
import com.mindtree.repository.CustomerRepository;

/**
 * @author M1030081
 *
 */
public class CustomerServiceImpl implements CustomerService {

	// private CustomerRepository customerRepository = new
	// HibernateCustomerRepositoryImpl();
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
