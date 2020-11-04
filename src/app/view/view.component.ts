import { Component, OnInit } from '@angular/core';
import { EmployeeserviceService } from '../employeeservice.service';
import { Product } from '../Product';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  constructor(public service:EmployeeserviceService) { }
  response:Array<Product>=[]
  ngOnInit(): void {
    
  }

  viewProduct()
  {
    this.service.viewProduct()
  }

  searchProduct(productId:number)
  {
    this.service.searchProduct(productId)
  }

}
