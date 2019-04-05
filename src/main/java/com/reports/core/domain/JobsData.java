package com.reports.core.domain;

public class JobsData {
	
	private String skills;
	private String education;
	private String tasks;
	private String technologies;
	private String opportunities;
	
	public JobsData(String skills, String education, String tasks, String technologies, String opportunities) {
		super();
		this.skills = skills;
		this.education = education;
		this.tasks = tasks;
		this.technologies = technologies;
		this.opportunities = opportunities;
	}
	
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getTasks() {
		return tasks;
	}
	public void setTasks(String tasks) {
		this.tasks = tasks;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	public String getOpportunities() {
		return opportunities;
	}
	public void setOpportunities(String opportunities) {
		this.opportunities = opportunities;
	}
}
