package com.reports.core.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reports.core.dao.CheckInDao;
import com.reports.core.domain.Career;
import com.reports.core.domain.CheckBox;
import com.reports.core.service.CheckInService;
@Service
public class CheckInServiceImpl implements CheckInService {
@Autowired
CheckInDao checkInDao;
	@Override
	public List<Career> careerSelector(String institution) {
	
		
		List<Career> lc=checkInDao.careerSelector(institution);
		
		return lc;
	}
	@Override
	public List<CheckBox> careerJobs(String jobName){
		
		List<CheckBox> cb=checkInDao.careerJobs(jobName);
		
		
		return cb;
	}
	
}
