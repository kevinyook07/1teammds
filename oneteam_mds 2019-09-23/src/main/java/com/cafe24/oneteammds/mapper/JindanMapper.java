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

	public List<Jindan> getJindandbList();
	
	
	public List<Jindanh> getJindanSearchList (String sk, String sv);
}
