package com.chamorrus.cabinsos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

	@GetMapping("/customers")
	public String getAllCustomers(Model model) {
		return "customers";
	}
}
