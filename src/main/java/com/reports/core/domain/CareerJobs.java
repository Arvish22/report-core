package com.reports.core.domain;

import java.util.List;

public class CareerJobs {
	

	private String career;
	private List jobsData;
	
	
	public CareerJobs(String career, List jobsData) {
		super();
		this.career = career;
		this.jobsData = jobsData;
	}
	
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public List getJobsData() {
		return jobsData;
	}
	public void setJobsData(List jobsData) {
		this.jobsData = jobsData;
	}
}
