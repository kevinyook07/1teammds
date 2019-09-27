package com.cafe24.oneteammds.vo;

public class Admin {

	private String a_id;
	private String a_pw;
	private String a_name;
	private String a_birth;
	private String a_gender;
	private String a_addr;
	private String a_phone;
	private String a_level;
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public String getA_pw() {
		return a_pw;
	}
	public void setA_pw(String a_pw) {
		this.a_pw = a_pw;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getA_birth() {
		return a_birth;
	}
	public void setA_birth(String a_birth) {
		this.a_birth = a_birth;
	}
	public String getA_gender() {
		return a_gender;
	}
	public void setA_gender(String a_gender) {
		this.a_gender = a_gender;
	}
	public String getA_addr() {
		return a_addr;
	}
	public void setA_addr(String a_addr) {
		this.a_addr = a_addr;
	}
	public String getA_phone() {
		return a_phone;
	}
	public void setA_phone(String a_phone) {
		this.a_phone = a_phone;
	}
	public String getA_level() {
		return a_level;
	}
	public void setA_level(String a_level) {
		this.a_level = a_level;
	}
	@Override
	public String toString() {
		return "Admin [a_id=" + a_id + ", a_pw=" + a_pw + ", a_name=" + a_name + ", a_birth=" + a_birth + ", a_gender="
				+ a_gender + ", a_addr=" + a_addr + ", a_phone=" + a_phone + ", a_level=" + a_level + "]";
	}
	
	
	
	
}
