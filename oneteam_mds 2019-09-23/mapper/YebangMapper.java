package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Yebang;
import com.cafe24.oneteammds.vo.Yebangh;




@Mapper
public interface YebangMapper {
	
	// 병원
	public List<Yebangh> getYebanghList();
	
	public Yebangh getYebanghById(String patientId);
	  
	public int getYebangRegist(Yebang yebang);
	  
	// 시스템DB 
	public List<Yebang> getYebangdbList();
	 
	public List<Yebang> getYebangSearchList (String sk, String sv);
	
	public int delYebang(String pibCode, String hospitalId, String patientId);
}
