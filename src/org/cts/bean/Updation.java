package org.cts.bean;

public class Updation {
	private String pwd1, pwd2, dob, address, gender, contact, ssnname, email;
	private int ssn;

	public Updation(String pwd1, String pwd2, String dob, String address,
			String gender, String contact, int ssn, String ssnname, String n) {
		this.setEmail(n);
		this.address = address;
		this.contact = contact;
		this.dob = dob;
		this.gender = gender;
		this.pwd1 = pwd1;
		this.pwd2 = pwd2;
		this.ssn = ssn;
		this.ssnname = ssnname;
	}

	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	public String getPwd2() {
		return pwd2;
	}

	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getSsnname() {
		return ssnname;
	}

	public void setSsnname(String ssnname) {
		this.ssnname = ssnname;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
