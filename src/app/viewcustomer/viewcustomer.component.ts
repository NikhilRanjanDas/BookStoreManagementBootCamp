import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerimplService } from '../customerimpl.service';

@Component({
  selector: 'app-viewcustomer',
  templateUrl: './viewcustomer.component.html',
  styleUrls: ['./viewcustomer.component.css']
})
export class ViewcustomerComponent implements OnInit {

  customers: Customer[] = [];
  customer: Customer = new Customer();


  editFlag: boolean = false;
  constructor(private customerimplService: CustomerimplService) { }

  ngOnInit(): void {
  }

  updateCustomer(customerId: number) {

    let tmpcustomers: Customer[] = this.customerimplService.getCustomers().filter(customer => customer.customerId == customerId);
    if (tmpcustomers.length > 0) {
      this.customer = tmpcustomers[0];
      this.editFlag = true;
      }
    }
  editCustomer(): void {
    this.customerimplService.updateCustomer(this.customer.customerId,this.customer);
      this.editFlag = false;
    }

}
