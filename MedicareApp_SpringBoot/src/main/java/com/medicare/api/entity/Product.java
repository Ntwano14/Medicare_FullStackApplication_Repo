package com.medicare.api.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String medicineName;
	private String seller;
	private double price;
	private String description;
	private int quantity;
	
	@ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Customer> customers;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date orderDateTime;
	
	@PrePersist
	private void onCreate() {
		orderDateTime = new Date();
	}

	public Product() {}

	public Product(String medicineName, String seller, double price, String description, int quantity,
			List<Customer> customers, Date orderDateTime) {
		this.medicineName = medicineName;
		this.seller = seller;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
		this.customers = customers;
		this.orderDateTime = orderDateTime;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Date getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", medicineName=" + medicineName + ", seller=" + seller + ", price=" + price
				+ ", description=" + description + ", quantity=" + quantity + ", customers=" + customers
				+ ", orderDateTime=" + orderDateTime + "]";
	}
	
	

		

}
