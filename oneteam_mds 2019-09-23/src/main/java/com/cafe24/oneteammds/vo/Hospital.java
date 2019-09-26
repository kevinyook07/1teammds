package com.cafe24.oneteammds.vo;

public class Hospital {
	private String hospitalId;
	private String hospitalPw;
	private String hName;
	private String admId;
	private String hrDate;
	public String getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalPw() {
		return hospitalPw;
	}
	public void setHospitalPw(String hospitalPw) {
		this.hospitalPw = hospitalPw;
	}
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public String getAdmId() {
		return admId;
	}
	public void setAdmId(String admId) {
		this.admId = admId;
	}
	public String getHrDate() {
		return hrDate;
	}
	public void setHrDate(String hrDate) {
		this.hrDate = hrDate;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalPw=" + hospitalPw + ", hName=" + hName + ", admId="
				+ admId + ", hrDate=" + hrDate + "]";
	}
	
	

}
