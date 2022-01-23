package com.chamorrus.cabinsos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Dashboard controller that will handle basic GET requests.
 * 
 * TODO: The goal of this controller is to serve content based on metrics.
 * 
 * @author chamorrus
 *
 */
@Controller
public class DashboardController {

	@GetMapping("/dashboard")
	public String getDashboard(Model model) {
		return "dashboard";
	}
}
