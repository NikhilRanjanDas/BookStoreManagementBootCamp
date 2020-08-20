import { Injectable } from '@angular/core';
import { Customer } from './customer';
import { Customerservice } from './customerservice';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerimplService implements Customerservice {

  private customer: Customer[] = [];

  constructor(private http: HttpClient) {}
  getCustomers(): Customer[] {
    return this.customer;
  }
  setCustomers(customer: Customer[]): void {
    this.customer=customer;
  }
  updateCustomer(customerId: number, customer: Customer): Customer[] {
    this.http.put("http://localhost:8068/customer/"+customerId,customer).subscribe(data=>{
      console.log(data);
    });
    return this.customer;
  }
}
