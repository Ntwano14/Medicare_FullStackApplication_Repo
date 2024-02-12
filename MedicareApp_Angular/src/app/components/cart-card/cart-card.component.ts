import { Cart } from './../../Model/Cart/cart';
import { MedicareService } from 'src/app/services/medicare.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { Customer } from 'src/app/Model/Customer/customer';

@Component({
  selector: 'app-cart-card',
  templateUrl: './cart-card.component.html',
  styleUrls: ['./cart-card.component.css']
})
export class CartCardComponent implements OnInit{

  cartData: Cart[];
  customer: Customer;
  constructor(private router: Router, private medicareService: MedicareService) {
  // this.proId = this.router.getCurrentNavigation()?.extras.state?.['pid'];
  }

 

  ngOnInit(): void {
    this.medicareService.getAllCarts().subscribe(x => this.cartData = x);
  }

  deleteCart(cart: Cart) {
    // console.log(cart.cartId);
    this.cartData = this.cartData.filter(data => data.cartId !== cart.cartId);
    this.medicareService.deleteCartById(Number(cart.cartId)).subscribe(x=> console.log(x));
    
    this.router.navigate(['/cart']);
  }

  qtyVal: number = 1;

  dec(dec: any) {
    this.qtyVal = Number(dec);
  }

  placeOrder(cartAllData: any, name: any, age: any, gen: any, email: any, add: any, mob: any) {

    // console.log(name);
    // console.log(age);
    // console.log(gen);
    // console.log(email);
    // console.log(add);
    // console.log(mob);
    // console.log(this.qtyVal);
    // console.log(cartAllData);

    this.customer = {
    name: name,
    age: age,
    gender: gen,
    email: email,
    address: add,
    mobile: mob,
    products: cartAllData
  }

  // console.log(this.customer);

  this.medicareService.placeOrder(this.customer).subscribe(x=>console.log(x));
  alert("Your Order Placed Successfully !");
  this.router.navigate(['/home']);
  }

 
}
