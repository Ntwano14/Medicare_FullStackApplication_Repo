import { MedicareService } from 'src/app/services/medicare.service';
import { AdminCreden } from './../../../Model/Credential/Admin/admin-creden';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit{


  adminCreden: AdminCreden[];
  constructor(private router: Router, private medicareService: MedicareService) {}

  ngOnInit(): void {
    this.medicareService.getAllAdmin().subscribe(data => this.adminCreden = data);
  }

  adminCred(user: any, pass: any) {
    // console.log(this.adminCreden[0]);
    for(let x of this.adminCreden){
      // console.log(x.username);
      // console.log(x.password);
      // console.log(user+" "+pass);
      if(x.username == user && x.password == pass) {
        // console.log("you are Logged In");
        this.router.navigate(['/manage-product'],{state: {u: x.username}});
      }else{
        alert("You Entered Wrong username & Password ! Try Again !");
      }
    }
  }


  changeAdmin() {
    this.router.navigate(['/manage-product/change-password']);
  }

}
