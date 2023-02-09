package com.bloggingApp.entitiesDtos;

public class UserDto {

	
	private long userId;
	
	private String userName;
	
	private String userMail;
	
	private String userPassword;
	
	private String userAbout;

//NoArgsConstructor.....................................................
	
	public UserDto() {
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
