package com.reports.core.dao;

import java.util.List;

import com.reports.core.domain.Career;
import com.reports.core.domain.CareerJobs;
import com.reports.core.domain.CheckBox;

public interface CheckInDao {

	public List<Career> careerSelector(String institution);

	public List<CheckBox> careerJobs(String jobName);
	
	public List<CareerJobs> careerJobsData(String jobName);
}
