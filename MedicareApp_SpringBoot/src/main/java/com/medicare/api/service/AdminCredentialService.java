package com.medicare.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.api.entity.AdminCredential;
import com.medicare.api.repository.AdminCredentialRepository;

@Service
public class AdminCredentialService {
	
	@Autowired
	private AdminCredentialRepository adminCreRepo;

	// POST Method
		public AdminCredential saveAdminCredential(AdminCredential admincredential) {
			return adminCreRepo.save(admincredential);
		}
		
		// GET Method
		public List<AdminCredential> getAdminCredentials() {
			return adminCreRepo.findAll();
		}
		
		public AdminCredential getAdminCredentialById(int id) {
			return adminCreRepo.findById(id).orElse(null);
		}
		
		// PUT Method
		public AdminCredential updateAdminCredential(AdminCredential admincredential, int id) {
			
			AdminCredential existingAdminCredential = adminCreRepo.findById(id).orElse(null);
			existingAdminCredential.setUsername(admincredential.getUsername());
			existingAdminCredential.setPassword(admincredential.getPassword());
			return adminCreRepo.save(existingAdminCredential);
		}

}
