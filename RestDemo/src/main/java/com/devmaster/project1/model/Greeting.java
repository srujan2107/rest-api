package com.devmaster.project1.model;


public class Greeting {

	private long id;
	private String content;
	
	//Constructor
	public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
	
	//Setters & Getters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
