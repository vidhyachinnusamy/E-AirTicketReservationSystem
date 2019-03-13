package org.cts.bean;

public class Booking {
	private String flight,cid;
	private int seat;
public Booking(String flight,String cid,int seat)
{
	this.cid=cid;
	this.flight=flight;
	this.seat=seat;
}
public String getFlight() {
	return flight;
}
public void setFlight(String flight) {
	this.flight = flight;
}
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public int getSeat() {
	return seat;
}
public void setSeat(int seat) {
	this.seat = seat;
}
}
