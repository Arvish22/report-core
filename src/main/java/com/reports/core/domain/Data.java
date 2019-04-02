package com.reports.core.domain;

public class Data {
	
	 private String name;

	    private int y;

	    public Data(String name, int y) {
			super();
			this.name = name;
			this.y = y;
		}

		public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public int getY ()
	    {
	        return y;
	    }

	    public void setY (int y)
	    {
	        this.y = y;
	    }

	    @Override
	    public String toString()
	    {
	        return "[name = "+name+", y = "+y+"]";
	    }
}
