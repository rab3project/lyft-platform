package com.rab3.controllers;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rab3.dtos.DriverSignUpDto;
import com.rab3.services.DriverSignUpService;

@RestController 
//@RequestMapping(value="/register")
public class DriverSignUpController {

	private DriverSignUpService driverSignUpService;
	
	@RequestMapping(value="driver", method = RequestMethod.POST)
	public void createDriver(@RequestBody DriverSignUpDto driverSignUpDto) {
		driverSignUpService.DriverRegister(driverSignUpDto);
	}
	
	@RequestMapping(value="/driver", method = RequestMethod.GET)
	public void test() {
		System.out.println("This is test");
	}

	public DriverSignUpService getDriverSignUpService() {
		return driverSignUpService;
	}

	public void setDriverSignUpService(DriverSignUpService driverSignUpService) {
		this.driverSignUpService = driverSignUpService;
	}
	
	
	
}
