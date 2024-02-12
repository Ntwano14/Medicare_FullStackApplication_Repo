package com.medicare.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ProductList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productListId;
	private String medicineName;
	private String seller;
	private String qtyDesc;
	private double price;
	private String description;
	private String imgURL;
	private int active=1;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date CreationDateTime;
	
	@PrePersist
	private void onCreate() {
		CreationDateTime = new Date();
	}

	public ProductList() {}

	public ProductList(String medicineName, String seller, String qtyDesc, double price, String description, String imgURL,
			int active, Date creationDateTime) {
		this.medicineName = medicineName;
		this.seller = seller;
		this.qtyDesc = qtyDesc;
		this.price = price;
		this.description = description;
		this.imgURL = imgURL;
		this.active = active;
		this.CreationDateTime = creationDateTime;
	}

	public int getProductListId() {
		return productListId;
	}

	public void setProductListId(int productListId) {
		this.productListId = productListId;
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

	public String getQtyDesc() {
		return qtyDesc;
	}

	public void setQtyDesc(String qtyDesc) {
		this.qtyDesc = qtyDesc;
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

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getCreationDateTime() {
		return CreationDateTime;
	}

	public void setCreationDateTime(Date creationDateTime) {
		this.CreationDateTime = creationDateTime;
	}

	@Override
	public String toString() {
		return "ProductList [productListId=" + productListId + ", medicineName=" + medicineName + ", seller=" + seller
				+ ", qtyDesc=" + qtyDesc + ", price=" + price + ", description=" + description + ", imgURL=" + imgURL
				+ ", active=" + active + ", CreationDateTime=" + CreationDateTime + "]";
	}
	
	
	
	
	
	

}
