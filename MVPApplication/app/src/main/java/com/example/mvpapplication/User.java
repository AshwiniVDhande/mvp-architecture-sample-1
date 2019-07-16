package com.example.mvpapplication;

/*
 * Created by Ashwini Dhande on 16-07-2019.
 */
public class User {
	private String fullName = "", email = "";
	
	public User() {
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Email : " + email + "\nFullName : " + fullName;
	}
}
