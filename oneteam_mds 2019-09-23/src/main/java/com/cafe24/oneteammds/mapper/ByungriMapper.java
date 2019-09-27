package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Byungri;
import com.cafe24.oneteammds.vo.Byungrih;




@Mapper
public interface ByungriMapper {
	
	// 병원
	public List<Byungrih> getByungrihList();
	
	public Byungrih getByungrihById(String patientId);
	  
	public int getByungriRegist(Byungri byungri);
	  
	public List<Byungrih> getByungriSearchList (String sk, String sv);
	// 시스템DB 
	public List<Byungri> getByungridbList();
	 
	public int delByungri(String ptrCode, String hospitalId, String patientId);
	
	
	
	
}
