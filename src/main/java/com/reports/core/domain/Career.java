package com.reports.core.domain;

public class Career {
	private String videoURL;

    private String Videoname;

    private String id;

    private String Name;

    public String getVideoURL ()
    {
        return videoURL;
    }

    public void setVideoURL (String videoURL)
    {
        this.videoURL = videoURL;
    }

    public String getVideoname ()
    {
        return Videoname;
    }

    public void setVideoname (String Videoname)
    {
        this.Videoname = Videoname;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [videoURL = "+videoURL+", Videoname = "+Videoname+", id = "+id+", Name = "+Name+"]";
    }
	
    }
