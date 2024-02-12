package com.medicare.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	private String medicineName;
	private String seller;
	private double price;
	private String description;
	private String imgURL;
	private int quantity;
	
	public Cart() {}

	public Cart(String medicineName, String seller, double price, String description, String imgURL, int quantity) {
		this.medicineName = medicineName;
		this.seller = seller;
		this.price = price;
		this.description = description;
		this.imgURL = imgURL;
		this.quantity = quantity;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
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

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", medicineName=" + medicineName + ", seller=" + seller + ", price=" + price
				+ ", description=" + description + ", imgURL=" + imgURL + ", quantity=" + quantity + "]";
	}

	
	
}
