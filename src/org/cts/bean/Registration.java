package org.cts.bean;

public class Registration {
	private String name, mail, pwd1, pwd2, dob, address, gender, contact,
			ssnname;
	private int ssn;

	public Registration(String name, String mail, String pwd1, String pwd2,
			String dob, String address, String gender, String contact, int ssn,
			String ssnname) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.dob = dob;
		this.gender = gender;
		this.mail = mail;
		this.pwd1 = pwd1;
		this.pwd2 = pwd2;
		this.ssn = ssn;
		this.ssnname = ssnname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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

}
