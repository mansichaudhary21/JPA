package com.model;

public class Admin_Login {

	private String unm;
	private String psw;
	
	public Admin_Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin_Login(String unm, String psw) {
		super();
		this.unm = unm;
		this.psw = psw;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	@Override
	public String toString() {
		return "Admin_Login [unm=" + unm + ", psw=" + psw + "]";
	}
	
}
