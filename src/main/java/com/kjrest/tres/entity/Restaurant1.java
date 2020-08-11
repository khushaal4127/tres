package com.kjrest.tres.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "restaurant1")
public class Restaurant1 {
	
	@Id
	@GeneratedValue
	@Column(name = "restId")
	private int restId;
	
	@Column(name = "restName")
	private String restName;

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}


	
}
