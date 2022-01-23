package com.chamorrus.cabinsos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
 * Spring boot application that manages in-memory CRUD operations 
 * with an H2 database and jpa.
 * 
 * @author chamorrus
 *
 */
@SpringBootApplication
public class CabinsosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabinsosApplication.class, args);
	}

}
