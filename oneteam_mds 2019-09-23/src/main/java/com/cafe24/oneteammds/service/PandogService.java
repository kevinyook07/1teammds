package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.PandogMapper;
import com.cafe24.oneteammds.vo.Pandog;
import com.cafe24.oneteammds.vo.Pandogh;




@Service
@Transactional
public class PandogService {

	@Autowired
	private PandogMapper pandogMapper;
	
	// 병원
	public List<Pandogh> getPandoghList(){
		return pandogMapper.getPandoghList();
	}
	
	public Pandogh getPandoghById(String patientId) { 
		return pandogMapper.getPandoghById(patientId); }
	  
	public int getPandogRegist(Pandog pandog) { 
		return pandogMapper.getPandogRegist(pandog);
	} 
	
	// 시스템 DB 
	public List<Pandog> getPandogdbList(){ 
		return pandogMapper.getPandogdbList(); 
	}
	 
}
