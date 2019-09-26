package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.YoungsangMapper;
import com.cafe24.oneteammds.vo.Youngsang;
import com.cafe24.oneteammds.vo.Youngsangh;




@Service
@Transactional
public class YoungsangService {

	@Autowired
	private YoungsangMapper youngsangMapper;
	
	// 병원
	public List<Youngsangh> getYoungsanghList(){
		return youngsangMapper.getYoungsanghList();
	}
	
	public Youngsangh getYoungsanghById(String patientId) { 
		return youngsangMapper.getYoungsanghById(patientId); }
	  
	public int getYoungsangRegist(Youngsang youngsang) { 
		return youngsangMapper.getYoungsangRegist(youngsang);
	} 
	
	// 시스템 DB 
	public List<Youngsang> getYoungsangdbList(){ 
		return youngsangMapper.getYoungsangdbList(); 
	}
	 
}
