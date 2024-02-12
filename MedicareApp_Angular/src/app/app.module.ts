import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {NgxTypedJsModule} from 'ngx-typed-js';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Ng2SearchPipeModule } from 'ng2-search-filter';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { CardComponent } from './components/card/card.component';
import { ProductComponent } from './components/product/product.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { FooterComponent } from './components/footer/footer.component';
import { DescCardComponent } from './components/desc-card/desc-card.component';
import { HomeComponent } from './components/home/home.component';
import { CartComponent } from './components/cart/cart.component';
import { CartCardComponent } from './components/cart-card/cart-card.component';
import { AdminComponent } from './components/credential/admin/admin.component';
import { LoginComponent } from './components/credential/login/login.component';
import { SignupComponent } from './components/credential/signup/signup.component';
import { AddProductComponent } from './components/ManageProduct/add-product/add-product.component';
import { EditProductComponent } from './components/ManageProduct/edit-product/edit-product.component';
import { ProductDetailsComponent } from './components/ManageProduct/product-details/product-details.component';
import { ProductListComponent } from './components/ManageProduct/product-list/product-list.component';
import { HomeProductComponent } from './components/ManageProduct/home-product/home-product.component';
import { ChangePasswordComponent } from './components/ManageProduct/change-password/change-password.component';
import { OrderListComponent } from './components/ManageProduct/order-list/order-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CardComponent,
    ProductComponent,
    AboutComponent,
    ContactComponent,
    FooterComponent,
    DescCardComponent,
    HomeComponent,
    CartComponent,
    CartCardComponent,
    AdminComponent,
    LoginComponent,
    SignupComponent,
    AddProductComponent,
    EditProductComponent,
    ProductDetailsComponent,
    ProductListComponent,
    HomeProductComponent,
    ChangePasswordComponent,
    OrderListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgxTypedJsModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
