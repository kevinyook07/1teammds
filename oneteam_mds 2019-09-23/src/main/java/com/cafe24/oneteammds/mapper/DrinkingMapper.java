package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Drinking;
import com.cafe24.oneteammds.vo.Drinkingh;




@Mapper
public interface DrinkingMapper {
	
	// 병원
	public List<Drinkingh> getDrinkinghList();
	
	public Drinkingh getDrinkinghById(String patientId);
	  
	public int getDrinkingRegist(Drinking drinking);
	 
	public List<Drinkingh> getDrinkingSearchList (String sk, String sv);
	
	// 시스템DB 
	public List<Drinking> getDrinkingdbList();
	
	public int delDrinking(String dcCode, String hospitalId, String patientId);
	
	
	
	
}
