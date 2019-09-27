package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.DrinkingMapper;
import com.cafe24.oneteammds.vo.Drinking;
import com.cafe24.oneteammds.vo.Drinkingh;

@Service
@Transactional
public class DrinkingService {

	@Autowired
	private DrinkingMapper drinkingMapper;

	// 병원
	public List<Drinkingh> getDrinkinghList() {
		return drinkingMapper.getDrinkinghList();
	}

	public Drinkingh getDrinkinghById(String patientId) {
		return drinkingMapper.getDrinkinghById(patientId);
	}

	public int getDrinkingRegist(Drinking drinking) {
		return drinkingMapper.getDrinkingRegist(drinking);
	}

	// 시스템 DB
	public List<Drinking> getDrinkingdbList() {
		return drinkingMapper.getDrinkingdbList();
	}

	public List<Drinkingh> getDrinkingSearchList(String sk, String sv) {

		List<Drinkingh> list = drinkingMapper.getDrinkingSearchList(sk, sv);

		return list;
	}

	public int delDrinking(String dcCode, String hospitalId, String patientId) {

		return drinkingMapper.delDrinking(dcCode, hospitalId, patientId);
	}
}
