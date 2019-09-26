package com.cafe24.oneteammds.vo;

public class Drinking {

	private String dcCode;
	private String hospitalId;
	private String patientId;
	private String dccName;
	private String pDoctor;
	private String adminId;
	private String dcrDate;
	public String getDcCode() {
		return dcCode;
	}
	public void setDcCode(String dcCode) {
		this.dcCode = dcCode;
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
	public String getDccName() {
		return dccName;
	}
	public void setDccName(String dccName) {
		this.dccName = dccName;
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
	public String getDcrDate() {
		return dcrDate;
	}
	public void setDcrDate(String dcrDate) {
		this.dcrDate = dcrDate;
	}
	@Override
	public String toString() {
		return "Drinking [dcCode=" + dcCode + ", hospitalId=" + hospitalId + ", patientId=" + patientId + ", dccName="
				+ dccName + ", pDoctor=" + pDoctor + ", adminId=" + adminId + ", dcrDate=" + dcrDate + "]";
	}
	
	
}
