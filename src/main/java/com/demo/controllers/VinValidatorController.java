package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.VinValidatorService;

@RestController
public class VinValidatorController {
	
	@Autowired
	VinValidatorService vinValidatorService;

	@GetMapping(path = "/validate/{vin}", produces = "application/json")
	public Boolean validate(@PathVariable("vin") String vin) {
		return vinValidatorService.validate(vin);
	}
}
