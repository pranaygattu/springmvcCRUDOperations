package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.Dao.CustomerDao;
import com.mvc.model.Customer;

@Service
public class CustomerServiceImple implements CustomerService {
	
	@Autowired
	private CustomerDao dao;
	


	public CustomerDao getDao() {
		return dao;
	}


	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}


	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);
		
	}

	
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
	
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		return null;
	}


}
