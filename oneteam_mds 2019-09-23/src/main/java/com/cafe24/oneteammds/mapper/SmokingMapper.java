package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Smoking;
import com.cafe24.oneteammds.vo.Smokingh;




@Mapper
public interface SmokingMapper {
	
	// 병원
	public List<Smokingh> getSmokinghList();
	
	public Smokingh getSmokinghById(String patientId);
	  
	public int getSmokingRegist(Smoking smoking);
	  
	// 시스템DB 
	public List<Smoking> getSmokingdbList();
	 
	
}
