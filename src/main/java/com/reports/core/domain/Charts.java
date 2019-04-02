package com.reports.core.domain;

import java.util.List;

public class Charts {
	
	 private String innerSize;

	    private int startAngle;

	    private List<Data> data;

	    private String videoURL;

	    private int endAngle;

	    private String name;

	    private String title;

	    private String graph;

	    private int marginLeft;

	    
	    public Charts(String innerSize, int startAngle, List<Data> data, String videoURL, int endAngle, String name,
				String title, String graph, int marginLeft) {
			super();
			this.innerSize = innerSize;
			this.startAngle = startAngle;
			this.data = data;
			this.videoURL = videoURL;
			this.endAngle = endAngle;
			this.name = name;
			this.title = title;
			this.graph = graph;
			this.marginLeft = marginLeft;
		}

		public String getInnerSize ()
	    {
	        return innerSize;
	    }

	    public void setInnerSize (String innerSize)
	    {
	        this.innerSize = innerSize;
	    }

	    public int getStartAngle ()
	    {
	        return startAngle;
	    }

	    public void setStartAngle (int startAngle)
	    {
	        this.startAngle = startAngle;
	    }

	    public List<Data> getData ()
	    {
	        return data;
	    }

	    public void setData (List<Data> data)
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

	    public int getEndAngle ()
	    {
	        return endAngle;
	    }

	    public void setEndAngle (int endAngle)
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

	    public int getMarginLeft ()
	    {
	        return marginLeft;
	    }

	    public void setMarginLeft (int marginLeft)
	    {
	        this.marginLeft = marginLeft;
	    }

	    @Override
	    public String toString()
	    {
	        return "[innerSize = "+innerSize+", startAngle = "+startAngle+", data = "+data+", videoURL = "+videoURL+", endAngle = "+endAngle+", name = "+name+", title = "+title+", graph = "+graph+", marginLeft = "+marginLeft+"]";
	    }
}
