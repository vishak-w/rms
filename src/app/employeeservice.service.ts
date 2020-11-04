import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from 'Employee';
import { Product } from './Product';

@Injectable({
  providedIn: 'root'
})
export class EmployeeserviceService {

  response:Array<Product>=[]
  
   private baseUrl="http://localhost:8080/api/v1/rms"
    product:Product=new Product;

  constructor(public httpcli:HttpClient) { }

  addProduct(product:Object)
  {
    this.httpcli.post(`${this.baseUrl}/addProduct`,product).subscribe((res:any)=>
    {
    this.response=res
    })
    this.product=new Product;

  }
  viewProduct()
  {
    this.httpcli.get(`${this.baseUrl}/showAllProducts`).subscribe((res:any)=>
    {
      this.response=res
      console.log(res)
    })
  }

  searchProduct(productId:number)
  {
    this.httpcli.get(`${this.baseUrl}/searchProduct/${productId}`).subscribe((res:any)=>
    {
      this.product=res
      console.log(res)
    })
  }


}
