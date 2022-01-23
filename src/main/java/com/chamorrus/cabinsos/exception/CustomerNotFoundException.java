package com.chamorrus.cabinsos.exception;

/**
 * Custom CustomerNotFound exception
 * 
 * @author chamorrus
 *
 */
public class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3406399882462067400L;

	public CustomerNotFoundException(Long id) {
		// TODO localize messages
		super("Could not find customer " + id);
	}

}