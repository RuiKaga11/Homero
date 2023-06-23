package model;

import java.io.Serializable;
import java.util.Date;

public class Mutter implements Serializable {
	private int id;
	private String userId;
	private Date mutterDate;
	private String category;
	private int hour;
	private int minute;
	
	public Mutter() {}
	
	public Mutter(String userId, Date mutterDate, String category, int hour, int minute) {
		this.userId = userId;
		this.mutterDate = mutterDate;
		this.category = category;
		this.hour = hour;
		this.minute = minute;
	}
	public Mutter(int id, String userId, Date mutterDate, String category, int hour, int minute) {
		this.id = id;
		this.userId = userId;
		this.mutterDate = mutterDate;
		this.category = category;
		this.hour = hour;
		this.minute = minute;
	}

	public int getId() {
		return id;
	}

	public String getUserId() {
		return userId;
	}

	public Date getMutterDate() {
		return mutterDate;
	}

	public String getCategory() {
		return category;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

}
