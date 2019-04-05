package com.reports.core.domain;

public class JobsData {
	
	private String tittle;
	private String value;
	
	public JobsData(String tittle, String value) {
		super();
		this.tittle = tittle;
		this.value = value;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
