package com.xangars.XangarsAPI.Entities;

public class Login 
{
	private long id;
	private String userName;
	private String email;
	
	
	public Login(long id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

	public Login() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	
	
	

}
