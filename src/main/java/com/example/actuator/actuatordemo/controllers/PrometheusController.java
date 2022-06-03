package com.example.actuator.actuatordemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrometheusController {
	
	@GetMapping("/getorderdetails")
	public String getOrderDetails() {
		return "This is my first order";
	}

}
