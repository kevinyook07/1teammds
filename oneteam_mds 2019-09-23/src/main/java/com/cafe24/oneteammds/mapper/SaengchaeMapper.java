package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Saengchae;
import com.cafe24.oneteammds.vo.Saengchaeh;




@Mapper
public interface SaengchaeMapper {
	
	// 병원
	public List<Saengchaeh> getSaengchaehList();
	
	public Saengchaeh getSaengchaehById(String patientId);
	  
	public int getSaengchaeRegist(Saengchae saengchae);
	  
	// 시스템DB 
	public List<Saengchae> getSaengchaedbList();
	 
	
}
