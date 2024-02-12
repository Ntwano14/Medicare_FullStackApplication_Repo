import { MedicareService } from 'src/app/services/medicare.service';
import { CustomerCreden } from './../../../Model/Credential/Customer/customer-creden';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{

  customerCreden: CustomerCreden[];

  constructor(private router: Router, private medicareService: MedicareService) {}
  
  ngOnInit(): void {
    this.medicareService.getAllCustomerCreden().subscribe(data => this.customerCreden = data);
  }

  login(custUser:any, custPass:any) {

    console.log(custUser+" "+custPass);
    for(let x of this.customerCreden) {

      if(x.username == custUser && x.password == custPass) {
        this.router.navigate(['/product']);
      }
    }

  }

  switchSignUp(): any {
    this.router.navigate(['signup']);
  }

}
