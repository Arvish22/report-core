package com.reports.core.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reports.core.controller.CheckInController;
import com.reports.core.dao.CheckInDao;
import com.reports.core.domain.Career;
import com.reports.core.domain.CareerJobs;
import com.reports.core.domain.CheckBox;
import com.reports.core.service.CheckInService;


@Service
public class CheckInServiceImpl implements CheckInService {


	static final Logger LOGGER = LoggerFactory.getLogger(CheckInServiceImpl.class);

	@Autowired
	CheckInDao checkInDao;
	
	@Override
	public List<Career> careerSelector(String institution) {
		LOGGER.info("Entering careerSelector() service");
		List<Career> careerList=checkInDao.careerSelector(institution);
		return careerList;
	}
	
	@Override
	public List<CheckBox> careerJobs(String jobName){
		LOGGER.info("Entering careerJobs() service");
		List<CheckBox> checkBoxList =checkInDao.careerJobs(jobName);
		return checkBoxList;
	}
	
	@Override
	public List<CareerJobs> careerJobsData(String jobName){
		LOGGER.info("Entering careerJobs() service");
		List<CareerJobs> jobsData =checkInDao.careerJobsData(jobName);
		return jobsData;
	}
}
