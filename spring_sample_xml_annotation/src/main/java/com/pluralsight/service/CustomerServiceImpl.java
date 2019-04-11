package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService") /* 
public class CustomerServiceImpl implements CustomerService {
//	@Autowired /* field level injection */
	private CustomerRepository customerRepository;
	
	@Autowired /* Constructor level injection */
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer>findAll() {
		return customerRepository.findAll();
	}
	
//	@Autowired /* Setting injection in AppConfig */
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
