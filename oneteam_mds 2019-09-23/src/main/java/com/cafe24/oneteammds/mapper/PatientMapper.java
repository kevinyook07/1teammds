package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Patient;




@Mapper
public interface PatientMapper {

	public List<Patient> getPatientList();
	
	public int addPatient(Patient patient);
	
	public Patient getPatientById(String p_id);
	
	public int modifyPatient (Patient patient);
	
	public int delPatient(String p_id, String p_pw);
	
	public Patient getPatientLogin(Patient patient);
	
	public List<Patient> getPatientSearchList (String sk3, String sv3);
}
