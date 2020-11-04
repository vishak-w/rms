import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Employee } from 'Employee';
import { EmployeeserviceService } from '../employeeservice.service';
import { Product } from '../Product';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(public service:EmployeeserviceService) { }
  product:Product=new Product
  ngOnInit(): void {
  }

  save()
  {
this.service.addProduct(this.product)
  }
  onSubmit() {
    
    this.save();    
  }
}
