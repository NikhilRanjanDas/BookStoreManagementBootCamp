package com.cg.Customer.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Customer.dao.CustomerDao;
import com.cg.Customer.entity.CustomerEntity;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customer_dao_interface;

	@Override
	public CustomerEntity update(int customerId, String fullName, String city, Integer zipCode, String Country) {
		return customer_dao_interface.update(customerId, fullName, city, zipCode, Country);
	}
}
