package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Pandog;
import com.cafe24.oneteammds.vo.Pandogh;





@Mapper
public interface PandogMapper {
	
	// 병원
	public List<Pandogh> getPandoghList();
	
	public Pandogh getPandoghById(String patientId);
	  
	public int getPandogRegist(Pandog pandog);
	  
	// 시스템DB 
	public List<Pandog> getPandogdbList();
	 
	
}
