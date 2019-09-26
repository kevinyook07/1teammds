package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.AllergyMapper;
import com.cafe24.oneteammds.vo.Allergy;
import com.cafe24.oneteammds.vo.Allergyh;




@Service
@Transactional
public class AllergyService {

	@Autowired
	private AllergyMapper allergyMapper;
	
	// 병원
	public List<Allergyh> getAllergyhList(){
		return allergyMapper.getAllergyhList();
	}
	
	public Allergyh getAllergyhById(String patientId) { 
		return allergyMapper.getAllergyhById(patientId); }
	  
	public int getAllergyRegist(Allergy allergy) { 
		return allergyMapper.getAllergyRegist(allergy);
	} 
	
	// 시스템 DB 
	public List<Allergy> getAllergydbList(){ 
		return allergyMapper.getAllergydbList(); 
	}
	 
}
