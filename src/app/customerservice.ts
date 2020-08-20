import { Customer } from './customer';

export interface Customerservice {

    getCustomers() : Customer[];
    setCustomers(test : Customer[]) : void;
    updateCustomer(customerId : number,customer : Customer) : Customer[];
}
