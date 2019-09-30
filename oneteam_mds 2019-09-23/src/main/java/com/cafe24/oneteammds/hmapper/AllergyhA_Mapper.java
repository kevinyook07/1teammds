package com.cafe24.oneteammds.hmapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Allergy;
import com.cafe24.oneteammds.vo.Allergyh;




@Mapper
public interface AllergyhA_Mapper {
	
	// 병원
	public List<Allergyh> getAllergyhA_List();
	
	public Allergyh getAllergyhA_ById(String patientId);
	  
	public int getAllergyhA_Regist(Allergy allergy);
	
	//병원 검색.
	public List<Allergyh> getAllergyhA_SearchList1 (String sk1, String sv1);
}
