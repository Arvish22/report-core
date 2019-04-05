package com.reports.core.domain;

public class Career {
	private String videoURL;

	private String name;

    private String id;

    private String cardName;
    
    public Career(String videoURL, String name, String id, String cardName) {
		super();
		this.videoURL = videoURL;
		this.name = name;
		this.id = id;
		this.cardName = cardName;
	}


	public String getVideoURL() {
		return videoURL;
	}


	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCardName() {
		return cardName;
	}


	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

    @Override
    public String toString()
    {
        return "ClassPojo [videoURL = "+videoURL+", Videoname = "+name+", id = "+id+", Name = "+cardName+"]";
    }
	
    }
