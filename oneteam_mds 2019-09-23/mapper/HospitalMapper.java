package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Hospital;




@Mapper
public interface HospitalMapper {

	public List<Hospital> getHospitalList();
	
	public int addHospital(Hospital hospital);
	
	public Hospital getHospitalById(String h_id);
	
	public int modifyHospital (Hospital hospital);
	
	public int delHospital(String h_id, String h_pw);
	
	public Hospital getHospitalLogin(Hospital hospital);
	
	public List<Hospital> getHospitalSearchList (String sk2, String sv2);
}
