package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.GinuengMapper;
import com.cafe24.oneteammds.vo.Ginueng;
import com.cafe24.oneteammds.vo.Ginuengh;




@Service
@Transactional
public class GinuengService {

	@Autowired
	private GinuengMapper ginuengMapper;
	
	// 병원
	public List<Ginuengh> getGinuenghList(){
		return ginuengMapper.getGinuenghList();
	}
	
	public Ginuengh getGinuenghById(String patientId) { 
		return ginuengMapper.getGinuenghById(patientId); }
	  
	public int getGinuengRegist(Ginueng ginueng) { 
		return ginuengMapper.getGinuengRegist(ginueng);
	} 
	
	// 시스템 DB 
	public List<Ginueng> getGinuengdbList(){ 
		return ginuengMapper.getGinuengdbList(); 
	}
	 
}
