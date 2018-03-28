package com.hja.domain;

import java.util.Date;

public class MemberVO {
	
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_email;
	private Date regdate;
	private Date updatedate;
	
	public void setM_id(String m_id) {
		this.m_id=m_id;
	}
	
	public String getM_id() {
		return m_id;
	}
	
	public void setM_pw(String m_pw) {
		this.m_pw=m_pw;
	}
	
	public String getM_pw() {
		return m_pw;
	}
	
	public void setM_name(String m_name) {
		this.m_name=m_name;
	}
	
	public String getM_name() {
		return m_name;
	}
	
	public void setM_eamil(String m_email) {
		this.m_email=m_email;
	}
	
	public String getM_email() {
		return m_email;
	}
	
	public void setRegdate(Date regdate) {
		this.regdate=regdate;
	}
	
	public Date getRegdate() {
		return regdate;
	}
	
	public void setUpdatedate(Date updatedate) {
		this.updatedate=updatedate;
	}
	
	public Date getUpdatedate() {
		return updatedate;
	}
	

}
