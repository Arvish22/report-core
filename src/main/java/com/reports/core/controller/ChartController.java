package com.reports.core.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reports.core.domain.Charts;
import com.reports.core.service.ChartService;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "*")
public class ChartController {
	
	static final Logger LOGGER = LoggerFactory.getLogger(ChartController.class);
	@Autowired 
	ChartService chartService;

	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public ResponseEntity<List<Charts>> getCharts(){
		
		LOGGER.info("Entering getCharts controller");
		List<Charts> chartList = chartService.getCharts();
		
		return ResponseEntity.ok().
				contentType(MediaType.APPLICATION_JSON).body(chartList);
	}
}
