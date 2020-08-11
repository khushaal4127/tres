package com.kjrest.tres.entity;
 
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "bookingtable")
public class Bookingtable {
	
	@Id
	@GeneratedValue
	@Column(name = "bookingId")
	private int bookingId;
	
	

	@Column(name = "timeIn")
	private Timestamp timeIn;
	
	@Column(name = "timeOut")
	private Timestamp timeOut;
	
	//@Column(name = "users_user_id")
	//private int users_user_id;
	
	//@Column(name = "restaurants_rest_id")
	//private int restaurants_rest_id;
	
	@Column(name = "tableNo")
	private int tableNo;
	
	@ManyToOne(targetEntity = User1.class , cascade= CascadeType.ALL)
	@JoinColumn(name = "userId" ,referencedColumnName = "userId")
	private User1 user;
	
	@ManyToOne(targetEntity = Restaurant1.class , cascade= CascadeType.ALL)
	@JoinColumn(name = "restId",referencedColumnName = "restId")
	private Restaurant1 restaurant;
	
	
	


	public User1 getUobj() {
		return user;
	}

	public void setUobj(User1 uobj) {
		this.user = uobj;
	}

	public Restaurant1 getRobj() {
		return restaurant;
	}

	public void setRobj(Restaurant1 robj) {
		this.restaurant = robj;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Timestamp getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(Timestamp timeIn) {
		this.timeIn = timeIn;
	}

	public Timestamp getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Timestamp timeOut) {
		this.timeOut = timeOut;
	}

	public int getTableNo() {
		return tableNo;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	
	

}
