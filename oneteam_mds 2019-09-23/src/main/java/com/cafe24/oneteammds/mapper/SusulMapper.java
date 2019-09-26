package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Susul;
import com.cafe24.oneteammds.vo.Susulh;




@Mapper
public interface SusulMapper {
	
	// 병원
	public List<Susulh> getSusulhList();
	
	public Susulh getSusulhById(String patientId);
	  
	public int getSusulRegist(Susul susul);
	  
	// 시스템DB 
	public List<Susul> getSusuldbList();
	 
	
}
