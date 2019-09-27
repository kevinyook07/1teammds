package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.SaengchaeMapper;
import com.cafe24.oneteammds.vo.Saengchae;
import com.cafe24.oneteammds.vo.Saengchaeh;

@Service
@Transactional
public class SaengchaeService {

	@Autowired
	private SaengchaeMapper saengchaeMapper;

	// 병원
	public List<Saengchaeh> getSaengchaehList() {
		return saengchaeMapper.getSaengchaehList();
	}

	public Saengchaeh getSaengchaehById(String patientId) {
		return saengchaeMapper.getSaengchaehById(patientId);
	}

	public int getSaengchaeRegist(Saengchae saengchae) {
		return saengchaeMapper.getSaengchaeRegist(saengchae);
	}

	// 시스템 DB
	public List<Saengchae> getSaengchaedbList() {
		return saengchaeMapper.getSaengchaedbList();
	}

	public List<Saengchaeh> getSaengchaeSearchList(String sk, String sv) {

		List<Saengchaeh> list = saengchaeMapper.getSaengchaeSearchList(sk, sv);

		return list;
	}

	public int delSaengchae(String vscCode, String hospitalId, String patientId) {

		return saengchaeMapper.delSaengchae(vscCode, hospitalId, patientId);
	}
}
