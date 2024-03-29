package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Ginueng;
import com.cafe24.oneteammds.vo.Ginuengh;




@Mapper
public interface GinuengMapper {
	
	// 병원
	public List<Ginuengh> getGinuenghList();
	
	public Ginuengh getGinuenghById(String patientId);
	  
	public int getGinuengRegist(Ginueng ginueng);
	 
	public List<Ginuengh> getGinuengSearchList (String sk, String sv);
	// 시스템DB 
	public List<Ginueng> getGinuengdbList();
	 
	public int delGinueng(String ftrCode, String hospitalId, String patientId);
	
	
	
	
}
