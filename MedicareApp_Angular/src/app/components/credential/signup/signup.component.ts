import { MedicareService } from 'src/app/services/medicare.service';
import { CustomerCreden } from './../../../Model/Credential/Customer/customer-creden';
import { Router } from '@angular/router';
import { Component } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {

  custCreden: CustomerCreden;

  constructor(private router: Router, private medicareService: MedicareService) {}


  signup(username:any, password:any) {
    // console.log(username+" "+password);

    this.custCreden = {
      username: username,
      password: password
    }

    this.medicareService.saveCustomerCreden(this.custCreden).subscribe(x=> alert("you Data Save Successfully ! Now You Can Logged In."));
  }

  switchLogin(): any {
    this.router.navigate(['login']);
  }

}
