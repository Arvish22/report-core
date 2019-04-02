package com.reports.core.domain;

public class Charts {
	
	 private String innerSize;

	    private String startAngle;

	    private Data[] data;

	    private String videoURL;

	    private String endAngle;

	    private String name;

	    private String title;

	    private String graph;

	    private String marginLeft;

	    public String getInnerSize ()
	    {
	        return innerSize;
	    }

	    public void setInnerSize (String innerSize)
	    {
	        this.innerSize = innerSize;
	    }

	    public String getStartAngle ()
	    {
	        return startAngle;
	    }

	    public void setStartAngle (String startAngle)
	    {
	        this.startAngle = startAngle;
	    }

	    public Data[] getData ()
	    {
	        return data;
	    }

	    public void setData (Data[] data)
	    {
	        this.data = data;
	    }

	    public String getVideoURL ()
	    {
	        return videoURL;
	    }

	    public void setVideoURL (String videoURL)
	    {
	        this.videoURL = videoURL;
	    }

	    public String getEndAngle ()
	    {
	        return endAngle;
	    }

	    public void setEndAngle (String endAngle)
	    {
	        this.endAngle = endAngle;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getTitle ()
	    {
	        return title;
	    }

	    public void setTitle (String title)
	    {
	        this.title = title;
	    }

	    public String getGraph ()
	    {
	        return graph;
	    }

	    public void setGraph (String graph)
	    {
	        this.graph = graph;
	    }

	    public String getMarginLeft ()
	    {
	        return marginLeft;
	    }

	    public void setMarginLeft (String marginLeft)
	    {
	        this.marginLeft = marginLeft;
	    }

	    @Override
	    public String toString()
	    {
	        return "[innerSize = "+innerSize+", startAngle = "+startAngle+", data = "+data+", videoURL = "+videoURL+", endAngle = "+endAngle+", name = "+name+", title = "+title+", graph = "+graph+", marginLeft = "+marginLeft+"]";
	    }
}
