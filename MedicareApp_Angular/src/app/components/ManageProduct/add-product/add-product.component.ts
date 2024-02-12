import { MedicareService } from './../../../services/medicare.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductList } from 'src/app/Model/product-list/product-list';


@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  productList: ProductList = new ProductList();

  constructor(private builder:FormBuilder, private router: Router, private medicareService: MedicareService) {}

  
  addProductForm:FormGroup;
  submitted:boolean=false;
  ngOnInit(): void {
    this.addProductForm=this.builder.group({
      name:['',Validators.required],
      seller:['',Validators.required],
      url:['',Validators.required],
      qty:['',Validators.required],
      price:['',Validators.required],
      desc:['',Validators.required],
    })
  }

  get form(){
    return this.addProductForm.controls;
  }

  onSubmit() {
    // console.log(this.productList);
    this.submitted=true;
    if(this.addProductForm.invalid){
      return
    }else {
      // console.log(this.productList);
      this.medicareService.saveProductList(this.productList).subscribe(data => console.log(data));
      this.router.navigate(['/manage-product']);
    }
  }

}
