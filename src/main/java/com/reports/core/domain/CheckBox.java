package com.reports.core.domain;

public class CheckBox {
	 private String career;

	    private String videoURL;

	    private String name;

	    private String searchUrl;

	    private String buildingUrl;

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
