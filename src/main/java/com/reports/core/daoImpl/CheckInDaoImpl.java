package com.reports.core.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.reports.core.dao.CheckInDao;
import com.reports.core.domain.Career;
import com.reports.core.domain.CheckBox;
import com.reports.core.domain.JobsData;
@Repository
public class CheckInDaoImpl implements CheckInDao {

	@Override
	public List<Career> careerSelector(String institution) {
	
		Career career=new Career();
		Career career1=new Career();
		Career career2=new Career();

		List<Career> lc=new ArrayList<Career>();
		
		career.setId("1");
		career.setName("Agriculture");
		
		career1.setId("2");
		career1.setName("Information Technologies");
		
		career2.setId("3");
		career2.setName("Construction");
		
		lc.add(career);
		lc.add(career1);
		lc.add(career2);
		
		return lc;
	}
	
	@Override
	public List<CheckBox> careerJobs(String jobName){
		
		List<CheckBox> checkBoxList = new ArrayList<CheckBox>();
		
		JobsData jobsData = new JobsData("JAVA", "BSC", "task1", "Java Tech", "post grad, IT job");
		
		CheckBox checkBox  = new CheckBox("Mashroom-1", "https://www.youtube.com/embed/zdCiaXPE8JQ", "Mr.APJ", "google.com", "google.com", jobsData);
		CheckBox checkBox_1 = new CheckBox("Mashroom-1", "https://www.youtube.com/embed/zdCiaXPE8JQ", "Mr.APJ", "google.com", "google.com", jobsData);
		CheckBox checkBox_2 = new CheckBox("Mashroom-1", "https://www.youtube.com/embed/zdCiaXPE8JQ", "Mr.APJ", "google.com", "google.com", jobsData);
		
		checkBoxList.add(checkBox);
		checkBoxList.add(checkBox_1);
		checkBoxList.add(checkBox_2);
		
		return checkBoxList;
	}

}
