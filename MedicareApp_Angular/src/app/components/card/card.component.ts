import { MedicareService } from 'src/app/services/medicare.service';
import { Router } from '@angular/router';
import { Component, Input, OnInit } from '@angular/core';
import { ProductList } from 'src/app/Model/product-list/product-list';
import { Cart } from 'src/app/Model/Cart/cart';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit{
  
  @Input() filterData:string;
  productList: ProductList[];
  proList:ProductList;
  proCart: Cart;
  constructor(private router:Router, private medicareService: MedicareService) {}

  ngOnInit(): void {
    this.medicareService.getAllProductList().subscribe(data => this.productList = data);
  }

  order(medicine: any, seller: any, price: any, desc: any, url:any, qtyDesc: any ) {

    this.proCart = {
      medicineName: medicine,
      seller: seller,
      price: price,
      description: desc,
      imgURL: url,
      quantity: qtyDesc
    }

    this.medicareService.saveCart(this.proCart).subscribe(x=>console.log(x));
    this.router.navigate(['/cart']);
    // console.log(this.proCart);

    // console.log(JSON.stringify(proCart))
  }

}
