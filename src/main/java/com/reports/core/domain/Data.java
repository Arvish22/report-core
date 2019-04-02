package com.reports.core.domain;

public class Data {
	
	 private String name;

	    private String y;

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getY ()
	    {
	        return y;
	    }

	    public void setY (String y)
	    {
	        this.y = y;
	    }

	    @Override
	    public String toString()
	    {
	        return "[name = "+name+", y = "+y+"]";
	    }
}
