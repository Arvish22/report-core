package com.reports.core.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reports.core.domain.Career;
import com.reports.core.domain.CheckBox;
import com.reports.core.service.CheckInService;


@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "*")
public class CheckInController {
	
	@Autowired(required=true)
	CheckInService checkInService;

	@RequestMapping(value = "/careerselector", method = RequestMethod.POST)
	public ResponseEntity<List<Career>> careerSelector(@RequestBody String institution) {
		List<Career> careerList = checkInService.careerSelector(institution);
		return ResponseEntity.ok().body(careerList);
	}

	@RequestMapping(value = "/careerjobs", method = RequestMethod.POST)
	public ResponseEntity<List<CheckBox>> careerJobs(@RequestBody String jobName) {
		List<CheckBox>  checkBoxList = checkInService.careerJobs(jobName);
		return ResponseEntity.ok().body(checkBoxList);
	}
}
