package com.cg.Customer.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Customer.entity.CustomerEntity;
import com.cg.Customer.exception.CustomerException;
import com.cg.Customer.service.CustomerServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerService;

	@PutMapping("customer/{customerid}")
	public ResponseEntity<String> updateCustomer(@PathVariable("customerId") String customerId,
			@RequestBody CustomerEntity customer) throws CustomerException {

		CustomerEntity customers = customerService.update(customer.getCustomerId(), customer.getFullName(),
				customer.getCity(), customer.getZipCode(), customer.getCountry());
		if (customers == null)
			throw new CustomerException("No CustomerEntity With Entered CustomerID Is Found To Update !!");
		else
			return new ResponseEntity<String>("Customer Updated Successfully !!", HttpStatus.OK);
	}

}
