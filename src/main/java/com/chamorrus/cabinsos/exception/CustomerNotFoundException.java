package com.chamorrus.cabinsos.exception;

public class CustomerNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3406399882462067400L;

	public CustomerNotFoundException(Long id) {
		// TODO localize messages
		super("Could not find customer " + id);
	}

}