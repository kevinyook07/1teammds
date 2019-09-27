package com.cafe24.oneteammds.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.HospitalMapper;
import com.cafe24.oneteammds.vo.Hospital;





@Service
@Transactional
public class HospitalService {

	@Autowired
	private HospitalMapper hospitalMapper;
	
	public Map<String, Object> getHospitalLogin(Hospital hospital) {
		
		String result = "";
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		Hospital hospitalCheck = hospitalMapper.getHospitalLogin(hospital);
		
		if(hospitalCheck == null) {
			Hospital hospitalIdCheck = hospitalMapper.getHospitalById(
					hospital.getH_id());
			if(hospitalIdCheck == null) {
				result = "등록된 아이디의 정보가 없습니다.";
			}else {
				result = "비밀번호가 일치하지 않습니다.";
			}

		}else {
			result = "로그인 성공";
			map.put("loginHospital", hospitalCheck);
		}
		
		map.put("result", result);
		
		return map;
	}
	
	public List<Hospital> getHospitalList(){
		List<Hospital> list = hospitalMapper.getHospitalList();
		return list;
	}
	
	public List<Hospital> getHospitalSearchList(String sk2, String sv2){
		List<Hospital> list = hospitalMapper.getHospitalSearchList(sk2, sv2);
		
		return list;
	}
	
	public int addHospital(Hospital hospital) {
		int result = hospitalMapper.addHospital(hospital);
		return result;
	}
	
	public Hospital getHospitalById(String h_id) {
		
		return hospitalMapper.getHospitalById(h_id);
	}
	
	public int modifyHospital(Hospital hospital) {
		return hospitalMapper.modifyHospital(hospital);
	}
	
	public int deleteHospital(String h_id, String h_pw) {
		return hospitalMapper.delHospital(h_id, h_pw);
	}
	
}
