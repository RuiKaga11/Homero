package model;

import java.io.Serializable;

//javabeans
public class User implements Serializable{
	private String UserId;
	private String pass;

	public User() {}

	public User(String UserId,String pass) {
		this.UserId = UserId;
		this.pass = pass;
	}

	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}


}
