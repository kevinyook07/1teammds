package com.cafe24.oneteammds.vo;

public class Smokingh {

	private String scCode;
	private String hospitalId;
	private String patientId;
	private String sccName;
	private String pDoctor;
	private String adminId;
	private String scrDate;
	public String getScCode() {
		return scCode;
	}
	public void setScCode(String scCode) {
		this.scCode = scCode;
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
	public String getSccName() {
		return sccName;
	}
	public void setSccName(String sccName) {
		this.sccName = sccName;
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
	public String getScrDate() {
		return scrDate;
	}
	public void setScrDate(String scrDate) {
		this.scrDate = scrDate;
	}
	@Override
	public String toString() {
		return "Smokingh [scCode=" + scCode + ", hospitalId=" + hospitalId + ", patientId=" + patientId + ", sccName="
				+ sccName + ", pDoctor=" + pDoctor + ", adminId=" + adminId + ", scrDate=" + scrDate + "]";
	}
	
}
