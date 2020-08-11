package com.kjrest.tres.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "user1")
public class User1 {
	
	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "userName")
	private String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserid(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

}
