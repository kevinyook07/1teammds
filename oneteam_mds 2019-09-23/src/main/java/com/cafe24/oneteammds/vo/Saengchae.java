package com.cafe24.oneteammds.vo;

public class Saengchae {

	private String vscCode;
	private String hospitalId;
	private String patientId;
	private String vscHeight;
	private String vscWeight;
	private String bpMin;
	private String bpMax;
	private String bheat;
	private String pDoctor;
	private String vscCheck;
	private String adminId;
	private String vscrDate;
	public String getVscCode() {
		return vscCode;
	}
	public void setVscCode(String vscCode) {
		this.vscCode = vscCode;
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
	public String getVscHeight() {
		return vscHeight;
	}
	public void setVscHeight(String vscHeight) {
		this.vscHeight = vscHeight;
	}
	public String getVscWeight() {
		return vscWeight;
	}
	public void setVscWeight(String vscWeight) {
		this.vscWeight = vscWeight;
	}
	public String getBpMin() {
		return bpMin;
	}
	public void setBpMin(String bpMin) {
		this.bpMin = bpMin;
	}
	public String getBpMax() {
		return bpMax;
	}
	public void setBpMax(String bpMax) {
		this.bpMax = bpMax;
	}
	public String getBheat() {
		return bheat;
	}
	public void setBheat(String bheat) {
		this.bheat = bheat;
	}
	public String getpDoctor() {
		return pDoctor;
	}
	public void setpDoctor(String pDoctor) {
		this.pDoctor = pDoctor;
	}
	public String getVscCheck() {
		return vscCheck;
	}
	public void setVscCheck(String vscCheck) {
		this.vscCheck = vscCheck;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getVscrDate() {
		return vscrDate;
	}
	public void setVscrDate(String vscrDate) {
		this.vscrDate = vscrDate;
	}
	@Override
	public String toString() {
		return "Saengchae [vscCode=" + vscCode + ", hospitalId=" + hospitalId + ", patientId=" + patientId
				+ ", vscHeight=" + vscHeight + ", vscWeight=" + vscWeight + ", bpMin=" + bpMin + ", bpMax=" + bpMax
				+ ", bheat=" + bheat + ", pDoctor=" + pDoctor + ", vscCheck=" + vscCheck + ", adminId=" + adminId
				+ ", vscrDate=" + vscrDate + "]";
	}
	
}
