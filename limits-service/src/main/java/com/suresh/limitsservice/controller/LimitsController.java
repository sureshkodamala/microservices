package com.suresh.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.limitsservice.configuration.Configuration;
import com.suresh.limitsservice.dto.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}

}
