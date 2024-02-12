package com.medicare.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.api.entity.ProductList;
import com.medicare.api.repository.ProductListRepository;

@Service
public class ProductListService {
	
	@Autowired
	private ProductListRepository productListRepo;
	
	// 1. Save the product list to the database (POST Method)
	
	public ProductList saveProductList(ProductList productlist) {
		return productListRepo.save(productlist);	
	}
	
	// 2. get the product list from database (GET Method)
	
	public List<ProductList> getProductLists() {
		return productListRepo.findAll();
	}
	
	public ProductList getProductListById(int id) {
		return productListRepo.findById(id).orElse(null);
	}
	
	// 3. delete the product list from database (DELETE Method)
	
	public String deleteProductListById(int id) {
		productListRepo.deleteById(id);
		return "Data "+id+" Deleted Successfully";
	}

	// 4. update the product list to the database (PUT Method)
	
	public ProductList updateProductList(ProductList productlist, int id) {
		ProductList existingProductList = productListRepo.findById(id).orElse(null);
		existingProductList.setMedicineName(productlist.getMedicineName());
		existingProductList.setSeller(productlist.getSeller());
		existingProductList.setQtyDesc(productlist.getQtyDesc());
		existingProductList.setPrice(productlist.getPrice());
		existingProductList.setDescription(productlist.getDescription());
		existingProductList.setImgURL(productlist.getImgURL());
		return productListRepo.save(existingProductList);
	}
}
