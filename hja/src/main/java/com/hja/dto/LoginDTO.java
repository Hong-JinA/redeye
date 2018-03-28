package com.hja.dto;

public class LoginDTO {
	
	private String uid;
	private String upw;
	private boolean useCookie;

	
	public void setUid(String uid) {
		this.uid=uid;
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setUpw(String upw) {
		this.upw=upw;
	}
	
	public String getUpw() {
		return upw;
	}
	
	public void setUseCookie(boolean useCookie) {
		this.useCookie = useCookie;
	}

	public boolean getUseCookie() {
		return useCookie;
	}

	

}

