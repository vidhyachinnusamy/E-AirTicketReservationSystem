package org.cts.bean;

public class ShowInvoice {
	private int bid;
	private String fid;
	private String from;
	private String to;
	private String doj;
	private String dtime;
	private int tfare;
	private int seats;
	private String status;
private String date;
	public ShowInvoice(int bid, String fid, String from,
			String to, String doj, String dtime, int tfare, int seats,
			String status, String date) {
		super();
		this.bid = bid;
		this.fid = fid;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.dtime = dtime;
		this.tfare = tfare;
		this.seats = seats;
		this.status = status;
		this.date=date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}



	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}

	public int getTfare() {
		return tfare;
	}

	public void setTfare(int tfare) {
		this.tfare = tfare;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
