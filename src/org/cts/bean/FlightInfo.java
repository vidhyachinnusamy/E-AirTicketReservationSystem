package org.cts.bean;

public class FlightInfo {
	private String start, end, id, name, date, time;
	private int seat, fare;

	public FlightInfo(String string, String string2, String string3,
			String string4, String string5, String string6, int int1, int int2) {
		this.name = string;
		this.id = string2;
		this.start = string3;
		this.end = string4;
		this.date = string5;
		this.time = string6;
		this.seat = int1;
		this.fare = int2;
	}

	

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	

}
