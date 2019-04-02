package com.reports.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reports.core.service.ChartService;

@RestController
public class ChartController {
	
//	@Autowired
//	ChartService chartService;

	@RequestMapping(value = "/api/charts", method = RequestMethod.GET)
	public ResponseEntity<String> getCharts(){
		
		 return ResponseEntity.ok().
				  contentType(MediaType.APPLICATION_JSON).body("");
	}
}
