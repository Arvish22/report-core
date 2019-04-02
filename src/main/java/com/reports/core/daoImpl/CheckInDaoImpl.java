package com.reports.core.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.reports.core.dao.CheckInDao;
import com.reports.core.domain.Career;
import com.reports.core.domain.CheckBox;
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
		
		List<CheckBox> cb=new ArrayList<CheckBox>();
		CheckBox c=new CheckBox();
		c.setName("Mr.APJ");
		c.setBuildingUrl("google.com");
		c.setCareer("Mashroom-1");
		c.setSearchUrl("google.com");
		c.setVideoURL("https://www.youtube.com/embed/zdCiaXPE8JQ");
		cb.add(c);
		
		return cb;
	}

}
