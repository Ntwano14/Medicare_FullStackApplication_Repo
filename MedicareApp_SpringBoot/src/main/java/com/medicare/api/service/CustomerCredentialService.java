package com.medicare.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.api.entity.CustomerCredential;
import com.medicare.api.repository.CustomerCredentialRepository;

@Service
public class CustomerCredentialService {
	
	@Autowired
	private CustomerCredentialRepository cusCreRepo;
	
	// POST Method
	public CustomerCredential saveCustomerCredential(CustomerCredential customercredential) {
		return cusCreRepo.save(customercredential);
	}
	
	// GET Method
	public List<CustomerCredential> getCustomerCredentials() {
		return cusCreRepo.findAll();
	}
	
	public CustomerCredential getCustomerCredentialById(int id) {
		return cusCreRepo.findById(id).orElse(null);
	}
	
	// PUT Method
	public CustomerCredential updateCustomerCredential(CustomerCredential customercredential, int id) {
		CustomerCredential existingCustomerCredential = cusCreRepo.findById(id).orElse(null);
		existingCustomerCredential.setUsername(customercredential.getUsername());
		existingCustomerCredential.setPassword(customercredential.getPassword());
		return cusCreRepo.save(existingCustomerCredential);
	}

}
