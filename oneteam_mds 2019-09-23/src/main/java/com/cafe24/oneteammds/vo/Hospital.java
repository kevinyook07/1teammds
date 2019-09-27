package com.cafe24.oneteammds.vo;

public class Hospital {

	private String h_id;
	private String h_pw;
	private String h_name;
	private String a_id;
	private String hr_date;
	public String getH_id() {
		return h_id;
	}
	public void setH_id(String h_id) {
		this.h_id = h_id;
	}
	public String getH_pw() {
		return h_pw;
	}
	public void setH_pw(String h_pw) {
		this.h_pw = h_pw;
	}
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public String getHr_date() {
		return hr_date;
	}
	public void setHr_date(String hr_date) {
		this.hr_date = hr_date;
	}
	@Override
	public String toString() {
		return "Hospital [h_id=" + h_id + ", h_pw=" + h_pw + ", h_name=" + h_name + ", a_id=" + a_id + ", hr_date="
				+ hr_date + "]";
	}
	
	

	
}
