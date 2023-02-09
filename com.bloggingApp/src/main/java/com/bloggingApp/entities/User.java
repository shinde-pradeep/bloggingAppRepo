package com.bloggingApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="user_info")
public class User {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private long userId;
	
	@Column(name="user_nname",length=50,nullable=false)
	private String userName;
	
	private String userMail;
	
	private String userPassword;
	
	private String userAbout;

	
	
//NoArgsConstructor.....................................................
		
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
//Getter and Setter......................................................	

	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserAbout() {
		return userAbout;
	}

	public void setUserAbout(String userAbout) {
		this.userAbout = userAbout;
	}
	
	
	
	
	
}
