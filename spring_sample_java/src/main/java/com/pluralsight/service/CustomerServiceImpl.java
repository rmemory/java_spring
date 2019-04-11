package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService") /* appContext.getBean("customerService", CustomerService.class); */
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;
	
	/* Default constructor */
	public CustomerServiceImpl() {
		
	}
	
	/* Constructor used for constructor injection */
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
	
	@Autowired /* This works because HibernateCustomerRepositoryImpl is setup as a Repository */
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
