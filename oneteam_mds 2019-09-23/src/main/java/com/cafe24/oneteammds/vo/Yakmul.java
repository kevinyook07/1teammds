package com.cafe24.oneteammds.vo;

public class Yakmul {
	private String mbCode;
	private String hospitalId;
	private String patientId;
	private String mmName;
	private String mmCode;
	private String miName;
	private String miCode;
	private String mVolume;
	private String mdUnit;
	private String mdNumber;
	private String mPeriod;
	private String mUsage;
	private String pDoctor;
	private String mdTime;
	private String adminId;
	private String mrDate;
	public String getMbCode() {
		return mbCode;
	}
	public void setMbCode(String mbCode) {
		this.mbCode = mbCode;
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
	public String getMmName() {
		return mmName;
	}
	public void setMmName(String mmName) {
		this.mmName = mmName;
	}
	public String getMmCode() {
		return mmCode;
	}
	public void setMmCode(String mmCode) {
		this.mmCode = mmCode;
	}
	public String getMiName() {
		return miName;
	}
	public void setMiName(String miName) {
		this.miName = miName;
	}
	public String getMiCode() {
		return miCode;
	}
	public void setMiCode(String miCode) {
		this.miCode = miCode;
	}
	public String getmVolume() {
		return mVolume;
	}
	public void setmVolume(String mVolume) {
		this.mVolume = mVolume;
	}
	public String getMdUnit() {
		return mdUnit;
	}
	public void setMdUnit(String mdUnit) {
		this.mdUnit = mdUnit;
	}
	public String getMdNumber() {
		return mdNumber;
	}
	public void setMdNumber(String mdNumber) {
		this.mdNumber = mdNumber;
	}
	public String getmPeriod() {
		return mPeriod;
	}
	public void setmPeriod(String mPeriod) {
		this.mPeriod = mPeriod;
	}
	public String getmUsage() {
		return mUsage;
	}
	public void setmUsage(String mUsage) {
		this.mUsage = mUsage;
	}
	public String getpDoctor() {
		return pDoctor;
	}
	public void setpDoctor(String pDoctor) {
		this.pDoctor = pDoctor;
	}
	public String getMdTime() {
		return mdTime;
	}
	public void setMdTime(String mdTime) {
		this.mdTime = mdTime;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getMrDate() {
		return mrDate;
	}
	public void setMrDate(String mrDate) {
		this.mrDate = mrDate;
	}
	@Override
	public String toString() {
		return "MedicationBreakdown [mbCode=" + mbCode + ", hospitalId=" + hospitalId + ", patientId=" + patientId
				+ ", mmName=" + mmName + ", mmCode=" + mmCode + ", miName=" + miName + ", miCode=" + miCode
				+ ", mVolume=" + mVolume + ", mdUnit=" + mdUnit + ", mdNumber=" + mdNumber + ", mPeriod=" + mPeriod
				+ ", mUsage=" + mUsage + ", pDoctor=" + pDoctor + ", mdTime=" + mdTime + ", adminId=" + adminId
				+ ", mrDate=" + mrDate + "]";
	}
	
}
