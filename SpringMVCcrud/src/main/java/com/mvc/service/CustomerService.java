package com.mvc.service;

import java.util.List;

import com.mvc.model.Customer;

public interface CustomerService {
	
	
	
	public void addCustomer(Customer customer);

	public List<Customer> listCustomers();

	public void updateCustomer(Customer customer);

	

}
