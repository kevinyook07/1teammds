package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.ByungriMapper;
import com.cafe24.oneteammds.vo.Byungri;
import com.cafe24.oneteammds.vo.Byungrih;




@Service
@Transactional
public class ByungriService {

	@Autowired
	private ByungriMapper byungriMapper;
	
	// 병원
	public List<Byungrih> getByungrihList(){
		return byungriMapper.getByungrihList();
	}
	
	public Byungrih getByungrihById(String patientId) { 
		return byungriMapper.getByungrihById(patientId); }
	  
	public int getByungriRegist(Byungri byungri) { 
		return byungriMapper.getByungriRegist(byungri);
	} 
	
	// 시스템 DB 
	public List<Byungri> getByungridbList(){ 
		return byungriMapper.getByungridbList(); 
	}
	 
}
