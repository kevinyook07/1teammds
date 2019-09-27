package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Junyum;
import com.cafe24.oneteammds.vo.Junyumh;





@Mapper
public interface JunyumMapper {
	
	// 병원
	public List<Junyumh> getJunyumhList();
	
	public Junyumh getJunyumhById(String patientId);
	  
	public int getJunyumRegist(Junyum junyum);
	  
	// 시스템DB 
	public List<Junyum> getJunyumdbList();
	
	
	public int delJunyum(String lcidCode, String hospitalId, String patientId);
	
	public List<Junyumh> getJunyumSearchList (String sk, String sv);
	
}
