package com.cg.Customer.dao;

import com.cg.Customer.entity.CustomerEntity;

public interface CustomerDao {

	CustomerEntity update(int customerId, String fullName, String city, Integer zipCode, String country);

}
