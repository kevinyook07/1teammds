package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Allergy;
import com.cafe24.oneteammds.vo.Ginueng;
import com.cafe24.oneteammds.vo.Jindan;
import com.cafe24.oneteammds.vo.Jindanh;
import com.cafe24.oneteammds.vo.Yakmul;


@Mapper
public interface JindanMapper {
	
	
	// 병원
	public List<Jindanh> getJindanhList();
	
	public Jindanh getJindanhById(String patientId);
	  
	public int getJindanRegist(Jindan jindan);
	  
	// 시스템DB 
	public List<Jindan> getJindandbList();
	

	
	public int delJindan(String dbCode, String hospitalId, String patientId);
	
	

	/*
	 * public List<Allergy> allergyList();
	 * 
	 * public List<Jindan> diagnosisBreakdownList();
	 * 
	 * public List<Ginueng> functionalList();
	 * 
	 * public List<Yakmul> medicationBreakdownList();
	 */
	
	
	
	
	
	
	
	public List<Jindan> getJindanSearchList (String sk, String sv);
}
