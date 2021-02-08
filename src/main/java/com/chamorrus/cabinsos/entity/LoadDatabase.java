package com.chamorrus.cabinsos.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(CustomerRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Customer("TEST COMPANY #1", "RESPONSIBLE1_FIRST_NAME",
					"RESPONSIBLE1_LAST_NAME", "RESPONSIBLE_1@EMAIL_EXAMPLE.COM")));
			log.info("Preloading " + repository.save(new Customer("TEST COMPANY #2", "RESPONSIBLE2_FIRST_NAME",
					"RESPONSIBLE2_LAST_NAME", "RESPONSIBLE_2@EMAIL_EXAMPLE.COM")));
			log.info("Preloading " + repository.save(new Customer("TEST COMPANY #3", "RESPONSIBLE3_FIRST_NAME",
					"RESPONSIBLE3_LAST_NAME", "RESPONSIBLE_3@EMAIL_EXAMPLE.COM")));
			log.info("Preloading " + repository.save(new Customer("TEST COMPANY #4", "RESPONSIBLE4_FIRST_NAME",
					"RESPONSIBLE4_LAST_NAME", "RESPONSIBLE_4@EMAIL_EXAMPLE.COM")));
		};
	}
}
