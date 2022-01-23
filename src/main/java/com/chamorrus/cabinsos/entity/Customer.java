package com.chamorrus.cabinsos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Customer entity class. 
 * 
 * Each entity is identified by its id field which is automatically generated.
 * 
 * @author chamorrus
 *
 */
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String companyName;
	private String firstName;
	private String lastName;
	private String emailAddress;

	protected Customer() {
	}

	public Customer(String companyName, String firstName, String lastName, String emailAddress) {
		this.companyName = companyName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, companyName='%s', firstName='%s', lastName='%s', email='%s']", id,
				companyName, firstName, lastName, emailAddress);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
