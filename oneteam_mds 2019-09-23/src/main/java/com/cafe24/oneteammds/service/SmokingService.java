package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.SmokingMapper;
import com.cafe24.oneteammds.vo.Smoking;
import com.cafe24.oneteammds.vo.Smokingh;




@Service
@Transactional
public class SmokingService {

	@Autowired
	private SmokingMapper smokingMapper;
	
	// 병원
	public List<Smokingh> getSmokinghList(){
		return smokingMapper.getSmokinghList();
	}
	
	public Smokingh getSmokinghById(String patientId) { 
		return smokingMapper.getSmokinghById(patientId); }
	  
	public int getSmokingRegist(Smoking smoking) { 
		return smokingMapper.getSmokingRegist(smoking);
	} 
	
	// 시스템 DB 
	public List<Smoking> getSmokingdbList(){ 
		return smokingMapper.getSmokingdbList(); 
	}
	 
}
