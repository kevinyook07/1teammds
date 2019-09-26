package com.cafe24.oneteammds.vo;

public class Allergyh {

	private String aseCode;
	private String hospitalId;
	private String patientId;
	private String asemFactor;
	private String asemfCode;
	private String aseName;
	private String aseReaction;
	private String pDoctor;
	private String asedTime;
	private String adminId;
	private String aserDate;
	public String getAseCode() {
		return aseCode;
	}
	public void setAseCode(String aseCode) {
		this.aseCode = aseCode;
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
	public String getAsemFactor() {
		return asemFactor;
	}
	public void setAsemFactor(String asemFactor) {
		this.asemFactor = asemFactor;
	}
	public String getAsemfCode() {
		return asemfCode;
	}
	public void setAsemfCode(String asemfCode) {
		this.asemfCode = asemfCode;
	}
	public String getAseName() {
		return aseName;
	}
	public void setAseName(String aseName) {
		this.aseName = aseName;
	}
	public String getAseReaction() {
		return aseReaction;
	}
	public void setAseReaction(String aseReaction) {
		this.aseReaction = aseReaction;
	}
	public String getpDoctor() {
		return pDoctor;
	}
	public void setpDoctor(String pDoctor) {
		this.pDoctor = pDoctor;
	}
	public String getAsedTime() {
		return asedTime;
	}
	public void setAsedTime(String asedTime) {
		this.asedTime = asedTime;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAserDate() {
		return aserDate;
	}
	public void setAserDate(String aserDate) {
		this.aserDate = aserDate;
	}
	@Override
	public String toString() {
		return "Allergyh [aseCode=" + aseCode + ", hospitalId=" + hospitalId + ", patientId=" + patientId
				+ ", asemFactor=" + asemFactor + ", asemfCode=" + asemfCode + ", aseName=" + aseName + ", aseReaction="
				+ aseReaction + ", pDoctor=" + pDoctor + ", asedTime=" + asedTime + ", adminId=" + adminId
				+ ", aserDate=" + aserDate + "]";
	}
	
}
