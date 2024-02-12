import { ActivatedRoute, Router } from '@angular/router';
import { MedicareService } from 'src/app/services/medicare.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { ProductList } from 'src/app/Model/product-list/product-list';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  prodList: ProductList;
  id: string|null;
  updateProductForm:FormGroup;
  submitted: boolean = false;

  constructor(private medicareService: MedicareService, private activatedRoute: ActivatedRoute, private builder: FormBuilder, private router: Router) {}


  ngOnInit(): void {

    this.id = this.activatedRoute.snapshot.paramMap.get('id');
    // alert(this.id);
    this.medicareService.getProductListById(Number(this.id)).subscribe(x=> this.prodList=x);

    this.updateProductForm = this.builder.group({
      name:['',Validators.required],
      seller:['',Validators.required],
      url:['',Validators.required],
      qty:['',Validators.required],
      price:['',Validators.required],
      desc:['',Validators.required],
    })
    
  }

  get form() {
    return this.updateProductForm.controls;
  }

  onUpdate() {
    this.submitted = true;
    if(this.updateProductForm.invalid){
      return
    }
    else{
      // console.log(this.prodList);
      this.medicareService.updateProductList(this.prodList, Number(this.id)).subscribe(x=>console.log(x));
      alert("Data Updated Successfully !");
      this.router.navigate(['manage-product']);
    }
  }

}
