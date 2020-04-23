package com.mvc.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.mvc.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	
	private SessionFactory sessionFactory;

	public void addCustomer(Customer customer) {
		
		Session session = sessionFactory.getCurrentSession();
		session.persist(customer);
		
		
	}

}
