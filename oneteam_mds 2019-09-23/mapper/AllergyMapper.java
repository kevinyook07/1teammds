package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Allergy;
import com.cafe24.oneteammds.vo.Allergyh;




@Mapper
public interface AllergyMapper {
	
	// 병원
	public List<Allergyh> getAllergyhList();
	
	public Allergyh getAllergyhById(String patientId);
	  
	public int getAllergyRegist(Allergy allergy);
	  
	// 시스템DB 
	public List<Allergy> getAllergydbList();
	 
	
	public List<Allergy> getAllergySearchList1 (String sk1, String sv1);
	
	/* public List<Allergy> getAllergySearchList2 (String sk2, String sv2); */
	
	public int delAllergy(String aseCode, String hospitalId, String patientId);
}
