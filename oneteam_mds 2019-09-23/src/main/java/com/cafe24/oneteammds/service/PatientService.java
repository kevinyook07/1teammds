package com.cafe24.oneteammds.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.PatientMapper;
import com.cafe24.oneteammds.vo.Patient;





@Service
@Transactional
public class PatientService {

	@Autowired
	private PatientMapper patientMapper;
	
	public Map<String, Object> getPatientLogin(Patient patient) {
		
		String result = "";
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		Patient patientCheck = patientMapper.getPatientLogin(patient);
		
		if(patientCheck == null) {
			Patient patientIdCheck = patientMapper.getPatientById(
					patient.getP_id());
			if(patientIdCheck == null) {
				result = "등록된 아이디의 정보가 없습니다.";
			}else {
				result = "비밀번호가 일치하지 않습니다.";
			}

		}else {
			result = "로그인 성공";
			map.put("loginPatient", patientCheck);
		}
		
		map.put("result", result);
		
		return map;
	}
	
	public List<Patient> getPatientList(){
		List<Patient> list = patientMapper.getPatientList();
		return list;
	}
	
	public List<Patient> getPatientSearchList(String sk3, String sv3){
		List<Patient> list = patientMapper.getPatientSearchList(sk3, sv3);
		
		return list;
	}
	
	public int addPatient(Patient patient) {
		int result = patientMapper.addPatient(patient);
		return result;
	}
	
	public Patient getPatientById(String p_id) {
		
		return patientMapper.getPatientById(p_id);
	}
	
	public int modifyPatient(Patient patient) {
		return patientMapper.modifyPatient(patient);
	}
	
	public int deletePatient(String p_id, String p_pw) {
		return patientMapper.delPatient(p_id, p_pw);
	}
}
