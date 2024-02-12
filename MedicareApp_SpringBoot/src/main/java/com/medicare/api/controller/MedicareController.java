package com.medicare.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.api.entity.AdminCredential;
import com.medicare.api.entity.Cart;
import com.medicare.api.entity.Customer;
import com.medicare.api.entity.CustomerCredential;
import com.medicare.api.entity.OrderResponse;
import com.medicare.api.entity.ProductList;
import com.medicare.api.service.AdminCredentialService;
import com.medicare.api.service.CartService;
import com.medicare.api.service.CustomerCredentialService;
import com.medicare.api.service.CustomerService;
import com.medicare.api.service.ProductListService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/medicare")
public class MedicareController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ProductListService productListService;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private CustomerCredentialService customerCredentialService;
	
	@Autowired
	private AdminCredentialService adminCredentialService;

	// Customer & Product
	
	// 1. POST Method
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	// 2. GET Method
	@GetMapping("/customer")
	public List<Customer> findAllCustomers() {
		return customerService.getCustomers();
	}
	
	@GetMapping("/customer/{id}")
	public Customer findCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	
	// 3. DELETE Method
	@DeleteMapping("/customer/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return customerService.deleteCustomerById(id);
	}
	
	// Join the Customer & Product Table
	
	@GetMapping("/order/list")
	public List<OrderResponse> findAllCustomerProductInfos() {
		return customerService.getCustomerProductJoinInfos();
	}
	
	// ProductList
	
	// 1. POST Method
	@PostMapping("/product/list")
	public ProductList addProductList(@RequestBody ProductList productlist) {
		return productListService.saveProductList(productlist);
	}
	
	// 2. GET Method
	@GetMapping("/product/list")
	public List<ProductList> findAllProductLists() {
		return productListService.getProductLists();
	}
	@GetMapping("/product/list/{id}")
	public ProductList findProductListById(@PathVariable int id) {
		return productListService.getProductListById(id);
	}
	
	// 3. DELETE Method
	@DeleteMapping("/product/list/{id}")
	public String deleteProductList(@PathVariable int id) {
		return productListService.deleteProductListById(id);
	}
	
	// 4. PUT Method
	@PutMapping("/product/list/{id}")
	public ProductList updateProductList(@RequestBody ProductList productlist, @PathVariable int id) {
		return productListService.updateProductList(productlist, id);
	}
	
	// Cart
	
	// 1. POST Method
	@PostMapping("/cart")
	public Cart addCart(@RequestBody Cart cart) {
		return cartService.saveCart(cart);
	}
	
	// 2. GET Method
	@GetMapping("/cart")
	public List<Cart> findAllCarts() {
		return cartService.getCarts();
	}
	
	@GetMapping("/cart/{id}")
	public Cart findCartById(@PathVariable int id) {
		return cartService.getCartById(id);
	}
	
	// 3. DELETE Method
	@DeleteMapping("/cart/{id}")
	public String deleteCart(@PathVariable int id) {
		return cartService.deleteCartById(id);
	}		
		
	// CustomerCredential
	
	// 1. POST Method
	
	@PostMapping("/customer/credential")
	public CustomerCredential addCustomerCredential(@RequestBody CustomerCredential customercredential) {
		return customerCredentialService.saveCustomerCredential(customercredential);
	}
	
	// 2. GET Method
	
	@GetMapping("/customer/credential")
	public List<CustomerCredential> findAllCustomerCredentials() {
		return customerCredentialService.getCustomerCredentials();
	}
	
	@GetMapping("/customer/credential/{id}")
	public CustomerCredential findCustomerCredentialById(@PathVariable int id) {
		return customerCredentialService.getCustomerCredentialById(id);
	}
	
	// 3. PUT Method
	@PutMapping("/customer/credential/{id}")
	public CustomerCredential updateCustomerCredential(@RequestBody CustomerCredential customercredential, @PathVariable int id) {
		return customerCredentialService.updateCustomerCredential(customercredential, id);
	}
	
	// AdminCredential
	
	// 1. POST Method
	
	@PostMapping("/admin/credential")
	public AdminCredential addAdminCredential(@RequestBody AdminCredential admincredential) {
		return adminCredentialService.saveAdminCredential(admincredential);
	}
	
	// 2. GET Method
	
	@GetMapping("/admin/credential")
	public List<AdminCredential> findAllAdminCredentials() {
		return adminCredentialService.getAdminCredentials();
	}
	
	@GetMapping("/admin/credential/{id}")
	public AdminCredential findAdminCredentialById(@PathVariable int id) {
		return adminCredentialService.getAdminCredentialById(id);
	}
	
	// 3. PUT Method
	@PutMapping("/admin/credential/{id}")
	public AdminCredential updateAdminCredential(@RequestBody AdminCredential admincredential, @PathVariable int id) {
		return adminCredentialService.updateAdminCredential(admincredential, id);
	}
	
}
