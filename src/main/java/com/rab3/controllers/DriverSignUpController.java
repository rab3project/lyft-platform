package com.rab3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rab3.dtos.DriverSignUpDto;
import com.rab3.services.DriverSignUpService;

@Controller 
@RequestMapping(value="register")
public class DriverSignUpController {

	private DriverSignUpService driverSignUpService;
	
	@RequestMapping(value="driver", method = RequestMethod.POST)
	public void createDriver(DriverSignUpDto driverSignUpDto) {
		driverSignUpService.DriverRegister(driverSignUpDto);
	}
	
}
