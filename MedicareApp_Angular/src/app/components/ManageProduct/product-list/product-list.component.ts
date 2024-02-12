// import { IProductList } from './../../../interfaces/product-list/product-list';
import { MedicareService } from './../../../services/medicare.service';
import { Component, OnInit } from '@angular/core';
import { ProductList } from 'src/app/Model/product-list/product-list';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit{

  // Injected medicare service dependency in component(here...)
  constructor(private medicareService: MedicareService) {}

  productList: ProductList[];

  ngOnInit(): void {
    this.medicareService.getAllProductList().subscribe(data => this.productList = data);
  }

  delete(id: number) {
    this.medicareService.deleteProductList(id).subscribe(data => console.log(data));
    this.productList = this.productList.filter((data) => {
      return data.productListId != id;
    });
    
    
  }

}
