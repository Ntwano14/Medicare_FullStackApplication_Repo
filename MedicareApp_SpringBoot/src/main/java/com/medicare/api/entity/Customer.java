package com.medicare.api.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CusId;
	private String name;
	private int age;
	private String gender;
	private String email;
	private String address;
	private String mobile;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "CUSTOMER_PRODUCT_TABLE", 
		joinColumns = {
				@JoinColumn(name ="customer_id", referencedColumnName = "CusId")
		}, 
		inverseJoinColumns = {
				@JoinColumn(name = "product_id", referencedColumnName = "pid")
		}
	)
	private List<Product> products;

	public Customer() {}

	public Customer(String name, int age, String gender, String email, String address, String mobile,
			List<Product> products) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.products = products;
	}

	public int getCusId() {
		return CusId;
	}

	public void setCusId(int cusId) {
		CusId = cusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [CusId=" + CusId + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email="
				+ email + ", address=" + address + ", mobile=" + mobile + ", products=" + products + "]";
	}
	
	
	
	
	
}
