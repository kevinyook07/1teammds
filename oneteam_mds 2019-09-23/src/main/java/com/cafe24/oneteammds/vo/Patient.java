package com.cafe24.oneteammds.vo;

public class Patient {

	private String p_id;
	private String p_pw;
	private String h_id;
	private String p_name;
	private String p_gender;
	private String p_birth;
	private String p_phone;
	private String p_addr;
	private String g_name;
	private String g_phone;
	private String a_id;
	private String pr_date;
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getP_pw() {
		return p_pw;
	}
	public void setP_pw(String p_pw) {
		this.p_pw = p_pw;
	}
	public String getH_id() {
		return h_id;
	}
	public void setH_id(String h_id) {
		this.h_id = h_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_gender() {
		return p_gender;
	}
	public void setP_gender(String p_gender) {
		this.p_gender = p_gender;
	}
	public String getP_birth() {
		return p_birth;
	}
	public void setP_birth(String p_birth) {
		this.p_birth = p_birth;
	}
	public String getP_phone() {
		return p_phone;
	}
	public void setP_phone(String p_phone) {
		this.p_phone = p_phone;
	}
	public String getP_addr() {
		return p_addr;
	}
	public void setP_addr(String p_addr) {
		this.p_addr = p_addr;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getG_phone() {
		return g_phone;
	}
	public void setG_phone(String g_phone) {
		this.g_phone = g_phone;
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public String getPr_date() {
		return pr_date;
	}
	public void setPr_date(String pr_date) {
		this.pr_date = pr_date;
	}
	@Override
	public String toString() {
		return "Patient [p_id=" + p_id + ", p_pw=" + p_pw + ", h_id=" + h_id + ", p_name=" + p_name + ", p_gender="
				+ p_gender + ", p_birth=" + p_birth + ", p_phone=" + p_phone + ", p_addr=" + p_addr + ", g_name="
				+ g_name + ", g_phone=" + g_phone + ", a_id=" + a_id + ", pr_date=" + pr_date + "]";
	}
	
	
	
	
}
