package com.servletStore.settings.section.model;

public class SectionPojo 
{

	private int id;
	private String name;
	
	
	
	public SectionPojo() {
		
	}
	public SectionPojo(String name) {
		
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
