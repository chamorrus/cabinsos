package com.chamorrus.cabinsos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.chamorrus.cabinsos.entity.Customer;
import com.chamorrus.cabinsos.entity.CustomerRepository;
import com.chamorrus.cabinsos.exception.CustomerNotFoundException;

@Controller
public class CustomerController {

	private CustomerRepository repository;

	public CustomerController(CustomerRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/customers")
	public String getAllCustomers(Model model) {
		model.addAttribute("customers", repository.findAll());
		return "customers";
	}

	@GetMapping("/customers/{id}")
	public String getOneCustomer(@PathVariable Long id, Model model) {
		model.addAttribute("customer", repository.findById(id).orElseThrow(() -> new CustomerNotFoundException(id)));
		return "customer_detail";
	}

	@PostMapping("/customers/{id}")
	public String updateCustomer(Customer updatedCustomer, @PathVariable Long id) {
		Customer existingCustomer = repository.findById(id).orElseThrow(() -> new CustomerNotFoundException(id));
		existingCustomer.setCompanyName(updatedCustomer.getCompanyName());
		existingCustomer.setFirstName(updatedCustomer.getFirstName());
		existingCustomer.setLastName(updatedCustomer.getLastName());
		existingCustomer.setEmailAddress(updatedCustomer.getEmailAddress());
		repository.save(existingCustomer);
		return "redirect:/customers";
	}

	@GetMapping("/customers/new")
	public String createNewCustomer(Model model) {
		model.addAttribute("customer", new Customer(null, null, null, null));
		return "customer_new";
	}

	@PostMapping("/customers/new")
	public String saveNewCustomer(Customer customer) {
		repository.save(customer);
		return "redirect:/customers";
	}

	@GetMapping("/customers/{id}/menu")
	public String getCustomerMenu(@PathVariable Long id, Model model) {
		return "customer_detail";
	}
}
