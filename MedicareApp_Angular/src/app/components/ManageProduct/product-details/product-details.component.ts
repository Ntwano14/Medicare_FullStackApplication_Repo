import { MedicareService } from './../../../services/medicare.service';
// import { IProductList } from './../../../interfaces/product-list/product-list';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
  
  productList: any;
  constructor(private activatedRoute: ActivatedRoute, private medicareService: MedicareService) {}

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.paramMap.get('id');
    this.medicareService.getProductListById(Number(id)).subscribe(d => this.productList = d);
  

    // this.activatedRoute.params.subscribe( (params) => {
    //   this.medicareService.getProductListById(+params['id']).subscribe(data => this.productList = data);
    // });

  }
}
