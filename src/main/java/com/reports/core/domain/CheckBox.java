package com.reports.core.domain;

import java.util.List;

public class CheckBox {
	private String career;

	private String videoURL;

	private String name;

	private String searchUrl;

	private String buildingUrl;

	private List<JobsData> jobList;

	public CheckBox(String career, String videoURL, String name, String searchUrl, String buildingUrl,
			List<JobsData> jobList) {
		super();
		this.career = career;
		this.videoURL = videoURL;
		this.name = name;
		this.searchUrl = searchUrl;
		this.buildingUrl = buildingUrl;
		this.jobList = jobList;
	}

	public List<JobsData> getJobList() {
		return jobList;
	}

	public void setJobList(List<JobsData> jobData) {
		this.jobList = jobData;
	}

	public String getCareer ()
	{
		return career;
	}

	public void setCareer (String career)
	{
		this.career = career;
	}

	public String getVideoURL ()
	{
		return videoURL;
	}

	public void setVideoURL (String videoURL)
	{
		this.videoURL = videoURL;
	}

	public String getName ()
	{
		return name;
	}

	public void setName (String name)
	{
		this.name = name;
	}

	public String getSearchUrl ()
	{
		return searchUrl;
	}

	public void setSearchUrl (String searchUrl)
	{
		this.searchUrl = searchUrl;
	}

	public String getBuildingUrl ()
	{
		return buildingUrl;
	}

	public void setBuildingUrl (String buildingUrl)
	{
		this.buildingUrl = buildingUrl;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [career = "+career+", videoURL = "+videoURL+", name = "+name+", searchUrl = "+searchUrl+", buildingUrl = "+buildingUrl+"]";
	}

}
