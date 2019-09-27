package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.GumcheMapper;
import com.cafe24.oneteammds.vo.Gumche;
import com.cafe24.oneteammds.vo.Gumcheh;

@Service
@Transactional
public class GumcheService {

	@Autowired
	private GumcheMapper gumcheMapper;

	// 병원
	public List<Gumcheh> getGumchehList() {
		return gumcheMapper.getGumchehList();
	}

	public Gumcheh getGumchehById(String patientId) {
		return gumcheMapper.getGumchehById(patientId);
	}

	public int getGumcheRegist(Gumche gumche) {
		return gumcheMapper.getGumcheRegist(gumche);
	}

	// 시스템 DB
	public List<Gumche> getGumchedbList() {
		return gumcheMapper.getGumchedbList();
	}

	public List<Gumcheh> getGumcheSearchList(String sk, String sv) {
		List<Gumcheh> list = gumcheMapper.getGumcheSearchList(sk, sv);

		return list;
	}

	public int delGumche(String strCode, String hospitalId, String patientId) {

		return gumcheMapper.delGumche(strCode, hospitalId, patientId);
	}
}
