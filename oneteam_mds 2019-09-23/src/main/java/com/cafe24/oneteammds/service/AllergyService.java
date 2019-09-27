package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.AllergyMapper;
import com.cafe24.oneteammds.vo.Allergy;
import com.cafe24.oneteammds.vo.Allergyh;

@Service
@Transactional
public class AllergyService {

	@Autowired
	private AllergyMapper allergyMapper;

	// 병원
	public List<Allergyh> getAllergyhList() {
		return allergyMapper.getAllergyhList();
	}

	public Allergyh getAllergyhById(String patientId) {
		return allergyMapper.getAllergyhById(patientId);
	}

	public int getAllergyRegist(Allergy allergy) {
		return allergyMapper.getAllergyRegist(allergy);
	}

	// 시스템 DB
	public List<Allergy> getAllergydbList() {
		return allergyMapper.getAllergydbList();
	}

	public List<Allergyh> getAllergySearchList1(String sk1, String sv1) {

		List<Allergyh> list = allergyMapper.getAllergySearchList1(sk1, sv1);

		return list;
	}
	
	/*
	 * public List<Allergy> getAllergySearchList2(String sk2, String sv2) {
	 * 
	 * List<Allergy> list = allergyMapper.getAllergySearchList2(sk2, sv2);
	 * 
	 * return list; }
	 */

	public int delAllergy(String aseCode, String hospitalId, String patientId) {

		return allergyMapper.delAllergy(aseCode, hospitalId, patientId);
	}
}
