package org.cts.bean;

public class Login {
private String name,pwd;

	public Login(String name, String pwd) {
		this.name=name;
		this.pwd=pwd;
		
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
