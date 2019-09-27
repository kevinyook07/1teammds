package com.cafe24.oneteammds.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.JindanMapper;
import com.cafe24.oneteammds.vo.Allergy;
import com.cafe24.oneteammds.vo.Ginueng;
import com.cafe24.oneteammds.vo.Jindan;
import com.cafe24.oneteammds.vo.Jindanh;
import com.cafe24.oneteammds.vo.Yakmul;

@Service
@Transactional
public class JindanService {

	@Autowired
	private JindanMapper jindanMapper;

	// 병원
	public List<Jindanh> getJindanhList() {
		return jindanMapper.getJindanhList();
	}

	public Jindanh getJindanhById(String patientId) {
		return jindanMapper.getJindanhById(patientId);
	}

	public int getJindanRegist(Jindan jindan) {
		return jindanMapper.getJindanRegist(jindan);
	}

	// 시스템 DB
	public List<Jindan> getJindandbList() {
		return jindanMapper.getJindandbList();
	}

	/*
	 * @Autowired private JindanMapper diagnosisMapper;
	 * 
	 * public Map<String, Object> medicalList(){ Map<String, Object> map = new
	 * HashMap<String, Object>();
	 * 
	 * List<Allergy> list = diagnosisMapper.allergyList(); List<Jindan> dlist =
	 * diagnosisMapper.diagnosisBreakdownList(); List<Ginueng> flist =
	 * diagnosisMapper.functionalList(); List<Yakmul> mlist =
	 * diagnosisMapper.medicationBreakdownList();
	 * 
	 * map.put("allergyList", list); map.put("diagnosisBreakdownList", dlist);
	 * map.put("functionalList", flist); map.put("medicationBreakdownList", mlist);
	 * 
	 * return map; }
	 */

	public List<Jindanh> getJindanSearchList(String sk, String sv) {
		List<Jindanh> list = jindanMapper.getJindanSearchList(sk, sv);

		return list;
	}

	/*
	 * public int delJindan(String dbCode, String hospitalId, String patientId) {
	 * 
	 * return jindanMapper.delJindan(dbCode, hospitalId, patientId); }
	 */
}
