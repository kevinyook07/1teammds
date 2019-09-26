package com.cafe24.oneteammds.vo;

public class Jindan {
	private String dbCode;
	private String hospitalId;
	private String patientId;
	private String dName;
	private String dCode;
	private String dDate;
	private String pDoctor;
	private String adminId;
	private String drDate;
	public String getDbCode() {
		return dbCode;
	}
	public void setDbCode(String dbCode) {
		this.dbCode = dbCode;
	}
	public String getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdCode() {
		return dCode;
	}
	public void setdCode(String dCode) {
		this.dCode = dCode;
	}
	public String getdDate() {
		return dDate;
	}
	public void setdDate(String dDate) {
		this.dDate = dDate;
	}
	public String getpDoctor() {
		return pDoctor;
	}
	public void setpDoctor(String pDoctor) {
		this.pDoctor = pDoctor;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getDrDate() {
		return drDate;
	}
	public void setDrDate(String drDate) {
		this.drDate = drDate;
	}
	@Override
	public String toString() {
		return "DiagnosisBreakdown [dbCode=" + dbCode + ", hospitalId=" + hospitalId + ", patientId=" + patientId
				+ ", dName=" + dName + ", dCode=" + dCode + ", dDate=" + dDate + ", pDoctor=" + pDoctor + ", adminId="
				+ adminId + ", drDate=" + drDate + "]";
	}
	
	
	
	
}	