import { Customer } from './../../../Model/Customer/customer';
import { MedicareService } from 'src/app/services/medicare.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order-list',
  templateUrl: './order-list.component.html',
  styleUrls: ['./order-list.component.css']
})
export class OrderListComponent implements OnInit{

  orderList: any;

  constructor(private router: Router, private medicareService: MedicareService) {}

  ngOnInit(): void {
    this.medicareService.getAllOrderList().subscribe(data => this.orderList = data);
  }

  orderDelete(id: number) {
    this.medicareService.deleteCustomerProductDetailsById(Number(id)).subscribe(data => console.log(data));
    this.orderList = this.orderList.filter((x: { cusId: number; }) => x.cusId !== id)
  }


}
