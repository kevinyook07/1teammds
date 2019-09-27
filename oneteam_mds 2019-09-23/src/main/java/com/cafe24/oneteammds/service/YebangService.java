package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.YebangMapper;
import com.cafe24.oneteammds.vo.Yebang;
import com.cafe24.oneteammds.vo.Yebangh;

@Service
@Transactional
public class YebangService {

	@Autowired
	private YebangMapper yebangMapper;

	// 병원
	public List<Yebangh> getYebanghList() {
		return yebangMapper.getYebanghList();
	}

	public Yebangh getYebanghById(String patientId) {
		return yebangMapper.getYebanghById(patientId);
	}

	public int getYebangRegist(Yebang yebang) {
		return yebangMapper.getYebangRegist(yebang);
	}

	// 시스템 DB
	public List<Yebang> getYebangdbList() {
		return yebangMapper.getYebangdbList();
	}

	public List<Yebangh> getYebangSearchList(String sk, String sv) {

		List<Yebangh> list = yebangMapper.getYebangSearchList(sk, sv);

		return list;
	}

	public int delYebang(String pibCode, String hospitalId, String patientId) {

		return yebangMapper.delYebang(pibCode, hospitalId, patientId);
	}

}
