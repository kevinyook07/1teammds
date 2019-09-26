package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.YakmulMapper;
import com.cafe24.oneteammds.vo.Yakmul;
import com.cafe24.oneteammds.vo.Yakmulh;



@Service
@Transactional
public class YakmulService {

	@Autowired
	private YakmulMapper yakmulMapper;
	
	// 병원
		public List<Yakmulh> getYakmulhList(){
			return yakmulMapper.getYakmulhList();
		}
		
		public Yakmulh getYakmulhById(String patientId) { 
			return yakmulMapper.getYakmulhById(patientId); }
		  
		public int getYakmulRegist(Yakmul yakmul) { 
			return yakmulMapper.getYakmulRegist(yakmul);
		} 
		
		// 시스템 DB 
		public List<Yakmul> getYakmuldbList(){ 
			return yakmulMapper.getYakmuldbList(); 
		}
}
