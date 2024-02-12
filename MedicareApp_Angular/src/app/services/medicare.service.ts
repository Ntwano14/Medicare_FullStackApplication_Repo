import { CustomerCreden } from './../Model/Credential/Customer/customer-creden';
// import { IProductList } from './../interfaces/product-list/product-list';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ProductList } from '../Model/product-list/product-list';
import { Cart } from '../Model/Cart/cart';
import { Customer } from '../Model/Customer/customer';
import { AdminCreden } from '../Model/Credential/Admin/admin-creden';


@Injectable({
  providedIn: 'root'
})
export class MedicareService {

  ROOT_URL:String="http://medicareapp.us-east-1.elasticbeanstalk.com"

  private _productListUrl = this.ROOT_URL+"/api/medicare/product/list";
  private _orderListUrl = this.ROOT_URL+"/api/medicare/order/list";
  private _cartUrl = this.ROOT_URL+"/api/medicare/cart";
  private _customerUrl= this.ROOT_URL+"/api/medicare/customer";
  private _adminCredentialUrl = this.ROOT_URL+"/api/medicare/admin/credential";
  private _customerCredentialUrl = this.ROOT_URL+"/api/medicare/customer/credential";
  

  constructor(private http: HttpClient) { }

  // -----------------Customer & Product (Place Order)---------------------

  // 1. Get Method
  getAllOrderList(): Observable<Customer[]> {
    return this.http.get<Customer[]>(this._orderListUrl);
  }


  // 2. Post Method
  placeOrder(customer: Customer): Observable<Customer> {
    return this.http.post<Customer>(this._customerUrl, customer);
  }

  // 3. Delete Method
  deleteCustomerProductDetailsById(id: number): Observable<Customer> {
    return this.http.delete<Customer>(`${this._customerUrl}/${id}`)
  }

  // ----------------------------Product List------------------------------------

  // 1. GET Method
  getAllProductList(): Observable<ProductList[]> {
    return this.http.get<ProductList[]>(this._productListUrl);
  }

  getProductListById(id: number): Observable<ProductList> {
    return this.http.get<ProductList>(`${this._productListUrl}/${id}`);
  }

  // 2. Post Method 
  saveProductList(productlist: ProductList): Observable<ProductList> {
    return this.http.post<ProductList>(this._productListUrl, productlist);
  }

  // 3. Put Method
  updateProductList(productlist: ProductList, id: number): Observable<ProductList> {
    return this.http.put<ProductList>(`${this._productListUrl}/${id}`,productlist);
  } 

  // 4. Delete Method
  deleteProductList(id: number): Observable<ProductList> {
    return this.http.delete<ProductList>(`${this._productListUrl}/${id}`);
  }

  // ---------------------------------Cart------------------------------------------

  // 1. Get Method
  getAllCarts(): Observable<Cart[]> {
    return this.http.get<Cart[]>(this._cartUrl);
  }

  getCartById(id: number): Observable<Cart> {
    return this.http.get<Cart>(`${this._cartUrl}/${id}`);
  }

  // 2. Post Method
  saveCart(cart: Cart): Observable<ProductList> {
    return this.http.post<ProductList>(this._cartUrl, cart);
  }

  // 3. Delete Method
  deleteCartById(id: number): Observable<Cart> {
    return this.http.delete<Cart>(`${this._cartUrl}/${id}`);
  } 

// ---------------------Admin Credential------------------------

// 1. Get Method
getAllAdmin(): Observable<AdminCreden[]> {
  return this.http.get<AdminCreden[]>(this._adminCredentialUrl);
}

getAdminById(id: number): Observable<AdminCreden> {
  return this.http.get<AdminCreden>(`${this._adminCredentialUrl}/${id}`);
}

// 2. Put method
updateAdminById(admin: AdminCreden, id: number): Observable<AdminCreden> {
  return this.http.put<AdminCreden>(`${this._adminCredentialUrl}/${id}`,admin);
}


//----------------------Customer Credential----------------------
// 1. Get Method
getAllCustomerCreden(): Observable<CustomerCreden[]> {
  return this.http.get<CustomerCreden[]>(this._customerCredentialUrl);
}

// 2. Post Method
saveCustomerCreden(customercreden: CustomerCreden): Observable<CustomerCreden> {
  return this.http.post<CustomerCreden>(this._customerCredentialUrl, customercreden);
}

  
}
