package com.cg.Customer.service;

import com.cg.Customer.entity.CustomerEntity;

public interface CustomerService {

	CustomerEntity update(int customerId, String fullName, String city, Integer zipCode, String country);

}
