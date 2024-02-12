import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home-product',
  templateUrl: './home-product.component.html',
  styleUrls: ['./home-product.component.css']
})
export class HomeProductComponent implements OnInit{

  username: any;

  constructor(private router: Router) {
    this.username = this.router.getCurrentNavigation()?.extras.state?.['u'];
    // console.log(this.username);
  }
  ngOnInit(): void {
    
  }



}
