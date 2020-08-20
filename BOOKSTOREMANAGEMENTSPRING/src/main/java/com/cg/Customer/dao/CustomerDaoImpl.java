package com.cg.Customer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.Customer.entity.CustomerEntity;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public CustomerEntity update(int customerId, String fullName, String city, Integer zipCode, String country) {
		CustomerEntity customer = em.find(CustomerEntity.class, customerId);
		if (customer == null) {
			return null;
		} else {
			customer.setFullName(fullName);
			customer.setCity(city);
			customer.setZipCode(zipCode);
			customer.setCountry(country);
		}
		return em.merge(customer);

	}

}
