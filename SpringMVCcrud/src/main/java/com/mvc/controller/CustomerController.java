package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.model.Customer;
import com.mvc.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public String listCustomers(Model model) {
		model.addAttribute("Customer", new Customer());
		model.addAttribute("CustomerList",service.listCustomers());
		return "Customer";
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("Customer") Customer customer) {
		
		if(customer.getId() == null || customer.getId() == 0) {
			service.addCustomer(customer);
		}else {
			service.updateCustomer(customer);
		}
		return "redirect:/customers";
	}

}
