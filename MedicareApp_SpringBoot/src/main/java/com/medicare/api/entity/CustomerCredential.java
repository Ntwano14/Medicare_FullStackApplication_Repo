package com.medicare.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerCredential {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CustomerId;
	private String username;
	private String password;
	
	
	public CustomerCredential() {}


	public CustomerCredential(String username, String password) {
		this.username = username;
		this.password = password;
	}


	public int getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "CustomerCredential [CustomerId=" + CustomerId + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	

}
