package com.medicare.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.api.entity.Customer;
import com.medicare.api.entity.OrderResponse;
import com.medicare.api.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	// 1. Save the Customer to the database (POST Method)
	
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);	
	}
	
	// 2. fetch the Customer from database (GET Method)
	
	public List<Customer> getCustomers() {
		return customerRepo.findAll();
	}
	
	public Customer getCustomerById(int id) {
		return customerRepo.findById(id).orElse(null);
	}
	
	// 3. delete the Customer from database (Delete)
	public String deleteCustomerById(int id) {
		customerRepo.deleteById(id);
		return "Data "+id+" Deleted Successfully !";
	}
	
	// Join the Customer & Product Table
	
	public List<OrderResponse> getCustomerProductJoinInfos() {
		return customerRepo.joinCustomerProductTable();
	}

}
