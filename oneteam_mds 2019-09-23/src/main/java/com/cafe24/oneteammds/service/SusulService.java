package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.SusulMapper;
import com.cafe24.oneteammds.vo.Susul;
import com.cafe24.oneteammds.vo.Susulh;

@Service
@Transactional
public class SusulService {

	@Autowired
	private SusulMapper susulMapper;

	// 병원
	public List<Susulh> getSusulhList() {
		return susulMapper.getSusulhList();
	}

	public Susulh getSusulhById(String patientId) {
		return susulMapper.getSusulhById(patientId);
	}

	public int getSusulRegist(Susul susul) {
		return susulMapper.getSusulRegist(susul);
	}

	// 시스템 DB
	public List<Susul> getSusuldbList() {
		return susulMapper.getSusuldbList();
	}

	public List<Susulh> getSusulSearchList(String sk, String sv) {

		List<Susulh> list = susulMapper.getSusulSearchList(sk, sv);

		return list;
	}

	public int delSusul(String sbCode, String hospitalId, String patientId) {

		return susulMapper.delSusul(sbCode, hospitalId, patientId);
	}
}
