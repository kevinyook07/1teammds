package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Gumche;
import com.cafe24.oneteammds.vo.Gumcheh;





@Mapper
public interface GumcheMapper {
	
	// 병원
	public List<Gumcheh> getGumchehList();
	
	public Gumcheh getGumchehById(String patientId);
	  
	public int getGumcheRegist(Gumche gumche);
	 
	public List<Gumcheh> getGumcheSearchList (String sk, String sv);
	// 시스템DB 
	public List<Gumche> getGumchedbList();
	 
	public int delGumche(String strCode, String hospitalId, String patientId);
	
	
	
}
