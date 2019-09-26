package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.JunyumMapper;
import com.cafe24.oneteammds.vo.Junyum;
import com.cafe24.oneteammds.vo.Junyumh;




@Service
@Transactional
public class JunyumService {

	@Autowired
	private JunyumMapper junyumMapper;
	
	// 병원
	public List<Junyumh> getJunyumhList(){
		return junyumMapper.getJunyumhList();
	}
	
	public Junyumh getJunyumhById(String patientId) { 
		return junyumMapper.getJunyumhById(patientId); }
	  
	public int getJunyumRegist(Junyum junyum) { 
		return junyumMapper.getJunyumRegist(junyum);
	} 
	
	// 시스템 DB 
	public List<Junyum> getJunyumdbList(){ 
		return junyumMapper.getJunyumdbList(); 
	}
	 
}
