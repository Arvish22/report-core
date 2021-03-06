package com.reports.core.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.reports.core.controller.CheckInController;
import com.reports.core.dao.CheckInDao;
import com.reports.core.domain.Career;
import com.reports.core.domain.CareerJobs;
import com.reports.core.domain.CheckBox;
import com.reports.core.domain.JobsData;
@Repository
public class CheckInDaoImpl implements CheckInDao {
	
	static final Logger LOGGER = LoggerFactory.getLogger(CheckInDaoImpl.class);

	@Override
	public List<Career> careerSelector(String institution) {
		LOGGER.info("Entering dao careerSelector() method");
		List<Career> careerList=new ArrayList<Career>();	
		careerList.add(new Career("https://www.youtube.com/embed/zdCiaXPE8JQ", "Mr.APJ", "1", "Agriculture"));
		careerList.add(new Career("https://www.youtube.com/embed/mpfxsvBPWEs", "Mr.SUNDAR", "2", "Information Technologies"));
		careerList.add(new Career("https://www.youtube.com/embed/BxY_eJLBflk", "Mr.DENZEL", "3", "Construction"));
		return careerList;
	}
	
	@Override
	public List<CheckBox> careerJobs(String jobName){
		LOGGER.info("Entering dao careerJobs() method");
		List<CheckBox> checkBoxList = new ArrayList<CheckBox>();
		List<JobsData> jobsDataList = new ArrayList<JobsData>();
		jobsDataList.add(new JobsData("skill", "JAVA"));
		jobsDataList.add(new JobsData("Technologies", "JAVA tech"));
		jobsDataList.add(new JobsData("Education", "BSC"));
		jobsDataList.add(new JobsData("Tasks", "Task-1"));
		jobsDataList.add(new JobsData("Opportunities", "go home"));
		CheckBox checkBox  = new CheckBox("Mashroom-1", "https://www.youtube.com/embed/zdCiaXPE8JQ", "Mr.APJ", "google.com", "google.com", jobsDataList);
		CheckBox checkBox_1 = new CheckBox("Mashroom-1", "https://www.youtube.com/embed/zdCiaXPE8JQ", "Mr.APJ", "google.com", "google.com", jobsDataList);
		CheckBox checkBox_2 = new CheckBox("Mashroom-1", "https://www.youtube.com/embed/zdCiaXPE8JQ", "Mr.APJ", "google.com", "google.com", jobsDataList);
		
		checkBoxList.add(checkBox);
		checkBoxList.add(checkBox_1);
		checkBoxList.add(checkBox_2);
		
		return checkBoxList;
	}

	@Override
	public List<CareerJobs> careerJobsData(String jobName) {
		LOGGER.info("Entering dao careerJobsData() method");
		 List<CareerJobs> careerJobsList=new ArrayList<CareerJobs>();
	        List<JobsData> jobsDataList = new ArrayList<JobsData>();
	        jobsDataList.add(new JobsData("skill", "JAVA"));
	        jobsDataList.add(new JobsData("Technologies", "JAVA tech"));
	        jobsDataList.add(new JobsData("Education", "BSC"));
	        jobsDataList.add(new JobsData("Tasks", "Task-1"));
	        jobsDataList.add(new JobsData("Opportunities", "go home"));
	        careerJobsList.add(new CareerJobs(jobName, jobsDataList));
	        return careerJobsList;
	}

}
