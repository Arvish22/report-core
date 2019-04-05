package com.reports.core.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "*")
public class CareerCheckin {

	@RequestMapping(value = "/checkindata", method = RequestMethod.GET)
	public String getCheckinData() {
		return "sariha";
	}
}
