package com.medicare.api.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = Include.NON_DEFAULT)
public class OrderResponse {
	
	private int CusId;
	private String name;
	private String email;
	private String mobile;
	private String address;
	private String medicineName;
	private String seller;
	private double price;
	private String description;
	private int quantity;
	private Date orderDateTime;
	
	
	public OrderResponse() {}


	public OrderResponse(int CusId, String name, String email, String mobile, String address, String medicineName,
			String seller, double price, String description, int quantity, Date orderDateTime) {
		this.CusId = CusId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.medicineName = medicineName;
		this.seller = seller;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
		this.orderDateTime = orderDateTime;
	}


	public int getCusId() {
		return CusId;
	}


	public void setCusId(int CusId) {
		this.CusId = CusId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
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


	public Date getOrderDateTime() {
		return orderDateTime;
	}


	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	
	

}
