package com.chamorrus.cabinsos.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * Default CRUD repository. 
 * 
 * @author chamorrus
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);
}