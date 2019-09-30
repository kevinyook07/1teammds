package com.cafe24.oneteammds.hservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.hmapper.AllergyhA_Mapper;
import com.cafe24.oneteammds.vo.Allergy;
import com.cafe24.oneteammds.vo.Allergyh;

@Service
@Transactional
public class AllergyhA_Service {

	@Autowired
	private AllergyhA_Mapper allergyhA_Mapper;

	// 병원
	public List<Allergyh> getAllergyhA_List() {
		return allergyhA_Mapper.getAllergyhA_List();
	}

	public Allergyh getAllergyhA_ById(String patientId) {
		return allergyhA_Mapper.getAllergyhA_ById(patientId);
	}

	public int getAllergyhA_Regist(Allergy allergy) {
		return allergyhA_Mapper.getAllergyhA_Regist(allergy);
	}

	public List<Allergyh> getAllergyhA_SearchList1(String sk1, String sv1) {

		List<Allergyh> list = allergyhA_Mapper.getAllergyhA_SearchList1(sk1, sv1);

		return list;
	}
	
}
