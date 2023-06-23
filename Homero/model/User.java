package model;

import java.io.Serializable;

public class User implements Serializable {
	private int id;
	private String userId;
	private String pass;
	
	public User() { }
	public User(String userId, String pass) {
		this.userId = userId;
		this.pass = pass;
	}
	public User(int id, String userId, String pass) {
		this.id = id;
		this.userId = userId;
		this.pass = pass;	
	}
	public int getId() {
		return id;
	}
	public String getUserId() {
		return userId;
	}
	public String getPass() {
		return pass;
	}
	

}
