package com.demo.microservices.limitsservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservices.limitsservice.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationContoller {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("limits")
	public LimitsConfiguration retrieveLimitsFromConfigurations() {
		return new LimitsConfiguration(config.getMaximun(), config.getMinimun());
	}

}
