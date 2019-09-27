package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Youngsang;
import com.cafe24.oneteammds.vo.Youngsangh;




@Mapper
public interface YoungsangMapper {
	
	// 병원
	public List<Youngsangh> getYoungsanghList();
	
	public Youngsangh getYoungsanghById(String patientId);
	  
	public int getYoungsangRegist(Youngsang youngsang);
	  
	// 시스템DB 
	public List<Youngsang> getYoungsangdbList();
	 

	public List<Youngsangh> getYoungsangSearchList (String sk, String sv);
	
	public int delYoungsang(String itrCode, String hospitalId, String patientId);
	
}
